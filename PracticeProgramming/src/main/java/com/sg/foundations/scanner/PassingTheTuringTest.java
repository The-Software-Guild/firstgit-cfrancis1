package com.sg.foundations.scanner;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        String name, color, food;
        int number;
        
        System.out.println("What is your name? ");
        name = scan.nextLine();

        System.out.println("What is your favorite color? ");
        color = scan.nextLine();
        
        System.out.println("Huh " + color + "? I like red.");
        System.out.println("Speaking of red, I really like apples. Whats your favorite food " + name + "? ");
        food = scan.nextLine();
        
        System.out.println("Interesting... Whats your favorite number? ");
        number = scan.nextInt();
        
        System.out.println("WOW! " + number + " is my favorite number too!");
        System.out.println("I really enjoyed talking to you + " + name + ". I hope you have a good day!");
        

     
    }
}
