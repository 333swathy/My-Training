package overridingExample;

public class Child extends Parent {
	public int calculation(int a,int b)
	{
		int result=a*b;
		return result;
	}
	public void display() {
		System.out.println("child class");
		int r=super.calculation(30,30);
		System.out.println("result: "+r);
	}

	public static void main(String[] args) {
		Child ch=new Child();
		ch.display();
		int r=ch.calculation(20, 30);
		
		//System.out.println("result: "+r);
		//Parent p=new Parent();
		//int m=p.calculation(10, 10);
		//System.out.println("result : "+p.calculation(10, 10));//only call like this if there is areturn type
		Parent p=new Child();//parents method will be called,child method will be executed incase of overriddiong only
		{
			p.display1();
			System.out.println("result : "+p.calculation(100, 200));
			
		}
				
		

	}

}
