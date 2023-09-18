package com.trello.qsp.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public String readStringData(String sheetname,int rowindex,int cellindex) throws Throwable, FileNotFoundException, IOException
{
	Workbook workbook = WorkbookFactory.create(new FileInputStream("./Testdata/Test1.xlsx"));
	String value = workbook.getSheet(sheetname).getRow(rowindex).getCell(cellindex).getStringCellValue();
	return value;
}
public double readNumericData(String sheetname,int rowindex,int cellindex) throws Throwable, FileNotFoundException, IOException
{
	Workbook workbook = WorkbookFactory.create(new FileInputStream("./Testdata/Test1.xlsx"));
	double value = workbook.getSheet(sheetname).getRow(rowindex).getCell(cellindex).getNumericCellValue();
	return value;
}


}

=======================================================================================================================================================================


  package com.trello.qsp.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Fileutility {
public String readCommondata(String key) throws Throwable
{
	FileInputStream fis=new FileInputStream("./Testdata/inputs.properties");
	Properties pobj = new Properties();
	pobj.load(fis);
	String value = pobj.getProperty(key);
	return value;

}
}


========================================================================================================================================================================


  package com.trello.qsp.GenericUtility;

import java.time.LocalDateTime;

public class JavaUtility {
	public String timestamp()
	{
		return LocalDateTime.now().toString().replace(':', '-');
	}
}

=========================================================================================================================================================================

  package com.trello.qsp.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility 
{
public void implicitwait(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
public boolean verifycompleteTitle(WebDriver driver,String expectedTitle)
{
	return new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.titleIs(expectedTitle));
}
public boolean verifypartialTitle(WebDriver driver,String partialtitle)
{
	return new WebDriverWait(driver, Duration.ofSeconds(10000)).until(ExpectedConditions.titleIs(partialtitle));
}
public WebDriver switchFrameAsElement(WebDriver driver,WebElement frameElement)
{
	return driver.switchTo().frame(frameElement);
}
public void alertButton(WebDriver driver)
{
	 driver.switchTo().alert().accept();
}
public void ActiveElementSendkey(WebDriver driver,String value) throws Throwable {
	driver.switchTo().activeElement().sendKeys(new Fileutility().readCommondata(value));
	
}
public WebElement elementTobeClickable(WebDriver driver,WebElement element)
{
	return new WebDriverWait(driver, Duration.ofSeconds(10000)).until(ExpectedConditions.elementToBeClickable(element));
	
}
public WebElement elementTobeVisible(WebDriver driver,WebElement element)
{
	return new WebDriverWait(driver, Duration.ofSeconds(10000)).until(ExpectedConditions.visibilityOf(element));
	
}


}
