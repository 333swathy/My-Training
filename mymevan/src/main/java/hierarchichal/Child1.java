package hierarchichal;

public class Child1 extends Parent
{
	public void show() {
		System.out.println("parent value :"+a);
		
	}

	public static void main(String[] args)
	{
		Child1 ch=new Child1();
		ch.display(100);
		ch.show();

	}

}
