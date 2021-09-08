package com.sg.foundations.scanner;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

import java.util.Scanner;

public class DoItBetter {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        int miles, hotDogs, languages;
        
        System.out.println("How many miles can you run? ");
        miles = scan.nextInt();
        System.out.println("Ha, thats nothing. I can run " + ((miles * 2) + 1) + ".");

        System.out.println("How many hot dogs can you eat? ");
        hotDogs = scan.nextInt();
        System.out.println("Ha, thats nothing. I can eat " + ((hotDogs * 2) + 1) + ".");
        
        System.out.println("How many languages can you speak? ");
        languages = scan.nextInt();
        System.out.println("Ha, thats nothing. I can speak " + ((languages * 2) + 1) + ".");
        
    }
}
