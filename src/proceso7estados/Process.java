/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proceso7estados;
/**
 *
 * @author Yue
 */
public class Process {
    private String ID, HIP, TTP, quantum, pri, status, suc1, hisuc1, ttsuc1, suc2, hisuc2, ttsuc2, hibs, ttbs, hils, ttls, rm;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHIP() {
        return HIP;
    }

    public void setHIP(String HIP) {
        this.HIP = HIP;
    }

    public String getTTP() {
        return TTP;
    }

    public void setTTP(String TTP) {
        this.TTP = TTP;
    }

    public String getQuantum() {
        return quantum;
    }

    public void setQuantum(String quantum) {
        this.quantum = quantum;
    }

    public String getPri() {
        return pri;
    }

    public void setPri(String pri) {
        this.pri = pri;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSuc1() {
        return suc1;
    }

    public void setSuc1(String suc1) {
        this.suc1 = suc1;
    }

    public String getHisuc1() {
        return hisuc1;
    }

    public void setHisuc1(String hisuc1) {
        this.hisuc1 = hisuc1;
    }

    public String getTtsuc1() {
        return ttsuc1;
    }

    public void setTtsuc1(String ttsuc1) {
        this.ttsuc1 = ttsuc1;
    }

    public String getSuc2() {
        return suc2;
    }

    public void setSuc2(String suc2) {
        this.suc2 = suc2;
    }

    public String getHisuc2() {
        return hisuc2;
    }

    public void setHisuc2(String hisuc2) {
        this.hisuc2 = hisuc2;
    }

    public String getTtsuc2() {
        return ttsuc2;
    }

    public void setTtsuc2(String ttsuc2) {
        this.ttsuc2 = ttsuc2;
    }

    public String getHibs() {
        return hibs;
    }

    public void setHibs(String hibs) {
        this.hibs = hibs;
    }

    public String getTtbs() {
        return ttbs;
    }

    public void setTtbs(String ttbs) {
        this.ttbs = ttbs;
    }

    public String getHils() {
        return hils;
    }

    public void setHils(String hils) {
        this.hils = hils;
    }

    public String getTtls() {
        return ttls;
    }

    public void setTtls(String ttls) {
        this.ttls = ttls;
    }

    public Object[] regresarProceso(){
        Object[] obj={ID, HIP, TTP, quantum, pri, status, suc1, hisuc1, ttsuc1, suc2, hisuc2, ttsuc2, hibs, ttbs, hils, ttls, rm};
        return obj;
    }
}
