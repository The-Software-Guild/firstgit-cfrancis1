package com.sg.foundations.scanner;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String [] args) {
        String triviaQ1, triviaQ2, triviaQ3, triviaQ4;
        String triviaA1, triviaA2, triviaA3, triviaA4;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a trivia question: ");
        triviaQ1 = scan.nextLine();
        System.out.println("Enter the answer: ");
        triviaA1 = scan.nextLine();
        System.out.println("Please enter a trivia question: ");
        triviaQ2 = scan.nextLine();
        System.out.println("Enter the answer: ");
        triviaA2 = scan.nextLine();
        System.out.println("Please enter a trivia question: ");
        triviaQ3 = scan.nextLine();
        System.out.println("Enter the answer: ");
        triviaA3 = scan.nextLine();
        System.out.println("Please enter a trivia question: ");
        triviaQ4 = scan.nextLine();
        System.out.println("Enter the answer: ");
        triviaA4 = scan.nextLine();
        
        System.out.println("Just to confirm, these are your trivia facts?");
        System.out.println(triviaQ4 + " " + triviaA2);
        System.out.println(triviaQ1 + " " + triviaA3);
        System.out.println(triviaQ2 + " " + triviaA1);
        System.out.println(triviaQ3 + " " + triviaA4);
    }
}
