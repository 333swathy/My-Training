package AtmPin;
import java.util.*;

public class PinValidate
{
	
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
	
	Setpin sp=new Setpin();
	sp.setCustomerName("SWATHY D ANAND");
	String s=sp.getCustomerName();
	System.out.println(s);
	System.out.println("Enter pin");
	int p=sc.nextInt();
	sp.setPinNumber(p);
	sp.check();
	sc.close();

}
	
}