package fundamentalsofp;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int number = 0;
		
		System.out.println("Enter Number: ");
		number=sc.nextInt();
		
		if(number>0)
		{
			System.out.println(number + " is a positive number ");
			
		}
		else
		{
			System.out.println(number + "is a negative number");
		}

	}

}
