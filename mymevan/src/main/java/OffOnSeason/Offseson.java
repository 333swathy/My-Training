package OffOnSeason;

public class Offseson {
	public void discount()
	{

		double amount = 0;
		System.out.println("Enter the amount you have purchased");
		double initialamount=new java.util.Scanner(System.in).nextDouble();
		amount=(initialamount*0.85);
		System.out.println("Amount to have to pay after 15% Offseason discount is ; "+amount);
	}

}
