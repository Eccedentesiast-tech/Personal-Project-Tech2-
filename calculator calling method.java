/*public class Main {
	
	static String name = "claire";
	static int age = 19;
	
	public static void main(String[] args) {		
		nameandage();	
	}
		public static void nameandage() {
		    System.out.println(name + " " + age);		    
		}
}*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("first number: ");
		double num1 = input.nextDouble();
		input.nextLine();
		
		System.out.print("choose a operator (+,*,-,/): ");
		char operator = input.next().charAt(0);
		input.nextLine();
		
		System.out.print("second number: ");
		double num2 = input.nextDouble();
		input.nextLine();
		
		calculate(num1,num2,operator);
						
	}		
		public static void calculate (double num1, double num2,char operator){
		    double result = 0;
		    
		    if (operator == '*') {
		            result = num1 * num2;
		    } else if (operator == '+') {
		              result = num1 + num2;
		    } else if (operator == '-') {
		              result = num1 - num2;
		    } else if (operator == '/') {
		            if (num2 == 0){
		              result = num1 / num2;
       		    }else{
       		            System.out.println("invalid division by zero!");
       		    }
		 
   		}else{
   		        System.out.println("invalid operator");
   		        
   		    System.out.println("the result is " + result);		    		
   		}		
     }
}