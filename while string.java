import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Yes to exit: ");
            System.out.print("Enter your answer: ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("You are correct!");
                break;
            } else {
                System.out.println("You are incorrect.");
            }
        }
    }
}