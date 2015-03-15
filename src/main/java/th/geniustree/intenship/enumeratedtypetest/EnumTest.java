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
public class EnumTest {
    
    public static void main(String[] args) {
        TrafficSignal theLight = TrafficSignal.GO;
        switch(theLight){
            case STOP:
                System.out.println("red");
                break;
            case CAUTION:
                System.out.println("yellow");
                break;
            case GO:
                System.out.println("green");
                break;
        }
    }
    public enum TrafficSignal {
        STOP,CAUTION,GO
    };
}
