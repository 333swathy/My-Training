package salerySlip;

public class Class3 extends Class2
{
	public double totalsalery;
	
	public void total()
	{
		totalsalery=basicpay+hra-pf-deduction+bonus;
	}
	public void saleryslip()
	{
		System.out.println("basicpay :"+basicpay);
		System.out.println("hra :"+hra);
		System.out.println("pf :"+pf);
		System.out.println("deduction :"+deduction);
		System.out.println("bonus :"+bonus);
		System.out.println("totalsalery :"+totalsalery);
	}

	public static void main(String[] args)
	{
		Class3 obj=new Class3();
		obj.basicdetails();
		obj.calc();
		obj.total();
		obj.saleryslip();
		


	}

}
