import java.util.Scanner;

public class Main {   
    public static void main(String[] args) {
               
               
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many pizzas do you want: ");
        int quantity = input.nextInt();
        double price = 20.0;
        double total = quantity * price;
        System.out.println("The total is £" + total);
    }
}