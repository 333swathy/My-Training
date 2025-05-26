package inheritance;

public class Child extends Parent
{
	public void display()
	{
		System.out.println("child class"+num);
	}
	

	public static void main(String[] args) {
		Child obj=new Child();
		obj.print(100);
		obj.display();
	
		
		// TODO Auto-generated method stub

	}

}
