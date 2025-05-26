package rivision;

public class SwapUsingTemp {
	// write a program to swap with temp
	public void swap() {
		int a = 10;
		int b = 20;
		System.out.println("numbers before swapping is a= " + a + " b = " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("numbers after swapping is a= " + a + " b = " + b);
	}

	// write a program to swap without temp
	public void swapW() {
		int a = 10;
		int b = 20;
		System.out.println("numbers before swapping is a= " + a + " b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("numbers after swapping is a= " + a + " b = " + b);
	}

	// write a program to check vowel or not
	public void vowel() {
		char i = 'e';
		switch (i) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(i + " is a vowel");
			break;
		default:
			System.out.println(i + " is a Not a Vowel");
			break;
		}
	}
	//write a program to find sum of all n natural numbers(sum=sum+i)
	public void sum()
	{
		int sum = 0;
		for(int i=0;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of first 10 natural numbers is " +sum);
	}
	//write a program to display all even numbers
	public void even()
	{
		
		int count=0;
		for(int i=2;i<=10;i++)
		{
			if(i%2==0)
			{
				
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Even numbers are " +count);
	}
	//factorial of a number with recursive approach
	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
			return n*factorial(n-1);
	}

	public static void main(String[] args) {
		SwapUsingTemp sut = new SwapUsingTemp();
		// sut.swap();
		// sut.swapW();
		//sut.vowel();
		//sut.sum();
		sut.even();
		int n=5;
		int fact=factorial(n);
		System.out.println("factorial of number is "+fact);

	}

}
