package fundamentalsofp;

public class whileloop {

	public static void main(String[] args) {
		
		//variable initialization
		int i = 1, n = 4 , s = 1 , p = 0;
		
		while (i <= n) {//while loop continues as long as "i" is less than or equal to n
			s = i * i; //calculates the square of "i" and assigns it to "s"
			p += s; //add the value of s to p 
			i++; //increment i by 1 for the next iteration
		}
		//if the program finished this would be printed:
		System.out.println("s = " + s +"and p = " + p);

	}

}

/*
EXECUTION FLOW: 
For i = 1: s = 1 * 1 = 1, p = 0 + 1 = 1
For i = 2: s = 2 * 2 = 4, p = 1 + 4 = 5
For i = 3: s = 3 * 3 = 9, p = 5 + 9 = 14
For i = 4: s = 4 * 4 = 16, p = 14 + 16 = 30
*/