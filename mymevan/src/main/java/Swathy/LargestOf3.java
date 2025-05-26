package Swathy;

import java.util.Scanner;

public class LargestOf3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
		//Ternary Operator
		int large=a>b?a:b;//largest of a and b
		int largest=c>large?c:large;
		System.out.println(largest);
		int s=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(s);
	

	}

}
