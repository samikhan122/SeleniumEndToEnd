package Warmup2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Social Security number (in the format DDD-DD-DDDD): ");
        String ssn = input.nextLine();

        if (Pattern.matches("\\d{3}-\\d{2}-\\d{4}", ssn)) {
            System.out.println(ssn + " Valid Social Security number.");
        } else {
            System.out.println(ssn + " Invalid Social Security number format.");
        }
    }
}

