import java.util.Scanner;

public class Helloworld {
	public static void main (String[] args) {	
	     Scanner input = new Scanner (System.in);
		
	   System.out.print("ano ang iyong average grade on firts semester: ");
	      double averageGrade = input.nextDouble();
	      
	   if (averageGrade >= 90) {
	   	System.out.println("congrats pasok ka sa honor student");
	   		   			   	
	   } else {
	   	System.out.println("bawi ka nalang next semester");
	   	
	   }
	      	      		
	}	
	
}
