package rivision;

import java.util.Scanner;

public class Day4 {
	Scanner sc = new Scanner(System.in);

	// find duplicate in an array
	public void duplicate() {
		boolean flag = false;
		int a[] = { 1, 3, 5, 7, 8, 1 };
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i] + " is duplicate");
					flag = true;
				}
			}

		}
		if (flag == false) {
			System.out.println("No duplicate element in array");
		}
	}

	// convert first letter to upper case
	public void uppercase() {
		String s = "swathy";
		char[] a = s.toCharArray();
		String result = Character.toUpperCase(s.charAt(0)) + s.substring(1);
		System.out.println(result);

	}

	// covert the first letter of string to lowercase
	public void lowercase() {
		String s = "SWATHY";
		char[] a = s.toCharArray();
		String result = Character.toLowerCase(s.charAt(0)) + s.substring(1);
		System.out.println(result);
	}

	// Write a program to print a right triangle star pattern.
	public void righttriangle() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void righttriangle1() {
		int n = 5;
		for (int i = n; i >=0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// Write a program to print a left triangle star pattern.
	public void lefttrianagle() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Day4 d = new Day4();
		// d.duplicate();
		// d.uppercase();
		// d.lowercase();
		d.righttriangle();
		d.righttriangle1();
		d.lefttrianagle();

	}


}
