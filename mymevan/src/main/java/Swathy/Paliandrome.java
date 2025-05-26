
package Swathy;

import java.util.Scanner;

public class Paliandrome {
	Scanner sc=new Scanner(System.in);
	
	public void palianNum()
	{
		System.out.println("Enter the number you want to see paliandrome/Not");
		int num=sc.nextInt();
		int orgNum=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("rev num is "+rev);
		if(orgNum==rev)
		{
			System.out.println(+orgNum+" is a Paliandrome");
		}
		else
		{
			System.out.println(+orgNum+" is Not a Paliandrome");
		}
	}
	public void palianString()
	{
		System.out.println("Enter the string you want to know paliandrom/Not");
		String s=sc.nextLine();
		String o="";
		int length=s.length();
		//char a[]=s.toCharArray();
		for(int i=length-1;i>=0;i--)
		{
			o=o+s.charAt(i);
		}
		if(s.equalsIgnoreCase(o))
		{
			System.out.println(o+ " is a paliandrome");
		}
		else
		{
			System.out.println(o+ " is not a paliandrome");
		}
		
	}
	

	
	public static void main(String[] args) 
	{
		Paliandrome paliandrome=new Paliandrome();
		//paliandrome.palianNum();
		paliandrome.palianString();
		
		

	}

}
