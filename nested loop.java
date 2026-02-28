import java.util.Arrays;
import java.util.Scanner;
//import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
	/*	while (true) {
		    try {
		        System.out.print("number: ");
		        int number = input.nextInt();		        
		        
		        System.out.println("square: " + (number * number));
		        		        		        
		    } catch (InputMismatchException e) {
		        input.nextLine();
		        System.out.println("invalid only integer ");
		    }
		}

      System.out.print("Middle Initial: ");
char c = input.next().charAt(0);
input.nextLine();  // Clear buffer after using next()

    
		System.out.print("number: ");
		int num = Integer.parseInt(input.nextLine());
		
		System.out.print("name:  ");
		String name = input.nextLine();

		System.out.println();
		System.out.println(c);
		System.out.println(num);
		System.out.println(name); */
		
		
		String[][] name = {
		                               {"mine1", "mine2"},
		                               {"mine3", "mine4"},
		                               {"mine5", "mine6"},
	                               	};
	                               	
	                               	
	                               /*	for (int i = 0; i < name.length; i++){
	                               	    System.out.println(name[i]);
	                               	}
	                               	
	                               	for (int i = 0; i < name.length; i++) {
                                           for (int j = 0; j < name[i].length; j++) {
                                                System.out.print(name[0][2] + " ");                                                                                  
                                            }
                                           System.out.println(); // New line after each row
                                            }*/
                        
                                           for (int i = 0; i < name.length; i++) {
                                                System.out.println(Arrays.toString(name[i]));
                                                 }


		
		  
		
		
		
	}
}