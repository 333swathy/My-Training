package rivision;

import java.util.Random;
import java.util.Scanner;

public class Day2 {
	Scanner sc=new Scanner(System.in);
	//print multiplication table of given number
	public void multiply()
	{
		int num=5;
		for(int i=num;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(num +" * " +j+ " = "+i*j);
			}
			System.out.println("");
		}
	}
//factorial of given number
	public void factorial()
	{
		System.out.println("enter number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial = "+fact);
	}
	//fibonocci series
	public void fibonocci() {
		System.out.println("Enter number");
		int num=sc.nextInt();
		int num1=0,num2=1,sum=0;
		System.out.print("series is " +num1 +" " +num2 );
		for(int i=1;i<=num;i++)
		{
		sum=num1+num2;
		System.out.print(" "+sum +" ");
		num1=num2;
		num2=sum;
	}
	}
	//program to reverse a number
	public void reverse()
	{
		System.out.println("Enter number");
		int num=sc.nextInt();
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("rev = "+rev);
	}
	//check given number is prime/not
	public void prime()
	{
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not a prime");
		}
	}
	//armstrong
	public void armstrong()
	{
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int org=num;
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
			
		}
		System.out.println("number is   "+sum);
		if(sum==org)
		{
			System.out.println(org+ " is an armstrong");
		}
		else
		{
			System.out.println(org+ " is not  an armstrong");
		}
	}
	public void stringrev()
	{
		System.out.println("Enter the string you want to reverse");
		String s=sc.next();
		/*StringBuffer sb=new StringBuffer(s);
		StringBuffer s1=sb.reverse();
		System.out.println("Reversed string is " +s1);*/
		char[] a=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
	}
	//String reverse of aline word by word
	public void wordRev()
	{
		System.out.println("Enter the line you want to reverse word by word");
		String s=sc.nextLine();
		String rev="";
		String word[]=s.split("\\s");
		for(String w:word)
		{
			StringBuffer sb= new StringBuffer(w);
			sb.reverse();
			rev=rev+sb.toString()+ " ";
		}
		System.out.println("String after rev is "+rev);
	}
	//palliandrome
	public void palliandrome()
	{
		System.out.println("Enter the number you want to check palliandrom or not");
		int num=sc.nextInt();
		int orgnum=num,rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==orgnum)
		{
			System.out.println(orgnum+ " is a palliandrome");
		}
		else
		{
			System.out.println(orgnum+ " is a not palliandrome");
		}
	}
	//sum of sigle array
	public void sumofarray()
	{
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)//for(int value:a)
		{
			sum=sum+a[i];        //sum=sum+value
		}
		System.out.println("sum of array is  "+sum);
	}
	//print an array
	public void array()
	{
		System.out.println("Enter row size of 1st array");
		int r=sc.nextInt();
		System.out.println("Enter coloumn size of 1st array");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter array elements of 1st array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}
		System.out.println("your 1st array is......");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println("");
		}
		System.out.println("Enter row size of 2nd array");
		int r1=sc.nextInt();
		System.out.println("Enter coloumn size of 2nd array");
		int c1=sc.nextInt();
		int b[][]=new int[r1][c1];
		System.out.println("Enter array elements of 2nd array");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				 b[i][j]=sc.nextInt();
			}
		}
		System.out.println("your 2nd array is......");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(b[i][j] +" ");
			}
			System.out.println("");
		}
		System.out.println("SUM OF ARRAYS IS.....");
		System.out.println("your array is......");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(a[i][j] +b[i][j] +" ");
			}
			System.out.println("");
		}
	}
	//duplicate in array
	public void arrayduplicate()
	{
		int a[][]=new int[3][3];
		System.out.println("Enter array elements of 1st array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}
		System.out.println("your 1st array is......");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println("");
	}
		System.out.println("Enter the digit you want to check");
		int num=sc.nextInt();
		int flag=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				 if(num==a[i][j])
				 {
					 flag=1;
					 break; 
				 }
				
			}
		}
		if(flag==1)
		{
			System.out.println(num+ " is a diplicate");
		}
		else
		{
			System.out.println(num+ " is not a diplicate");
		}
	}
	//to print random 
	public void random()
	{
		Random rdm=new Random();
		int r=rdm.nextInt(100);
		System.out.println(r);
		double d=rdm.nextDouble();
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		Day2 day=new Day2();
		//day.multiply();
		//day.factorial();
		//day.fibonocci();
		//day.reverse();
		//day.prime();
		//day.armstrong();
		//day.stringrev();
		//day.palliandrome();
		//day.wordRev();
		//day.array();
		//day.arrayduplicate();
		//day.random();
		day.sumofarray();

	}

}
