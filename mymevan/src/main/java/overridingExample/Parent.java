package overridingExample;

public class Parent 
{
	public int calculation(int a,int b)
	{
		int sum=a+b;
		//System.out.println("sum : "+sum);
		return sum;
	}
	public void display1()
	{
		System.out.println("parent class");
	}

}
