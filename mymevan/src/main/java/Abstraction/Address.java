package Abstraction;

public class Address extends Google {

	@Override
	public void search() {
		System.out.println("Next class");

	}

	@Override
	public int add(int a, int b) {
		int add = a + b;
		return add;
	}

	public static void main(String[] args) {
		Address ad = new Address();
		System.out.println(ad.add(100, 10));
		ad.search();
		ad.sayHi();

	}

}
