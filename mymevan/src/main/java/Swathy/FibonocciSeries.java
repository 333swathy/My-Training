package Swathy;

import java.util.Scanner;

public class FibonocciSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you need fibonocci series");
		int n=sc.nextInt();
		int sum=0,n1=0,n2=1;
		System.out.print(n1+ " " +n2);//0 1
		for(int i=2;i<=n;i++)
		{
			sum=n1+n2;//0+1=1
			System.out.print(" "+sum);//1
			n1=n2;//1
			n2=sum;//1
		
			
		}

	}

}
