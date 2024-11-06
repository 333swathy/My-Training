package abstractmethodHW;

public  class FulltimeEmployee extends Employee{
	public final int WORK=8;
	public  int PAYMENT=2000;
	public void display()
	{
		System.out.println("Salery of Fulltime Employee");
	}
		
	@Override
	public void calculateSalery()
	{
		int salery=PAYMENT*WORK;
		System.out.println("Fulltime Employee salery is : "+salery);
		
	}
	public static void main(String[] args) {
		FulltimeEmployee fe=new FulltimeEmployee();
		fe.salery();
		fe.display();
		fe.calculateSalery();

	}

}
