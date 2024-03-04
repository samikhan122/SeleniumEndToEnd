import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class ArrayListWithScannerClass {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> people =
                new ArrayList<String>();
        Scanner scan =
                new Scanner(new File("src/test/java/Names"));
        while (scan.hasNext()) {
            people.add(scan.nextLine());
        }
       // people.remove(0);
        //people.add(2, "Jim Newton");
        for (String name : people) {
            out.println(name);
        }
        scan.close();


    }
}
/**
 * ArrayList<String> people =
 * new ArrayList<String>();
 * Scanner diskScanner =
 * new Scanner(new File("names.txt"));
 * while (diskScanner.hasNext()) {
 * people.add(diskScanner.nextLine());
 * }
 * people.remove(0);
 * people.add(2, "Jim Newton");
 * for (String name : people) {
 * out.println(name);
 * }
 * diskScanner.close();
 *
 *
 * ***/