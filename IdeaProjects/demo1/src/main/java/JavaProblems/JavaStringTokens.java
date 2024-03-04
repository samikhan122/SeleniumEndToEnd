package JavaProblems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().trim(); // .trim takes out the whitespaces beofre and after
        scanner.close();

        if (string.isEmpty())
            System.out.println("0");

        else {
            String[] array = string.split("[ !,?\\.\\_'@]+");

            System.out.println(array.length);

            for (int i = 0; i < array.length && array[i] != null; ++i)
                System.out.println(array[i]);
        }
    }

}

