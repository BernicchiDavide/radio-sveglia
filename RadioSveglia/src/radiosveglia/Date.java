/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radiosveglia;

/**
 *
 * @author bernicchi.davide
 */
public class Date {
    String day;
    String month;
    String year;
    
    Date (String d, String m, String y){
        set_day(d);
        set_month(m);
        set_year(y);
    }
    
    void set_day(String d){
        if (Integer.parseInt(d) <= 30){
            day = d;
        }
        else {
            day = "30";
        }
    }    
    void set_month(String m){
        if (Integer.parseInt(m) <= 12){
            month = m;
        }
        else {
            month = "12";
        }
    }    
    void set_year(String y){
        if (y.length() == 4){
            year=y;
        }
        else {
            year= "2025";
        }
    }
    
    String get_data(){
        return day + "/" +month+ "/" +year;
    }
    String get_day(){
        return day;
    }
    String get_month(){
        return month;
    }
    String get_year(){
        return year;
    }
    
    void set_date(String d, String m, String y){
        
        set_day(d);
        set_month(m);
        set_year(y);
    }

    void add_day() {
        day = "" + (Integer.parseInt(day)+1);
        if (Integer.parseInt(day) >= 30){
            this.month= "" + (Integer.parseInt(month)+1);
            day = "1";
            if (Integer.parseInt(month) >= 12) {
                month = "1";
                year = "" + (Integer.parseInt(year)+1);
            }
        }
    }
}
