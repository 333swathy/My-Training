package hierarchichal;

public class Child2 extends Parent
{
	public void print() 
	{
		System.out.println("parent in child2: "+a);
	}

	public static void main(String[] args)
	{
		Child2 ch2=new Child2();
		ch2.display(2000);
		ch2.print();
		
	

	}

}
