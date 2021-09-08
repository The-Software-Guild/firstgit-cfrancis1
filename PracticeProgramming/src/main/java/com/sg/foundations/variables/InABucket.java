package com.sg.foundations.variables;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

public class InABucket {
    public static void main(String [] args) {
        String walrus;
        double piesEaten;
        float weightOfTeacupPie;
        int grainsOfSand;
        
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        weightOfTeacupPie = 3456789;
        grainsOfSand = 1000;
        

        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
        System.out.println("The weight of the pie is: " + weightOfTeacupPie);
        System.out.println("There are " + grainsOfSand + " grains of sand.");
    }
}
