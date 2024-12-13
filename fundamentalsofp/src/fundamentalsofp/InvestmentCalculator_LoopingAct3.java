package fundamentalsofp;

import java.text.DecimalFormat;

public class InvestmentCalculator_LoopingAct3 {

	public static void main(String[] args) {


		DecimalFormat df=new DecimalFormat("$#,###,###.00");
		int year = 0;
		double myInvestment = 1000.0 , interest=0.0, money=0.0;
		
		//headers
		System.out.print("Year\t " + "Amount\t\t "+ "Interest\t"+"Year-end Money " + " ");
		System.out.println();
		
		for (year = 1;year <=5; year++) {
			interest =myInvestment* 0.1;
			money = myInvestment + interest;
			
			System.out.print(year +"\t");
			System.out.print(df.format(myInvestment) + " \t");
			System.out.print(df.format(interest) + "\t\t");
			System.out.println(df.format(money));
		}

	}

}
