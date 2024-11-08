package salerySlip;
import java.util.*;

public class Class1
{
	public double basicpay;
	public double deduction;
	public double bonus;
	
	public void basicdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basicpay");
		basicpay=sc.nextDouble();
		System.out.println("Enter deduction");
		deduction=sc.nextDouble();
		System.out.println("Enter bonus");
		bonus=sc.nextDouble();
		
	}

	

}
