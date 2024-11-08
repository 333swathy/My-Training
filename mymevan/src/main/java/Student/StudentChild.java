package Student;

public class StudentChild extends StudentParent
{
	public String gme;
public void games(String m)
{
	gme=m;
}
public void display()
{
	System.out.println("Name : "+name);
	System.out.println("id : "+id);
	System.out.println("grade : "+g);
	System.out.println("Game: "+gme);
	}

	public static void main(String[] args)
	{
		StudentChild sd=new StudentChild();
		sd.studentDetails();
		sd.studentMarks();
		sd.games("cricket");
		sd.display();
	}

}
