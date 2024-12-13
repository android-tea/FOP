package fundamentalsofp;

import java.util.Scanner;

public class elseIf_Statement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number = 0;
		
		System.out.println("Else if-statement \n" + "==============================");
		System.out.println("Enter Number: ");
		number=sc.nextInt();
		
		if (number>=18)
		{
			System.out.println(number + " is reach! ");
		}
		else if (number <=18)
		{
			System.out.println(number + " is not valid!");
		}
		else
		{
			System.out.println(number + " is origin");
		}
	}

}
