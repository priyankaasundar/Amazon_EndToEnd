package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Testdata
{
public static  String getData(int row, int col) throws EncryptedDocumentException, IOException, InterruptedException
{
	 FileInputStream fs=new FileInputStream("D:\\Automation Workspace\\AmazonEndtoEnd1\\target\\Excel\\Login.xlsx");
	 Workbook wb=WorkbookFactory.create(fs);
	 Sheet sheet = wb.getSheet("LoginPage");
     String data = sheet.getRow(row).getCell(col).toString();
	 return data;
}
}
