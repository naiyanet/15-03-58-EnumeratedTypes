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
public class EnumConstructorTest {

    public enum TrafficSignal {

        STOP("red"), CAUTION("yellow"), GO("green");
        private final String light;
        private TrafficSignal(String t) {
            light = t;
        }

        public String format(String message) {
            return message + " " + light;
        }
    }

    public static void main(String[] args) {
        System.out.println(TrafficSignal.GO.format("The light is"));
        System.out.println(TrafficSignal.STOP.format("The light is"));
    }
}
