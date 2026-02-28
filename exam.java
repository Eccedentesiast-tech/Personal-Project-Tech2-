import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String[] scrambleword = {"1. GMMINGRAOPR",
		                                          "2. INPRT",
		                                          "3. LEBIAVRA",
		                                          "4. TADA",
		                                          "5. JVAA"};
		
		String[] scrambleanswer = {"PROGRAMMING",
		                                              "PRINT",
		                                              "VARIABLE",
		                                              "DATA",
		                                              "JAVA"};
		 int totalscore = 0;                                  
		System.out.print("Name:"); 
		String name = input.nextLine();
				                                              
		System.out.print("Section:"); 
		String section = input.next();
		input.nextLine();
		
	   System.out.println("Welcome to our quiz " + name );
	   	   
   	System.out.println(" I. Scrambled word!");
   	System.out.println();
   	
   	for (int i = 0; i < scrambleword.length; i++) {
   	    System.out.println(scrambleword[i]);
   	    System.out.println();   	    
   	    
   		System.out.print("Answer:");
       	String answer = input.nextLine();
       	
   	
          	if (answer.equals(scrambleanswer[i])) {
   	           System.out.println("correct answer");
   	           totalscore++;
         	}else{
          	    System.out.println("wrong answer");
       	}
   	}     	
   	      System.out.println("Your total score is " + totalscore + "/5" );  	  			        		                        		                                     			   					        		                        		                                 	   						  	                       		                                     			   						        		                        		                                     		
	}
}