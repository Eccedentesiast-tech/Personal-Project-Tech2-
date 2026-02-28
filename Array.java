import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("this is our available item");
			
		String[] name = {"hotdog:10","pizza:120","ice cream:20"};
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		
		String item;
		int price;
		int quantity;
		double total;
		
	 System.out.print("what is the item you want to buy: ");      item = input.nextLine();
	
	System.out.print("what is the price: ");
	price = input.nextInt();
	input.nextLine();
	
    System.out.print("how many you want to buy: ");    
    quantity = input.nextInt();
    input.nextLine();
    
    total = price * quantity;
    System.out.println("the total is: " + total);
    			
	}
}