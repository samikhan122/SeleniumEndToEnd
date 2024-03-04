package HackerRank;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String you would like to see it reversed");
        String s = scan.nextLine();
        for (int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
