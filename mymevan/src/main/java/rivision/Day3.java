package rivision;

import java.util.Scanner;

public class Day3 {
	Scanner sc = new Scanner(System.in);

	// check armstrong/not
	public void armstrong() {
		System.out.println("Enter number you want to check");
		int num = sc.nextInt();
		int orgnum = num;
		int digit = 0, rev = 0;
		while (num > 0) {
			digit = num % 10;
			rev = rev + (digit * digit * digit);
			num = num / 10;
		}
		if (orgnum == rev) {
			System.out.println(orgnum + " is armstrong");
		} else {
			System.out.println(orgnum + " is not an armstrong");

		}
	}

	// palliandrom/not
	public void palliandrom() {
		System.out.println("Enter number you want to check");
		int num = sc.nextInt();
		int orgnum = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (rev == orgnum) {
			System.out.println(orgnum + " is palliandrome");
		} else {
			System.out.println(orgnum + " is not a palliandrome");

		}
	}

	// program to print length of array element
	public void arraylength() {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("lenght of array is " + a.length);
	}

	// program to find sum of elements in array
	public void arraysum() {
		int sum = 0;
		int a[][] = new int[3][3];
		System.out.println("Enter array elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum = sum + a[i][j];
			}
		}
		System.out.println("Sum of array is " + sum);
	}
	//write aprogram to reverse a string
	public void stringrev()
	{
		System.out.println("Enter the string you want top reverse");
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.print(c[i]);
		}
	}

	public static void main(String[] args) {
		Day3 d = new Day3();
		// d.armstrong();
		// d.palliandrom();
		// d.arraylength();
		//d.arraysum();
		//d.stringrev();

	}

}
