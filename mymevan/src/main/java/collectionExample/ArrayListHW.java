/*➢ Write a Java program to create a new array list, add some colors (string) and print out the collection. 
➢ Write a Java program to retrieve an element (at a specified index) from a given array list.
➢ Write a Java program to iterate through all elements in a array list. 
➢ Write a Java program to remove the third element from a array list. 
➢ Write a Java program to search an element in a array list.*/
package collectionExample;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListHW {
	private ArrayList<String> ls;
  
    // Constructor to initialize the color list
    public ArrayListHW() {
        ls = new ArrayList<String>();
    }


	
	public void createArray()
	{

		ls.add("red");
		ls.add("violet");
		ls.add("white");
		ls.add("black");
		ls.add("yellow");
		ls.add("pink");
		System.out.println(ls);
	}
	public void retrieve(int index)
	{
		String color=ls.get(index);
		System.out.println("colour on index no:3 is : "+index);
	}
	public void iterate()
	{
		System.out.println("iterate through all elements");
		Iterator<String> it=ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public void remove(int index)
	{
		String r=ls.remove(index);
		System.out.println("removing " +r+ " element from arraylist");
		System.out.println(ls);
	}
	public void search()
	{
		String search="red";
		if(ls.contains(search))
		{
			System.out.println("red color is present");
		}
		else
		{
			System.out.println("red color not found");
		}
		
	}

	public static void main(String[] args)
	{
		ArrayListHW ah=new ArrayListHW();
				ah.createArray();
				ah.retrieve(1);
				ah.iterate();
				ah.remove(2);
				ah.search();
		

	}

}
