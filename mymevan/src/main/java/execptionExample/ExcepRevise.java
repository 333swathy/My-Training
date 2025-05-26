package execptionExample;

public class ExcepRevise {
	
	public void div()
	{
		try {
		int a=10,b=0,divs;
		divs=a/b;
		System.out.println(divs);}
		catch(ArithmeticException e)//TO HANDLE THE EXCEPTION
		{
			System.out.println("division by zero is not possible");
		}
		finally
		{
			System.out.println("finally");
		}
	}
	public void array() throws ArrayIndexOutOfBoundsException
	{
		int sum=0;
		int[] a= {1,2,3,4};
		for(int i=0;i<=8;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	public void nullp()
	{
		String s="GKFKGHF";
		/*if (s == null)
		{
	        throw new NullPointerException("String 's' is null. Cannot call length() on a null reference.");
	    }*/
		System.out.println(s.length());
	}

	public static void main(String[] args) 
	{
		 ExcepRevise ee=new  ExcepRevise();
		 ee.div();
		 ee.array();
		ee.nullp();
	}

}
