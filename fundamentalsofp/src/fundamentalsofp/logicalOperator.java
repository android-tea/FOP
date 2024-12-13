package fundamentalsofp;

import java.util.Scanner;

public class logicalOperator {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int test1Score=0, test2Score=0;
		System.out.println("Enter test 1 score : ");
		test1Score=sc.nextInt();
		
		System.out.println("Enter test 2 score : ");
		test2Score=sc.nextInt();
		
		if ((test1Score>90) && (test2Score>90))
		{
		System.out.println("Make employee supervisor");	
		}
		else if (!(test1Score>90)) 
		{
			System.out.println("Make employee agent");
		}
	}

}
