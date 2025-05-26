package VehicleMultievel;

public class Vchild2 extends Vchild1
{
	String color,varient;
	public void color()
	{
		System.out.println("Enter vehicle color");
		color=new java.util.Scanner(System.in).nextLine();
		System.out.println("Enter vehicle varient");
		varient=new java.util.Scanner(System.in).nextLine();
	}
	public void display() {
		System.out.println("vehicle : " +name);
		System.out.println("engine type : "+engine);
		System.out.println("color : "+color);
		System.out.println("Varient : "+varient);
		System.out.println("insurance ended : "+year);
		check();
	}

	public static void main(String[] args) 
	{
		Vchild2 vd=new Vchild2();
		vd.vehicleDetails();
		vd.licence();
		vd.check();
		vd.color();
		vd.display();
	

	}

}
