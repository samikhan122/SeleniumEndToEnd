import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);
        int num;

        if (Character.isLetter(ch)) {
            ch = Character.toUpperCase(ch);
            if (ch >= 'A' && ch <= 'C') {
                num = 2;
            } else if (ch >= 'D' && ch <= 'F') {
                num = 3;
            } else if (ch >= 'G' && ch <= 'I') {
                num = 4;
            } else if (ch >= 'J' && ch <= 'L') {
                num = 5;
            } else if (ch >= 'M' && ch <= 'O') {
                num = 6;
            } else if (ch >= 'P' && ch <= 'S') {
                num = 7;
            } else if (ch >= 'T' && ch <= 'V') {
                num = 8;
            } else {
                num = 9;
            }
            System.out.println("The corresponding number is: " + num);
        } else {
            System.out.println("Invalid input.");
        }
    }
}

