package review2;

public class AbstractChild extends AbstractSample {

	
	@Override
	public void display() {
		System.out.println("abstarct method");
		
	}
	public static void main(String[] args) {
		AbstractChild ac=new AbstractChild();
		ac.display();
		
	}


}
