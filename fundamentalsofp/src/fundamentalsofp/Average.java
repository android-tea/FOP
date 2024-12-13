package fundamentalsofp;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String name;
		int mathematics = 0;
		int science = 0;
		int english = 0;
		double Average = 0;
		
		System.out.print("=========  Welcome Student!Let's Calculate your Average ==========\n\n"+ "Enter Student Name : ");
	    name = sc.nextLine();
	    
	    System.out.println("===Please enter numerical values of the following Subjects===");
	    
	    System.out.print("Mathematics : ");
	   mathematics =sc.nextInt();
	    
	    System.out.print("Science : ");
	    science =sc.nextInt();
	    
	    System.out.print("English :");
	    english =sc.nextInt();
	    
	    
	    System.out.println("\n==============================================");
	    System.out.println("\nMathematics : " + mathematics +"\n" + "Science : " + science +"\n" + "English : " + english);
	    //GETTING THE AVAERAGE BY THIS FORMULA:
	    Average = (mathematics + science + english) / 3.0;
	    System.out.println("Averahe : " + Average);
	    
	    
	    if (Average >= 90 && Average < 100) {
	    	System.out.println("Your Grade is A");
	    }
	    
	      else if (Average >=80 && Average < 90) {
	    	  System.out.println("\nYour Grade is B");
	      }
	      else if(Average>=70 && Average <=80) {
	    	  System.out.println("\nYour Grade is C");
	      }
	      else if (Average>=60 && Average<70) {
	    	  System.out.println("\nYour Grade is D");
	      }
	      else if (Average >= 0 && Average<60) {
	    	  System.out.println("\nYour Grade is F");
	      }
	}

}
