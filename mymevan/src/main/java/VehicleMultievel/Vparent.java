package VehicleMultievel;
import java.util.*;

public class Vparent 
{
	public int year;
	String name,engine;
	
	public void vehicleDetails()
	{
		System.out.println("Enter vehicle name");
		name=new java.util.Scanner(System.in).nextLine();
		System.out.println("Engine type: ");
		engine=new java.util.Scanner(System.in).nextLine();
	}
	public void licence()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your car insurance last year");
		year=sc.nextInt();
		
	}

}
