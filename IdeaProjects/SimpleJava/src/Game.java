import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
        int user = input.nextInt();

        int computer = (int) (Math.random() * 3);

        if (user == computer) {
            System.out.println("It's a draw.");
        } else if (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose.");
        }
    }
}

