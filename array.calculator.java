import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Calculator in java");
		System.out.println("OPERATOR");
		String[] name = {"divide:/","times:*","plus:+","minus:-"};
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		System.out.print("what is your first number: ");
		double n1 = input.nextDouble();
		input.nextLine();
		
		char operator;
		while (true) {		
				System.out.print("chose your operator: ");
				operator = input.next().charAt(0);
				input.nextLine();
				if (operator == '/' || operator == '*' || operator == '-' || operator == '+') {
					break;
				} else {
					System.out.println("invalid operator,,,plss put the correct operator ");
    				}					
				}			
		System.out.print("what is your second number: ");
		double n2 = input.nextDouble();
		input.nextLine();
		
		double result;
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
			if (n2 !=0) {
				result = n1 / n2;
			} else {
				System.out.println("error: devide by zero!");
				return;				
			}
			break;
			default:
			System.out.println("invalid operator!");
			return;						
		}	
		System.out.println("the result is " + result);			
	}
}