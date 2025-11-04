/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radiosveglia;

/**
 *
 * @author bernicchi.davide
 */
public class Orario {
    private int min = 00;
    private int ore = 00;
    
    Orario(int o, int m){
        min = m;
        ore = o;
    }
    
    public String get_time(){
        if (ore < 10 && min < 10){
            return "0" + ore + ":0" +min;
        }
        else if (ore < 10 && min > 10){
            return "0" + ore + ":" +min;
        }
        else if (ore > 10 && min < 10){
            return "" + ore + ":0" +min;
        }
        else {
            return  ore + ":" +min;
        }
    }
    public void set_min(int a){
        min=a;
    }
    public int get_min(){
        return min;
    }    
    public int get_ora(){
        return ore;
    }
    public void aumentoMinuti() {
        min++;
    }
    public void aumentoOre() {
        ore++;
    }

    public void set_ora(int i) {
        ore = i;
    }
}
