package multilevelInheritance;

public class Child extends Parent2{
	public void displayc()
	{
		System.out.println("child");
	}


	public static void main(String[] args) {
		//Child obj= new Child();
		//obj.displayp1();
		//obj.displayp2();
		//obj.displayc();
		Parent2 obj1=new Parent2();
		obj1.displayp1();
		obj1.displayp2();
		
		// TODO Auto-generated method stub

	}

}
