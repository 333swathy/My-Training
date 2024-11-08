package SuperAdd;
//➢ Program to check the addition result is divisible by 10 
//• Class 1 Return addition result of two numbers 
//• Class 2 Check the addition result is divisible by 10(use super keyword)

import java.util.Scanner;

public class Parentsuper extends ChildSuper
{
	public int result;
	public void check() 
	{
		 result=super.rtrn();
		if(result%10==0)
		{
			System.out.println("Divisible by 10");
			
		}
		else
		{
			System.out.println("Not divisibe by 10");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		Parentsuper ch=new Parentsuper();
		ch.add(n1, n2);
		//ch.rtrn();
		ch.check();
		
}
}
