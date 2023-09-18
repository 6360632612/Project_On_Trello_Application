package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrellowelcomePage {
WebDriver driver;
public TrellowelcomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy (xpath = "//*[contains(@class,'szBTSFrvPTLGHM')]")
private WebElement createOption;
public WebElement getcreateOption()
{
	return createOption;
}

@FindBy(xpath = "//span[text()='Create board']")
private WebElement createBoardOption;
public WebElement getCreateBoardOption() {
	return createBoardOption;
}
@FindBy(xpath = "//button[@title='🌈']")
private WebElement colourOption;

public WebElement getColourOption() {
	return colourOption;
}

@FindBy(xpath = "//*[contains(@class,'nch-textfield__input lsOhPsHuxEMYEb VkPAAkbpkKnPst')]")
private WebElement bordtitleTextField;

public WebElement getBordtitleTextField() {
	return bordtitleTextField;
}

@FindBy(xpath = "//button[text()='Create']")
private WebElement finalCreateButton;

public WebElement getFinalCreateButton() {
	return finalCreateButton;
}
}

====================================================================================================================================================================


package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomepage 
{
	WebDriver driver;
	//performing the login process
	public TrelloHomepage(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (xpath = "//*[contains(@class,'Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr')]")
		private WebElement loginOption;
		public WebElement getLoginOption() 
		{
		return loginOption;
		}
		
		//again performing the log out process
		
		@FindBy(xpath = "//*[contains(@class,'DweEFaF5owOe02 rQ86P0iNikD4I9 Cg0RMJhBknTRbM')]")
		private WebElement profileicon;
		public WebElement getProfileicon() {
			return profileicon;
		}
		
		@FindBy(xpath = "//span[text()='Log out']")
		private WebElement logoutOption;
		public WebElement getLogoutOption() {
			return logoutOption;
		}
		
		
		



}


=====================================================================================================================================================================


package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInIntoTrello
{
	WebDriver driver;

	public LogInIntoTrello(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "login")
	private WebElement Continuebutton;

	public WebElement getContinuebutton() {
		return Continuebutton;
	}
	
	@FindBy (xpath = "//span[text()='Log in']")
	private WebElement Loginbutton;

	public WebElement getLoginbutton() {
		return Loginbutton;
	}
}

=========================================================================================================================================================================


package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletCreatedBoard {
WebDriver driver;
public DeletCreatedBoard(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy (xpath = "/HTML/BODY/DIV[1]/DIV[2]/DIV[1]/DIV/MAIN/DIV/DIV[2]/DIV[2]/DIV/DIV[1]/DIV[1]/DIV/DIV/SPAN[2]/BUTTON[2]/SPAN/SPAN")
private WebElement threedotOption; 
public WebElement getthreedotOption()
{
	return threedotOption;
}
@FindBy(xpath = "//*[contains(@class,'board-menu-navigation-item-link js-open-more')]")
private WebElement moreOption;
public WebElement getMoreOption() {
	return moreOption;
}

public WebElement getFinalDeletButton() {
	return finalDeletButton;
}

public void setMoreOption(WebElement moreOption) {
	this.moreOption = moreOption;
}
@FindBy(xpath = "//*[contains(@class,'board-menu-navigation-item-link js-close-board')]")
private WebElement closeBoardOption;
public WebElement getCloseBoardOption() {
	return closeBoardOption;
}
@FindBy(xpath = "//*[contains(@class,'js-confirm full nch-button nch-button--danger')]")
private WebElement closeButton;
public WebElement getCloseButton() {
	return closeButton;
}

@FindBy(xpath = "//*[contains(@class,'Bp80TGmc9hQIdE bxgKMAm3lq5BpA V_9lMAQOdk_AYt SEj5vUdI3VvxDc')]")
private WebElement permanentlydelteBoard;
public WebElement getPermanentlydelteBoard() {
	return permanentlydelteBoard;
}

@FindBy(xpath = "//*[contains(@class,'a72r81xglmtLCW bxgKMAm3lq5BpA KpU415sFFvOzGZ PnEv2xIWy3eSui SEj5vUdI3VvxDc')]")
private WebElement finalDeletButton;

}
