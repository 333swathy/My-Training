package Swathy;

public class ReverseString {
	public void stringrev()
	{
		String name="SWATHY";
		String rev="";
		int lenght=name.length();
		for(int i=lenght-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("string reverse is : "+rev);
		
	}
	public void strinrev2()
	{
		String name="NIHAARA";
		String rev="";
		char a[]=name.toCharArray();
		int length=name.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.print("string reverse is : "+rev);
		
	}
	public void stringbuffer()
	{
		String name="ANITHA";
		StringBuffer sb=new StringBuffer(name);
		System.out.println(sb.reverse());
	}

	public static void main(String[] args) 
	{
		ReverseString revstring=new ReverseString();
		revstring.stringrev();
		revstring.strinrev2();
		revstring.stringbuffer();
		

	}

}
