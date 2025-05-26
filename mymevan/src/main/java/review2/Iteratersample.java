package review2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratersample {
	

	public static void main(String[] args) {
		List<String> ls=new ArrayList<String>();
		ls.add("swathy");
		ls.add("mredura");
		Iterator<String> it=ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
