package week4;

import java.util.Scanner;

public class ShirtSize {
	
	    public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
			
		System.out.println("Please enter the customer's chest measurement in inches:");
		int chestSize = Integer.parseInt(in.nextLine()); 
	    	    
	    if (chestSize < 38) {
	    System.out.println("A customer with a chest measurement of " + chestSize + " inches needs to order a size S.");
	    
	    } else if (chestSize >=38 && chestSize < 40)  {
	   	System.out.println("A customer with a chest measurement of " + chestSize +  " inches needs to order a size M.");
	   	
	    } else if (chestSize >= 40 && chestSize < 43) {
	   	System.out.println("A customer with a chest measurement of " + chestSize +  " inches needs to order a size L.");
	   	
	    } else if (chestSize >= 43 && chestSize < 46) {
	   	System.out.println("A customer with a chest measurement of " + chestSize +  " inches needs to order a size XL.");
	   	
	    } else if (chestSize >= 46) {
	   	System.out.println("A customer with a chest measurement of " + chestSize +  " inches needs to order a size XXL.");
	
	   	
	   	in.close();
	    }
	   
   }
}
