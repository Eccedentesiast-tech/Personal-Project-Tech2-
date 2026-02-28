import java.util.Scanner;
import java.util.InputMismatchException;


 public class main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Calculator in Java");
        System.out.println("OPERATOR");
        String[] name = {"divide:/", "times:*", "plus:+", "minus:-"};
        for ( int i = 0; i < name.length; i++) {
        	System.out.println(name [i]);
        }
        
        double n1;
        while (true) {
            try {
                System.out.print("What is your 'n1' first number: ");
                n1 = input.nextDouble();
                input.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }
        }
                
        char operator;
        while (true) {
            System.out.print("Choose your operator: ");
            operator = input.next().charAt(0);
            input.nextLine();
            if (operator == '/' || operator == '*' || operator == '-' || operator == '+') {
                break;
            } else {
                System.out.println("Invalid operator. Please enter a valid operator");
            }
        } 
               
        double n2;
        while (true) {
            try {
                System.out.print("What is your 'n2' second number: ");
                n2 = input.nextDouble();
                input.nextLine();            
                break;
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }
        }
                
        double result = 0;
        switch (operator) {
            case '+':
                result = n1 + n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '/':
                if ( n2 != 0 ){
                	result = n1 / n2;
                	System.out.println("invalid divide by zero!");
                } else {
                	break;
                	
                	
                }                               
            }    
        System.out.println("The result is: " + result);
        
    }
}