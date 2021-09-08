package com.sg.foundations.scanner;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        String noun1, adjective1, noun2, adjective2, pluralNoun1, pluralNoun2, pluralNoun3, presentVerb, pastVerb;
        
        System.out.println("Let's play MAD LIBS!");
        
        System.out.println("I need a noun: ");
        noun1 = scan.nextLine();
        System.out.println("Now an adjective: ");
        adjective1 = scan.nextLine();
        System.out.println("Another noun: ");
        noun2 = scan.nextLine();
        System.out.println("And a number: ");
        number = scan.nextInt();
        scan.nextLine(); //consuming the \n
        System.out.println("Another adjective: ");
        adjective2 = scan.nextLine();
        System.out.println("A plural noun: ");
        pluralNoun1 = scan.nextLine();
        System.out.println("Another one: ");
        pluralNoun2 = scan.nextLine();
        System.out.println("One more: ");
        pluralNoun3 = scan.nextLine();
        System.out.println("A verb (infinitive form): ");
        presentVerb = scan.nextLine();
        System.out.println("Same verb (past participle): ");
        pastVerb = scan.nextLine();
        
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println("The " + noun1 + " was " + adjective1 + ". There was also a " + noun2 + " who was friends with " + number + " " + adjective2 + 
                " " + pluralNoun1 + ". Each of those " +  pluralNoun1 + " also had their own " + pluralNoun2 + " and " + pluralNoun3 + ". These friends all lived together, " +
                presentVerb + " all the time in memory of their old friends who " + pastVerb + " many years ago.");
        
           
    }
}
