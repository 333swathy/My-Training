package Swathy;

import java.util.Scanner;

public class PrimeOrNot {
	
	public void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check prime or not");
		int count=0;
		int s=sc.nextInt();
		for(int i=1;i<=(s/2);i++)
		{
			if((i/s)==0)
			{
				count++;
			}
		}
		if(count<1)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Not a prime");
		}
	}

	public static void main(String[] args) {
		PrimeOrNot pm=new PrimeOrNot();
		pm.check();
		

	}

}
