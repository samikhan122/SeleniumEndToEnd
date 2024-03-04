package Warmup2;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("program is started");
        System.out.println("Program is in progress");

        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        try { // where ever the exception is causing use the try block
            System.out.println(100 / num);
        } catch (
                ArithmeticException e) { //ArithmeticException is an exception that we know that we have and we set a variable
            //System.out.println("ArithmeticException is visible");
            System.out.println(e.getMessage());

            System.out.println("Program is completed");
            System.out.println("Program has been exited");
        }

    }
}