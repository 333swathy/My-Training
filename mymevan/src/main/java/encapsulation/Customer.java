package encapsulation;

public class Customer{

	public static void main(String[] args)
	{
		Bank bk=new Bank();
		bk.setCusName("SWATHY");
		bk.setAccBalance(10000);
		bk.interst();
		String s=bk.getCusName();
		double d=bk.getAccBalance();
		
		System.out.println(s);
		System.out.println(d);
		

	}

}
