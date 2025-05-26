package customexceptionExample;

public class ExceptionAge {
	public void operation(int age) throws ClassExtendException
	{
		if(age<=19)
		{
			throw new ClassExtendException("invalid age");
		}
		else
		{
			System.out.println("age >19");
		}
	}

	public static void main(String[] args) throws ClassExtendException {
		ExceptionAge ea =new ExceptionAge();
		try
		{
		ea.operation(2);
		}
		catch(ClassExtendException ex)
		{
			System.out.println("age less than 19");
			System.out.println(ex.getMessage());
		}

	}

}
