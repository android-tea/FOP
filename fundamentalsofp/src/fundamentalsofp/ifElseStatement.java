package fundamentalsofp;

import java.util.Scanner;

public class ifElseStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int age=0;
		
		System.out.println("If Else Statement");
		System.out.println("=================================");
		System.out.print("Enter age: ");
		age=sc.nextInt();
		if (age>=18)
		{
			System.out.println(age + " is Qualified to vote ");
		}
		else
			System.out.println(age + " is too young");

	}

}
