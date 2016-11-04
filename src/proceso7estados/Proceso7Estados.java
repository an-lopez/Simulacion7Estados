/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proceso7estados;
import java.util.Calendar;
import java.util.Random;
/**
 *
 * @author Yue
 */
public class Proceso7Estados{
    private QueueListaLigadaGeneralizada<Process> queue;
    private Calendar calendar;
    
    
    public Proceso7Estados() {
        calendar= Calendar.getInstance();
        queue=new QueueListaLigadaGeneralizada();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimulacionGUI().setVisible(true);
            }
        });
        
    }
    
    public void crearProceso(){
        Process process=new Process();
        Calendar tmp=(Calendar) calendar.clone();
        int i=Randomize(10,1);
        if(queue.isEmpty()){
            process.setID("1"+i+"0");
            calendar.add(Calendar.MINUTE,2);
        }else{
            int id;
            String tmp2;
            tmp2="1"+i+"0";
            if(verificarID(Integer.parseInt(tmp2)))
                process.setID(tmp2);
            else{
                tmp2=i+""+i+"0";
                if(verificarID(Integer.parseInt(tmp2)))
                    process.setID(tmp2);
                else{
                    tmp2=i+""+i+""+i;
                    if(verificarID(Integer.parseInt(tmp2)))
                        process.setID(tmp2);
                    else    
                        tmp2=(i+1)+""+(i-1)+""+(i+2);
                }
            }
            process.setID(tmp2);
            process.setHIP(Clock(calendar));
            calendar.add(Calendar.SECOND, Randomize(60,30));
        }
        tmp.add(Calendar.MINUTE,2);
        process.setHIP(Clock(calendar));
        process.setTTP(""+Randomize(120,60));
        process.setQuantum("5");
        process.setPri(""+Randomize(10,0));
        process.setStatus("N/A");
        process.setSuc1(""+Resource(Randomize(4,1)));
        tmp.add(Calendar.SECOND, Randomize(60,30));
        process.setHisuc1(Clock(tmp));
        process.setTtsuc1(""+Randomize(40,20));
        process.setSuc2(""+Resource(Randomize(4,1)));
        tmp.add(Calendar.SECOND, Randomize(60,30));
        process.setHisuc2(Clock(tmp));
        process.setTtsuc2(""+Randomize(40,20));
        tmp.add(Calendar.SECOND,Randomize(60,30));
        process.setHibs(Clock(tmp));
        process.setTtbs(""+Randomize(40,20));
        tmp.add(Calendar.SECOND,Randomize(60,30));
        process.setHils(Clock(tmp));
        process.setTtls(""+Randomize(40,20));
        queue.enqueue(process); //Genera cola de procesos.
    }
    
    public  String Clock(Calendar calendar){
        int hour, minute, second;
        hour=calendar.get(Calendar.HOUR);
        minute=calendar.get(Calendar.MINUTE);
        second=calendar.get(Calendar.SECOND);
        return ""+zero(hour)+":"+zero(minute)+":"+zero(second);
    }
    
    private String zero(int number){
        String num=(number<10)?"0"+number:""+number;
        return num;
    }
    
    private int Resource(int i){
        switch(i){
            case 1:
                return 30;
            case 2:
                return 40;
            case 3:
                return 50;
            case 4:
                return 20;
        }
        return 0;
    }
    
    private int Randomize(int x, int y){
        int valor;
        Random rnd=new Random();
        valor=rnd.nextInt(x-y)+y;
        return valor;
    }
    
    public Process[] cargarProcesos(){
        QueueListaLigadaGeneralizada<Process> tmp=new QueueListaLigadaGeneralizada(queue); //Copia de Procesos.
        Process[] pro=new Process[tmp.getTamano()]; //Arreglo de Procesos.
        for (int i = 0; i < pro.length; i++)
            pro[i]=tmp.dequeue();
        return pro;
    }
    
    private boolean verificarID(int id){
        Process[] pro=cargarProcesos();
        for (Process pro1 : pro)
            if (Integer.parseInt(pro1.getID()) == id)
                return false;
        return true;
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public void  cargarReloj(){
        calendar=Calendar.getInstance();
    }
}
