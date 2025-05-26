package execptionExample;

public class Throw {
	
	public void age() throws Exception
	{
		int age=10;
				if(age>18)
				{
					System.out.println("Eligible for voting");
				}
				else
				{
					throw new Exception("Not Eligible for voting");//NEED THROWS IN MAIN METHOD ONLY FOR"EXCEPTION"
				}
	}

	public static void main(String[] args) throws Exception {
		Throw th=new Throw();
		th.age();
		

	}

}
