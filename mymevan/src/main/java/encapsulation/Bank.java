package encapsulation;

public class Bank
{
	final float RATE=8.5f;
	private double accBalance;
	private String cusName;
	public double getAccBalance()
	{
		return accBalance;
	}
	public void setAccBalance(double accBalance)
	{
		this.accBalance = accBalance;
	}
	public String getCusName() 
	{
		return cusName;
	}
	public void setCusName(String cusName)
	{
		this.cusName = cusName;
	}
	
	public void interst()
	{
		double interst=(accBalance*2*RATE)/100;
		accBalance+=interst;
		}

}
