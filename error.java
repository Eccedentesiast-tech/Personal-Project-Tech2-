import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("this our available item");
			
		String[] name = {"hotdog:10","pizza:120","ice cream:20"};
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		String item;
		int iceCream = 20;
		int pizza = 120;
		int hotdog = 10;
		int price;
		int quantity;
		double total;
	 
	while (true) {		
			System.out.print("what is the item you want to buy: ");
			item = input.nextLine();
			if (item.equalsIgnoreCase("hotdog") || item.equalsIgnoreCase("pizza") || item.equalsIgnoreCase("ice cream")) {
							break;		
				} else {
				     System.out.println("invalid item.plss put valid item.");				     				   	
		       }							
 	       }				
       
           while (true) {
           	try {
           		System.out.print("what is the price: ");
           		price = input.nextInt();
           		input.nextLine();
           		if ((item.equalsIgnoreCase("hotdog") && price != hotdog) ||                  
           		(item.equalsIgnoreCase("pizza") && price != pizza ) ||    			
           		(item.equalsIgnoreCase("ice cream") && price != iceCream)) {
           			System.out.println("invalid price.plss enter correct price.");           		
           		} else {
           			break;
           		}         		
           	} catch (InputMismatchException e){
           		System.out.println("invalid input.plss enter a number:");
           		input.nextLine();
           	}
           }
       
        while (true) {
            try {
                System.out.print("How many do you want to buy: ");
                quantity = input.nextInt();
                input.nextLine();

                if (quantity <= 0) {
                    System.out.println("Invalid quantity. Please enter a positive number.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }
        }

        total = price * quantity;
        System.out.println("The total is: " + total);
    }
}