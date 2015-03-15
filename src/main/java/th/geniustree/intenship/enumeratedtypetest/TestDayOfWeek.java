/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intenship.enumeratedtypetest;

/**
 *
 * @author User
 */
public class TestDayOfWeek {
    public static void main(String[] args) {
            System.out.println(DayOfWeek.FRIDAY.getDay());
            
        }
    
    public enum DayOfWeek{
        SUNDAY("Sunday"),
        MONDAY("Monday"),
        TUESDAY("Tuesday"),
        WEDNESDAY("Wednesday"),
        THURSDAY("Thursday"),
        FRIDAY("Friday"),
        SATURDAY("Saturday");
        
        private final String day;
        
        private DayOfWeek(String str){
            this.day=str;
        }
        public String getDay(){
            return day;
        }
    }
}
    
    
