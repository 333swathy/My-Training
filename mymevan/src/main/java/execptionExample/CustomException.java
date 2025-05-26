package execptionExample;

public class CustomException {
	public void age() throws VotingException {
		int age = 10;
		if (age > 18) {
			System.out.println("Eligible for voting");
		} else 
		{
			throw new VotingException("not eligible");//this after new value will be going to constructor

		}
	}

	public static void main(String[] args) throws VotingException {
		CustomException ce = new CustomException();
		ce.age();
	}

}
