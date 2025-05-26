package Swathy;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class Array {
	Scanner sc=new Scanner(System.in);
	//Extract even and odd numbers from an array
	public void evenodd()
	{
		int a[][]=new int[3][3];
		System.out.println("Enter array elements of 1st array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}
		System.out.println("your 1st array is......");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println("");
	}
		 System.out.println("even numbers are ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				 if(a[i][j]%2==0)
				 {
					
					 System.out.print(a[i][j]+" ");
				 }
				 
			}
		}
		 System.out.println("odd numbers are \n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{	
				 if(a[i][j]%2!=0)
				 {
				
					 System.out.print(a[i][j] +" ");
				 }
				 
			}
		}
	}
	//bubblesort
	public void bubblesort()
	{
		int a[]= {2,3,1,8,4,9};
		System.out.println("Array before sorting " +Arrays.toString(a));
		int n=a.length;
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println("Array after sorting " +Arrays.toString(a));
	}
	public void sort2()
	{
		int a[]= {4,7,1,8,2,5};
		Arrays.parallelSort(a);
		//Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		Array array=new Array();
		//array.evenodd();
		//array.bubblesort();
		array.sort2();
		

	}

}
