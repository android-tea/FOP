package fundamentalsofp;

public class CubeCalculator_dowhileLoop {

	public static void main(String[] args) {
		
		int a=0;
		int ctr=5;
		int cb;
		int t=0;
		String text ="cube";
		
		do {
			cb = a * a * a;
			System.out.println("Number is " + a + text + ": " + cb);
			a++;
			t += cb;
		} while (a <= ctr);
		System.out.println("\nTotal " + text + "s: "+ t);
	}

}
