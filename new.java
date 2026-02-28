import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		String name;
		int age;
		double weigth;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("what is your name: ");
		name = input.nextLine();
		
		System.out.print("what age are you: ");
		age = input.nextInt();
		
		System.out.print("what is your weigth: ");
		weigth = input.nextDouble();
		
		System.out.print("ang name mo ay " + name
		+ " at edad mo ay " + age + " >at timbang mo naman ay " + weigth);
		
		
		
	}
}