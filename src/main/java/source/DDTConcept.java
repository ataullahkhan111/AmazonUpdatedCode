package source;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDTConcept {
	
	public static String username, password;
	public void DDTUsernamepassword() throws EncryptedDocumentException, IOException
	{
		
		//step 1 let the java know where exactly is sheet present
		FileInputStream f1 = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\SeleniumUpdatedAmazonProject\\DataInSheet\\YoursSheet.xlsx");
		
		// 2 Open the excel sheet
		Workbook w1 = WorkbookFactory.create(f1);

       username = NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(0).getNumericCellValue());

      password = w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
        // NumberToTextConverter.toText
	}

}
