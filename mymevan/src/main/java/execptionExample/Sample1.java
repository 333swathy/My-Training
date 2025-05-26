package execptionExample;

public class Sample1 
{
	
	public void operation(int num1,int num2)
	{
		int result;
		int[] arr=new int[5];
		try
		{
	
		result=num1/num2;
		System.out.println("result :"+result);
		for(int i=0;i<=4;i++)
		{
			arr[i]=i+1;
			System.out.println("Array is "+arr[i]);
		}
		}
		catch(ArithmeticException Sample1)//classname or any refernce variable
		{
			System.out.println("Division by zero is not possible");
			
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("array size is 5");
		}
		catch(Exception s)
		{
			System.out.println("exception occured");
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("end");

		
	}

	public static void main(String[] args) {
		Sample1 sm1=new Sample1();
		sm1.operation(6, 3);
	}

}
