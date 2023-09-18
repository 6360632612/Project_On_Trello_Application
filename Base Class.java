
package com.trello.qsp.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public WebDriver driver;
public ExcelUtility excelutilils=new ExcelUtility();
public Fileutility fileutilils=new Fileutility();
public JavaUtility javautilils=new JavaUtility();
public WebdriverUtility webdriverutils=new WebdriverUtility();

@BeforeMethod  
public void configbeforeMethod() throws Throwable
{
	String browsername = fileutilils.readCommondata("browser");
	if(browsername.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browsername.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	else if(browsername.equals("firefox")) 
	{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(fileutilils.readCommondata("url"));
}
@AfterMethod
public void configAftermethod()
{
	driver.manage().window().minimize();
	driver.quit();
}
}
