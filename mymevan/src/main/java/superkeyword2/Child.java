package superkeyword2;

public class Child extends Parent {
	int number;
	public void setvalue(int n)
	{
		super.number=n;
		number=n;
	}
	public void display() {
		System.out.println("parent : "+super.number);
		System.out.println("child: "+number);
	}

	public static void main(String[] args) {
		Child ch=new Child();
		ch.show(100);
		ch.setvalue(80);
		ch.display();
		

	}

}
