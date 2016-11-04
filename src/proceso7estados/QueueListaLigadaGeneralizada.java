/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proceso7estados;
import java.util.EmptyStackException;
import java.util.Scanner;
/**
 *
 * @author Yue
 */
public class QueueListaLigadaGeneralizada<Item>{
    private Nodo head, tail;
    private int N;
    
    private class Nodo{
        Item item;
        Nodo next;
    }

    public QueueListaLigadaGeneralizada(){
    }

    public QueueListaLigadaGeneralizada(QueueListaLigadaGeneralizada queue) {
        head=queue.head;
        tail=queue.tail;
        N=queue.getTamano();
    }
    
    public void enqueue(Item nodo){
        Nodo tmp=new Nodo();
        tmp.item=nodo;
        tmp.next=null;
        if(head==null){
            head=tmp;
            tail=tmp;
        }else{
            tail.next=tmp; //Apunta al Nodo anterior.
            tail=tmp; //Nuevo Nodo con campo null.
        }
        N++;
    }
    
    public Item dequeue() throws EmptyStackException{
        if(head==null)
            throw new EmptyStackException();
        Nodo tmp=head;
        head=head.next;
        N--;
        return tmp.item;
    }
    
    public Item getLast() throws EmptyStackException{
        if(head==null)
            throw new EmptyStackException();
        return tail.item;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public int getTamano(){
        return N;
    }
    
}
