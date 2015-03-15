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
public class EnumTestLoop {

        public enum TrafficSignal {

            STOP, CAUTION, GO
        };

        public static void main(String[] args) {
            for (TrafficSignal t : TrafficSignal.values()) {
                System.out.println(t);
            }
        }
    }
