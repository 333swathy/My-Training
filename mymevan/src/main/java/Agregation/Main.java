package Agregation;
/*Write a program to get the details of a Student
• Class 1 - Student • Get the student name and roll number 
• Class 2- Address • Get the address of student 
• Print Student name, roll number with address
• There is no IS-A relationship*/

public class Main {

	public static void main(String[] args) 
	{
		StudentName st= new StudentName("swathy",33);
		StudentAddress sdd=new StudentAddress(3,"xyz","kollam",st);
				sdd.display();
	

	}

}
