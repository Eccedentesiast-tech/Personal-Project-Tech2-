import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("OPERATOR");
        String[] name = {"/", "*", "+", "-"};
        for (String operator : name) {
            System.out.println(operator);
        }
        System.out.print("Chose your operator: ");
        char operator = input.next().charAt(0);
        input.nextLine();
    }
}