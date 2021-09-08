package com.sg.foundations.scanner;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

import java.util.Scanner;

public class QuestForTheUserInput {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        String yourName, yourQuest;
        double velocityOfSwallow;
        //using nextLine
        System.out.println("What is your name?? ");
        yourName = scan.nextLine();

        System.out.println("What is your quest?! ");
        yourQuest = scan.nextLine();

        System.out.println("What is the airspeed velocity of an unladen swallow?!?! ");
        velocityOfSwallow = Double.parseDouble(scan.nextLine());

        System.out.println("\nHow do you know " + velocityOfSwallow + " is correct, " + yourName + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + yourQuest + ".");
    }
}
