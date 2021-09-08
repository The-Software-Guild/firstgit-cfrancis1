package com.sg.foundations.scanner;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

import java.util.Scanner;

public class DontForgetToStoreIt {
    public static void main(String [] args) {
        
        int meaningOfLife = 42;
        double pi = 3.14159;
        String cheese, color;

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me pi to at least 5 decimals: ");
        pi = Double.parseDouble(scan.nextLine());

        // used Double.parseDouble but meaningOfLife is an INT so I used Integer.parseInt

        System.out.println("What is the meaning of life, the universe & everything? ");
        meaningOfLife = Integer.parseInt(scan.nextLine());

        System.out.println("What is your favorite kind of cheese? ");
        cheese = scan.nextLine();

        System.out.println("Do you like the color red or blue more? ");
        color = scan.nextLine();

        System.out.println("Ooh, " + color + " " + cheese +" sounds delicious!");
        System.out.println("The circumference of life is " + (2 * pi * meaningOfLife));
    }
}
