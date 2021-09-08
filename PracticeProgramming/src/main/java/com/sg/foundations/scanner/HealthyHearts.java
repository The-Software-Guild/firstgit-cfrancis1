package com.sg.foundations.scanner;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        int age;
        
        
        System.out.println("What is your age: ");
        age = scan.nextInt();
        System.out.println("Your maximum heart rate should be " + (220-age) + " beats per minute.");
        double low = ((220-age)*.5);
        double high = ((220-age)*.85);
        System.out.println("Your target HR Zone is " + Math.round(low) + " - " + Math.round(high) + " beats per minute.");
    }
}
