package Swathy;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class Stringprograms {
	Scanner sc= new Scanner(System.in);
	//to remove junk from string
	public void junk()
	{
		String s="5654927$@#*$^^%*&^&*^& hello all";
		s=s.replaceAll("[^a-zA-Z0-9]","");//^-means other than this
		System.out.println(s);
	}
	//to remove whilte space from string
	public void whiltespace()
	{
		String s="java   is a programming language";
				s=s.replaceAll("\\s", "");
		System.out.println(s);
	}
	//occurance of charachter in a string
	public void occurance()
	{
		String s="java is a programming language";
		int total=s.length();//total count
		System.out.println(total);
		String s1=s.replace("a", "");//remove all a
		System.out.println(s);
		System.out.println(s1);
		int totawithoutA =s1.length();//total count without a
		System.out.println(totawithoutA);
		int count=total-totawithoutA;
		System.out.println("String in which 'a' occurances is " +count);
	} 
	//count word in a string
	public void stringcount()
	{
		System.out.println("Enter your string");
		String s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		 Stringprograms str=new  Stringprograms();
		 //str.junk();
		 //str.whiltespace();
		 //str.occurance();
		 str.stringcount();
		 

	}

}
