import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
			
		while (true){
		    try {
		System.out.print("enter your age:");
	   int age = input.nextInt();
		input.nextLine();
		break;
				        
		    } catch (InputMismatchException e) {
		        System.out.println("invalid input plss enter a number");
		        input.nextLine();
		        
		        
		        System.out.println("your age is: " + age );
		    }
		}
		
		
	}
}