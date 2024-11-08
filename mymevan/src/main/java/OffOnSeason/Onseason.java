package OffOnSeason;
//Program to calculate discount If customer purchase clothes on Offseason, set discount 15% and on Onseason 40%
//Should use two classes, Onseason and Offseason Use two methods- discount(method name should be same)
public class Onseason extends Offseson {
	public void season()
	{
		System.out.println("Select season of customer purchase 1:ONseaso 2: OFFseason");
		int season=new java.util.Scanner(System.in).nextInt();
		if(season==1)
		{
			discount();
		}
		else
		{
			super.discount();
		}
	}
	
	public void discount()
	{
		double amount = 0;
		System.out.println("Enter the amount you have purchased");
		double initialamount=new java.util.Scanner(System.in).nextDouble();
		amount=(initialamount*0.6);
		System.out.println("Amount to have to pay after 40% Onseason discount is ; "+amount);
	}

	public static void main(String[] args) 
	{
	Onseason os=new Onseason();
	os.season();
	//os.discount();
	//Offseson of =new Offseson();
	//of.discount();

	}

}
