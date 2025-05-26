package collectionExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
	Set<String> set=new HashSet<String>();
	Set<String> set2=new HashSet<String>();
	set.add("one");
	set.add("two");
	set.add("two");
	set.add(null);
	set.add("three");
	set.add("");
	System.out.println(set);
	set.remove("three");
	System.out.println(set);

	
	System.out.println("for each loop");
	for(String e:set)
	{
		System.out.println(e);
	}
	System.out.println("iterator");
	Iterator<String> it=set.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
	set2.add("jan");
	set2.add("feb");
	set2.add("march");
	System.out.println(set2);
	set.addAll(set2);
	System.out.println("set2"+set2);
	System.out.println("set1"+set);
	set.removeAll(set2);
	System.out.println(set2);
	

	}

}
