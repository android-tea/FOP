package fundamentalsofp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AirFare_switchStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		double fare=0.0;
		int custCode=0;
		String customer="";
	    double discRate=0.0;
	    double netFare=0.0,discount=0.0;
	    
	    System.out.println("Enter fare amount: ");
	    fare=sc.nextDouble();
	    
	    System.out.println("Enter customer" + "code [0=Ordinary, 1=student, 2=senior]:");
        custCode=sc.nextInt();
	    
	    switch(custCode)
	    {
	    
	    case 0 : customer ="ordinary";
	    discRate=0.0;
	    break;
	    case 1:customer="student";
	    discRate=0.1;
	    break;
	    case 2: customer="senior citizen";
	    discRate=0.2;
	    break;
	    default:
	    	customer="===Invalid Code!====";
	    }
	    
	    //formula OF computer discount and net free
	    
	    discount=fare*discRate;
	    netFare=fare-discount;
	    System.out.println("\n=============================\nThe Customer is a " + customer);
	    System.out.println("Discount is $"+df.format(discount)+ " dollars ");
	    System.out.println("\nNet fare is $" + " " + df.format(netFare) + " dollars ");

	}

}
