package Swathy;

public class Pattern {
	public void square() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");

		}
	}

	public void emptysquare() {
	    int size = 5; // Define square size

	    for (int i = 0; i < size; i++) { // Loop for rows
	        for (int j = 0; j < size; j++) { // Loop for columns
	            if (j == 0 || j == size - 1 || i == 0 || i == size - 1) {
	                System.out.print("* "); // Add space for better formatting
	            } else {
	                System.out.print("  "); // Space for the hollow part
	            }
	        }
	        System.out.println(); // Move to the next line after each row
	    }
	}
	public void leftangletriangle()
	{
		int size=5;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void rightangletriangle()
	{
		int size=5;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<=size-i-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void rightAngletriangle() {
	    int size = 5; // Define the size of the triangle

	    for (int i = 0; i < size; i++) { // Loop for rows
	        for (int j = 0; j < size - i - 1; j++) { // Loop for spaces
	            System.out.print("  "); // Print spaces
	        }
	        for (int j = 0; j <= i; j++) { // Loop for asterisks
	            System.out.print("* ");
	        }
	        System.out.println(); // Move to the next line after each row
	    }
	}
	public void numberstriangle()
	{
		int size=5;
		int num=1;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(num++ +"  ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Pattern p = new Pattern();
		// p.square();
		//p.emptysquare();
		//p.triangle();
		//p.rightangletriangle();
		p.numberstriangle();

	}

}
