package package2;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import package_1.Rbi;

public class Sbi implements Rbi
{

	
		XSSFSheet sh;
		public Sbi() throws IOException
		{
			FileInputStream fp=new FileInputStream("C:\\Users\\GOKUL\\git\\My-Training\\mymevan\\src\\test\\resources\\package1.xlsx");
			XSSFWorkbook w=new XSSFWorkbook(fp);
			sh=w.getSheet("sheet1");
		}
		public boolean WithdrawalGreaterThan50k(double amount) 
		{
			
			return amount>50000;
		}


		public double rateOfInterest(int i, int j) 
		{
			Row r=sh.getRow(i);
			Cell c=r.getCell(j);
			double interest=c.getNumericCellValue();
			return interest;
			
		}
		public double simpleInterest(double principal, double years) 
		{
		        double rate = rateOfInterest(1,2);
		        return (principal * years * rate) / 100;
		}

}

