package com.sg.foundations.variables;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

public class MoreBucketsMoreFun {
    public static void main(String [] args) {
        // Declaring variables
        int butterflies, beetles, bugs;

        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        butterflies--; //This is what is showing the dog ate a bug
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        /*
        The number of bugs does not change because you are only decreasing the amount of 
        butterflies and not changing the bugs variable at all.
        */
        System.out.println("... maybe my computer can't do math, after all!");
    }
}
