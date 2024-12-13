package fundamentalsofp;

import java.util.Scanner;

public class NetPrice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//VARIABLES THAT WILL HANDLE OUR INPUTS:
		
		String product = " ";//null value
		double unitPrice = 0.0; //zero is the initial value
		double quantity = 0.0;
		
		
		//VARIABLES USED FOR COMPUTATION:
		double totalPrice = 0.0;
		double discount = 0.0, netPrice = 0.0;
		System.out.println("Enter Product: ");
		product = sc.nextLine();
		
		System.out.println("Enter Unit Price: ");
		unitPrice=sc.nextDouble();
		
		System.out.println("Enter Quantity: ");
		quantity = sc.nextDouble();
		
		totalPrice = quantity*unitPrice;
		discount=totalPrice *0.1;
		netPrice=totalPrice-discount;
		
		System.out.println("===============================");
		System.out.println("The product is" + product);
		System.out.println("Total price is " + totalPrice + "dollars");
		System.out.println("Discount is " + discount);
		System.out.println("===============================");
		System.out.println("Net price is " + netPrice);
	}

}
