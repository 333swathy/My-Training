package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException 
	{
		ExcelRead obj= new ExcelRead();
		obj.readFile();
		System.out.println("value is : "+obj.readData(2, 1));
	}

}
