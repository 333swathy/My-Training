package collectionExample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String>ls=new ArrayList<String>();//Arraylist ls=new Arraylist()
		//ls.add(120);//idf<string> method is not mentioned
		ls.add("swathy");
		ls.add("mredura");
		ls.add("sujith");
		ls.add("harsha");
		ls.add("harsha");//duplication possible in list
		//ls.add(null);//null value possible
		System.out.println(ls);

	ls.remove(4);
	System.out.println(ls);
	Collections.sort(ls);//static method
	System.out.println(ls);
	/*System.out.println("list using loop");
	for(int i=0;i<ls.size();i++)
	{
		System.out.println(ls.get(i));
	}
	System.out.println("list using for each loop");
for(String element: ls) OR for(String e: ls)
{
	System.out.println(element);
}*/
	Iterator<String> it=ls.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
