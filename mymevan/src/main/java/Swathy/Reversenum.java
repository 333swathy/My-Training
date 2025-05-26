package Swathy;

import java.util.Scanner;

public class Reversenum 
{
	Scanner sc=new Scanner(System.in);
	int rev=0;
	public int revnumber(int num)
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number you want to reverse");
		//int num=sc.nextInt();
	    while(num>0)
		{
			//num=num%10;
			rev=rev*10+num%10;
			num=num/10;
			
		}
	    return rev;
		//System.out.println("The reverse of number is " +rev);
	}
	public void stringbuffer()//using Stringbuffer
	{
		System.out.println("Enter the number you want to reverse");
		int num=sc.nextInt();
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer stringrev=sb.reverse();
		System.out.println("reverse number is: "+stringrev);
	}
	public void stringbuilder()
	{
		System.out.println("Enter the number you\t want to \nreverse");
		int num=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		System.out.println(rev);
	}

	public static void main(String[] args) 
	{
		
		Reversenum revsum=new Reversenum();
		//int a=revsum.revnumber(1234);
		//System.out.println("The reverse of number is " +a);
		//revsum.stringbuffer();
		revsum.stringbuilder();

	}

}
