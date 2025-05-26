package execptionExample;

import java.io.IOException;

public class ThrowSample 
{
	public void operation(int num1,int num2) throws ArithmeticException, IOException
	{
		int result=num1+num2;
		if(result>20)
		{
			throw new ArithmeticException("result>20");
		}
			else
			{
				throw new IOException();
			}
	}
	public void display() throws  IOException 
	{
		operation(10,0);
		
	}
		public static void main(String[] args)	
		{
			ThrowSample ts= new ThrowSample();
			try
			{
					ts.display();
			}
			catch(ArithmeticException a)
			{
				System.out.println("arithmatic exception");
			}
			catch(IOException e)
			{
				System.out.println("io exception");
			}
		}
		
		
	
	

}
