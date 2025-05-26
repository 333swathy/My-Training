package package4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import package2.Sbi;
import package3.Federal;

public class User {

	public static void main(String[] args) throws IOException
	{
		 XSSFSheet sh;
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Select a Bank: 1. SBI  2. Federal Bank");
	     int bankChoice = scanner.nextInt();
	     System.out.println("Enter Withdrawal Amount: ");
	     double withdrawalAmount = scanner.nextDouble();
	  
    	 FileInputStream fp=new FileInputStream("C:\\Users\\GOKUL\\git\\My-Training\\mymevan\\src\\test\\resources\\package1.xlsx");
 		XSSFWorkbook w=new XSSFWorkbook(fp);
	     
	     if (bankChoice == 1) 
	     {
	            
	 		sh=w.getSheet("sheet1");
	 		Row r=sh.getRow(1);
			Cell c=r.getCell(0);
			double principal=c.getNumericCellValue();
			
			Row r1=sh.getRow(1);
			Cell c1=r1.getCell(1);
			double years=c1.getNumericCellValue();
	            Sbi sbi = new Sbi();
	            //sbi.rateOfInterest(1, 0);
	           // sbi.rateOfInterest(1, 1);
	            
	            if (sbi.WithdrawalGreaterThan50k(withdrawalAmount)) 
	            {
	                System.out.println("PAN is required for withdrawal greater than 50,000.");
	                System.out.println("Enter your pan");
	                scanner.nextLine();
	                String pan = scanner.nextLine();
		            
	            }
	            double simpleInterest = sbi.simpleInterest(principal, years);
	            System.out.println("Simple Interest for SBI: " + simpleInterest);
	            
	        } 
	     else if (bankChoice == 2) 
	        {
	    	 	sh=w.getSheet("federal");
		 		Row r=sh.getRow(1);
				Cell c=r.getCell(0);
				double principal=c.getNumericCellValue();
				
				Row r1=sh.getRow(1);
				Cell c1=r1.getCell(1);
				double years=c1.getNumericCellValue(); 
	            Federal federal = new Federal();
	            
	           
	            if (federal.WithdrawalGreaterThan50k(withdrawalAmount)) 
	            {
	                System.out.println("PAN is required for withdrawal greater than 50,000.");
	                System.out.println("Enter your pan");
	                scanner.nextLine();
	                String pan = scanner.nextLine();
	                
	            }
	            
	            double compoundInterest = federal.compoundInterest(principal, years);
	            System.out.println("Compound Interest for Federal Bank: " + compoundInterest);
	        } 
	     else 
	     {
	            System.out.println("Invalid bank choice.");
	      }
	        
	        scanner.close();
	        
	}

	        
	    }

	


