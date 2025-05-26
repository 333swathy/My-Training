package Swathy;

import java.util.Scanner;

public class CountEvenOdd {
	Scanner sc=new Scanner(System.in);
	public void count()
	{
		int even = 0,odd = 0;
		System.out.println("Enter the digit");
		int num=sc.nextInt();
		while(num>0)
		{
			num=num/10;
			if(num%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("even count is : "+even);
		System.out.println("odd count s : "+odd);
	}
	public void digitSum()
	{
		System.out.println("Enter the digit");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("sum of digit:"+sum);
		
		
	}

	public static void main(String[] args)
{
		CountEvenOdd counteven=new CountEvenOdd();
		//counteven.count();
		counteven.digitSum();
				

	}

}
