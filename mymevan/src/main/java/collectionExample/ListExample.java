package collectionExample;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public ListExample()
	{
		System.out.println("constructor");
	}

	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		List<String>ls=new ArrayList<String>();
		ls.add("red");
		ls.add("white");
		ArrayList<String> arraylist =new ArrayList<String>();
		arraylist.add("violet");
		arraylist.add("yellow");
		System.out.println(ls);
		System.out.println(arraylist);
		ListExample le=new ListExample();
				
				
		
		
		
	}

}
