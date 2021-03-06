package package3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDOBExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("C:/Users/AviPrabha/Desktop/dataSheet1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row rw = sh.getRow(2);
		Cell cl = rw.getCell(7);
		Date date=cl.getDateCellValue();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String value = sdf.format(date);
		System.out.println(value);
		
	}

}
