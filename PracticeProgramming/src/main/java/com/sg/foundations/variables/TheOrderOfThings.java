package com.sg.foundations.variables;

/**
 *
 * @author: Christian Francis
 * @email: cnfrancis54@gmail.com
 * @date: 09/08/2021
 * @description: *Enter project description here*
 */

public class TheOrderOfThings {
    public static void main(String [] args) {
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
        
        System.out.println(number + " " + origin + " " + material + " " + opinion + " " + size + " " + age + " " + shape + " " + purpose + " " + color + " " + noun);
        
        System.out.println(number + " " + origin + " " + color + " " +noun + " " + material + " " + opinion + " " + size + " " + age + " " + shape + " " + purpose );
    }
}
