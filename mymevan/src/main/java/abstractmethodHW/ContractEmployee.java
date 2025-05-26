package abstractmethodHW;

public class ContractEmployee extends Employee 
{
	public int w;
	public int PAYMENT=1000;
	public void display()
	{
		System.out.println("Salary of contract Employee");
		System.out.println("enter no:of working hours");
		w=new java.util.Scanner(System.in).nextInt();
	}

	
	@Override
	public void calculateSalery() 
	{
		int salery=PAYMENT*w;
		System.out.println("Contract Employee salery is : "+salery);
		
	}
	public static void main(String[] args)
	{
		ContractEmployee ce=new ContractEmployee();
		ce.salery();
		ce.display();
		ce.calculateSalery();
	

	}


}
