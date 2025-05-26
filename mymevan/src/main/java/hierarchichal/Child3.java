package hierarchichal;

public class Child3 extends Parent
{
	//public int s=1;
	//public int n=2;
	public void sum(int x,int z)
	{
		int t=x+z;
		System.out.println(t);
	}

	public static void main(String[] args) 
	{
	Child3 ch3=new Child3();
	ch3.display(300);
	ch3.sum(20,30);

	}

}
