package com.sg.foundations.scanner;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

import java.util.Scanner;

public class BiggerBetterAdder {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        int val1, val2, val3;
        
        
        System.out.println("Enter number 1: ");
        val1 = scan.nextInt();

        System.out.println("Enter number 2: ");
        val2 = scan.nextInt();
        
        System.out.println("Enter number 3: ");
        val3 = scan.nextInt();
        
        int total = val1 + val2 + val3;
        System.out.println(val1 + " + " + val2 + " + " + val3 + " = " + total);
    }
}
