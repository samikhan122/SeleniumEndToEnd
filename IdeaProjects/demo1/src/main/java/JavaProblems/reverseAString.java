package JavaProblems;

import java.util.Scanner;

public class reverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();


        int n = A.length();
        for (int i = 0; i < n / 2; i++) {
            if (A.charAt(i) != A.charAt(n - i - 1)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;
    }


    public void reverseP() {
        Scanner sc = new Scanner(System.in);
        String rev = sc.next();

        int n = rev.length();
        for(int i = rev.length()-1;i<n /2 ; i--){
            if(rev.charAt(i) != rev.charAt(n - i -1 )){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
