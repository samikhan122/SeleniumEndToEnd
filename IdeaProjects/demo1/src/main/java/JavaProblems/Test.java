package JavaProblems;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        System.out.println(a.length() + b.length());
        if(a.compareTo(b)<=0){
            System.out.println("no");
        }else{
            System.out.println("Yes");
        }
        System.out.println(a.substring(0,1).toUpperCase()+ a.substring(1));
    }
}
