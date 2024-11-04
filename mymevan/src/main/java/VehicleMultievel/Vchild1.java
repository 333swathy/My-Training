package VehicleMultievel;

public class Vchild1 extends Vparent
{
	public void check()
	{
		
		if(year>2024)
		{
			System.out.println("Congratulations..Vehicle is eligible on road");
		}
		else
		{
			System.out.println("Sorry..Update your Insurance");
		}
	}

	
}
