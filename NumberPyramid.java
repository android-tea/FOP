package logic_PrintingStatements;

public class NumberPyramid {

	public static void main(String[] args) {
		
		int rows = 5;
		
		for (int i = 1; i<=rows; i++) {
			
			for (int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			
			for (int k=1;k <= i; k++) {
				System.out.print(k);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
