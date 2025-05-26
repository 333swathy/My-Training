	package Abstraction;

public class Imagesearch extends Google 
{
	public void search()
	{
		System.out.println("Hidden information using abstract mathod");
	}
	

	@Override
	public int add(int a,int b) 
	{
		int sum=a+b;
		return sum;

	
	}
	public static void main(String[] args)
	{
		Imagesearch im=new Imagesearch();
		im.search();
		im.sayHi();

		System.out.println(im.add(5, 2));
		
	}




}
