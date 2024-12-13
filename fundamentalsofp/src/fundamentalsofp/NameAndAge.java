package fundamentalsofp;

import java.util.Scanner;

public class NameAndAge {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Enter Name: ");
		name =sc.nextLine();
		
		System.out.println("Enter age: ");
		age=sc.nextInt();
		
		System.out.println();
		System.out.println("Your name is " + name);
		System.out.println("You are " + age + "years old");
		}

}
