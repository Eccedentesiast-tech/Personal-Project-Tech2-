import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("enter your age: ");
		int age = input.nextInt();
		input.nextLine();
		boolean Isverified = true;
		
		if (age >=19) { System.out.println("you have access");
		
		      if (Isverified) System.out.println("Qualified");
		      else System.out.println("not qualified ");

		} else { System.out.println("access denied ");
		
		}						
	}
}