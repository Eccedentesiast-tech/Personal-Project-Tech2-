import java.util.Scanner;

public class calculator{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("enter n1: ");
		double n1 = input.nextDouble();
		input.nextLine();
		
		System.out.print("select op: ");
		String op = input.next();
		input.nextLine();
		
		
		System.out.print("enter n2:: ");
		double n2 = input.nextDouble();
		input.nextLine();
		
		double result = 0;
		if (op.equals("*")) {
		    result = n1 * n2;	    	    
		   } else if (op.equals("+")) {
		       result = n1 + n2;		       
		   } else if (op.equals("-")) {
		       result = n1 - n2;		       
		   } else if (op.equals("/")) {
		       if (n2 != 0 ){
		           result = n1 / n2;
		       } else {
		           System.out.println("invalid division by zero");
		           } 
		   } else {
		       System.out.println("invalid operator");
		   }
		   
		   System.out.println("the result is: " + result);
		
		
		
		
		
		
	}
}