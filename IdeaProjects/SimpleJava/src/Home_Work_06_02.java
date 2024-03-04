import java.util.Scanner;

public class Home_Work_06_02 {
    public static void main(String[] args) {
        System.out.println("Please enter a password");
        System.out.println("A password must have at least eight characters");
        System.out.println("A password must contain only letters and digits");
        System.out.println("A password must contain at least two digits");

        Scanner scanner = new Scanner(System.in);
        String passWord = scanner.next();
    }

    public static void checkPassword(String passWord ) {

    }
}
