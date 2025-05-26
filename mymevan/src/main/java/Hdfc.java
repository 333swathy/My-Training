import java.util.*;

public class Hdfc implements rbiInterface

{

	@Override
	public String customerName(String name) {

		return name;
	}

	@Override
	public void recurringDeposit(double amount, int duration) {
		double maturityAmount = amount * (1 + (INTERSTRATE * duration / 100));

		System.out.println("Your interest rate will be : " + maturityAmount);

	}

	public static void main(String[] args) {
		Hdfc hdfc = new Hdfc();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String s = sc.nextLine();
		System.out.println("Enter the amount you want to deposit");
		double amount = sc.nextDouble();
		System.out.println("Enter your deposit duration");
		int duration = sc.nextInt();
		System.out.println("Greetings " +hdfc.customerName(s));
		hdfc.recurringDeposit(amount, duration);
		sc.close();

	}

}
