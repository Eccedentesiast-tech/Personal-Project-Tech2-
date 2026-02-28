import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		while (true){
		System.out.print("Math: ");
		int math = input.nextInt();
		input.nextLine();
		
			
		System.out.print("Science: ");
		int science = input.nextInt();
		input.nextLine();
		
			
		System.out.print("Filipino: ");
		int filipino = input.nextInt();
		input.nextLine();
		
			
		System.out.print("Mapeh: ");
		int mapeh = input.nextInt();
		input.nextLine();
		
		int average = (math + science + filipino + mapeh) / 4;
		
		System.out.println("your average grade is " + average);
		
		if (average > 100){
		    System.out.println("invalid average grade ");
		} else if (average >= 98){
		    System.out.println("with highest honor");
		} else if (average >= 95){
		    System.out.println("with high honor");
		} else if (average >= 90){
		    System.out.println("with honor");
		} else if (average >= 75){
		    System.out.println("normal grade");		   		    		    
		} else {
		    System.out.println("Basak ka");
		}
		
		System.out.print    ("do you want another run (y/n): ");
		String Another = input.nextLine();
		if (Another.equals("y")){	
			       	    	  	
	  	}
   	}							
	}
}