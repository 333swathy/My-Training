package Student;
import java.util.*;

public class StudentParent
{
	public char g;
	String name;int id;
	public void studentDetails()
	{
		System.out.print("Student Name");
		name=new java.util.Scanner(System.in).nextLine();
		System.out.print("Student id");
		id=new java.util.Scanner(System.in).nextInt();
		//System.out.println("Student Batch: A");
	}
	public void studentMarks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter student grade");
		g=sc.next().charAt(0);
		
		
	}

}
