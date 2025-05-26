package interfaceExample;

public class InterfaceClass implements SampleInterface3//because sampleinterface3 extends sampleinterface and sampleinterface1
{

	@Override
	public void display()
	{
		System.out.println("Interface class for data hiding");
		System.out.println(VALUE);
	}
	@Override
	public void show()
	{
		System.out.println("2nd parent method");
		System.out.println(VAL);
		
	}
	@Override
	public void sum()
	{
		float a;
		a=VAL+VALUE+PI;
		System.out.println("value :"+a);
		
		
	}
	

	public static void main(String[] args) {
		//InterfaceClass ic=new InterfaceClass();
		SampleInterface3 ic=new InterfaceClass();
		ic.display();
		ic.show();
		ic.sum();

		
	}
	


}
