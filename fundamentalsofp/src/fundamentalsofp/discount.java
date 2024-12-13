package fundamentalsofp;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample Input/Output : \n");
		
		System.out.print("Enter name of the student: ");
		String name=sc.nextLine();
		
		System.out.println("Enter number of unit senrolled: ");
		int units=sc.nextInt();
		
		System.out.println("Enter price per unit: ");
		double price=sc.nextDouble();
		
		double fee=units * price;
		
		System.out.println("\nComputed tuition fee: " + fee + " dollars ");
		System.out.println(name + ", you could avail the following payment mode: ");
		
		System.out.println("\nPayment Mode: ");
		
		double fee1= fee - (fee * 0.1);
		System.out.println("Cash Payment: " + fee1 + " dolalrs ");
		double fee2 = fee + (fee * 0.05);
		
		System.out.println("2-installment: " + fee2 + " dollars");
		double fee3=fee + (fee * 0.1);
		System.out.println("3-installment: " + fee3 + " dollars ");
	}

}
