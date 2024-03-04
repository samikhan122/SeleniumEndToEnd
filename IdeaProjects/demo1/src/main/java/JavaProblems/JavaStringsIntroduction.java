package JavaProblems;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();


        System.out.println(a.length() + b.length());
        if (a.compareTo(b) <= 0) System.out.println("No");
        else
            System.out.println("yes");
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1));


    }

    public void reverseAndCheck() {
        Scanner sc = new Scanner(System.in);
        String sc1 = sc.next();
        String sc2 = sc.next();

        System.out.println(sc1.length()+ sc2.length());
        if(sc1.compareTo(sc2)<=0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        System.out.println(sc1.substring(0,1).toUpperCase());


    }

}
