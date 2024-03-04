package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class y {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {

            System.out.println(ch + ": " + (int) ch);

        }

        for (char ch = '0'; ch <= '9'; ch++) {

            System.out.println(ch + ": " + (int) ch);


        }
        ArrayList<Character> vowels = new ArrayList();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        while (true) {
            System.out.println(vowels);

        }


    }

}
