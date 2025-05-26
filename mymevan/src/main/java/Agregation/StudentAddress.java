package Agregation;

public class StudentAddress {
	int housenumber;
	String street;
	String area;
	StudentName sa;

	public StudentAddress(int h, String s, String m, StudentName std) {
		housenumber = h;
		street = s;
		area = m;
		sa = std;
	}

	public void display() {
		System.out.println("NAME :" + sa.name);
		System.out.println("Roll no: " + sa.roll);
		System.out.println("Address: " + housenumber);
		System.out.println("street: " + street);
		System.out.println("Area" + area);

	}

}
