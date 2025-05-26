package Swathy;

import java.util.Scanner;

public class SwappingTwoNos
{
	int first,second;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first digit");
		first=sc.nextInt();
		System.out.println("Enter second digit");
		second=sc.nextInt();
		System.out.println("Before swapping first : "+first+"second : "+second);
		
	}
	public void swappingwithTemp()
	{
		int temp=first;
		first=second;
		second=temp;
		System.out.println("AFTER SWAPPING WITH TEMP first :"+first+"second : "+second);
	}
	public void swappwithouttemp()
	{
		first=first+second;//30
		second=first-second;//S=30-20=10
		first=first-second;//F=30-10=20
		System.out.println("AFTER SWAPPING WITHOUT TEMP first :"+first+"second : "+second);
		
		
	}


	public static void main(String[] args) 
	{
		SwappingTwoNos swapping=new SwappingTwoNos();
		swapping.input();
		//swapping.swappingwithTemp();
		swapping.swappwithouttemp();

	}

}
