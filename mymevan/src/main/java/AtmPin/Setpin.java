package AtmPin;
/*Program to withdraw amount from an ATM
 Class 1- Bank One method to set pin from "User" class and validate Pin in another method [Valid pins – 1001, 1234, 1212] 
Pin number should declare as private 
Class 2 – User Get the pin from User*/

import java.util.Scanner;

public class Setpin 
{
	public double amount=100000;
	private int pinNumber;
	public int getPinNumber() 
	{
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) 
	{
		this.pinNumber = pinNumber;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	private String customerName;
	
	public void check()
	{
		//this.pin =pin;
		if(pinNumber==1212||pinNumber==1234||pinNumber==1001)
		{
			System.out.println("Valid Pin");
			withdraw();
		}
		else
		{
			System.out.println("Invalid Pin");
		}
	
	
	}
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw");
		int a=sc.nextInt();
		if(a<amount)
		{
			amount=amount-a;
			System.out.println("Operation in progress...your new balance is"+amount);
		}
		else
		{
			System.out.println("Sorry.. insufficient balance");
		}
		sc.close();
		
	}
	
}
