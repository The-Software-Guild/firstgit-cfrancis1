package com.sg.foundations.variables;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

public class MenuOfChampions {
    public static void main(String [] args) {
        String food1 = "Pizza", food2 = "Pasta", food3 = "Burrito";
        double foodPrice1 = 2.25, foodPrice2 = 3.33, foodPrice3 = 4.99;
        
        System.out.println(".<O>.<O>.<O>.<O>.<O>.<O>.<O>.<O>.<O>.<O>.\n");
        System.out.println("     WELCOME TO RESTAURANT FRANCISO!     ");
        System.out.println("     Todays Menu Is...\n");
        System.out.println(".<O>.<O>.<O>.<O>.<O>.<O>.<O>.<O>.<O>.<O>.\n");
        System.out.println("     $" + foodPrice1 + " ** " + food1);
        System.out.println("     $" + foodPrice2 + " ** " + food2);
        System.out.println("     $" + foodPrice3 + " ** " + food3);
    }
}
