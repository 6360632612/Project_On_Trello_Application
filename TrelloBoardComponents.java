package Trellopageopen;

import org.testng.annotations.Test;

import com.trello.qsp.GenericUtility.BaseClass;
import com.trello.qsp.pomrepository.TrelloHomepage;

import trello.Repository.TrelloCreateBoard;
import trello.Repository.TrelloDeleteBoard;
import trello.Repository.TrelloHomepage1;

public class TrelloEndtoEnd  extends BaseClass{
	@Test
	public void logintoHomepage() throws Throwable {
		webdriverutils.implicitwait(driver);
		TrelloHomepage1 homepage=new TrelloHomepage1(driver);
		homepage.getLoginOption().click();
		homepage.getEmailTextField().sendKeys(fileutilils.readCommondata("username"));
		homepage.getContinueButton().submit();
		webdriverutils.elementTobeVisible(driver, homepage.getPasswordTextfield());
		homepage.getPasswordTextfield().sendKeys(fileutilils.readCommondata("password"));
		homepage.getLoginButoninpwdpage().submit();
		webdriverutils.verifycompleteTitle(driver, driver.getTitle());
		TrelloCreateBoard createBoard=new TrelloCreateBoard(driver);
		createBoard.getCreateBoardOption().click();
		createBoard.getBoardTitletextField().sendKeys("Jai sree Ram");
	    webdriverutils.elementTobeClickable(driver,createBoard.getCreateButton() );
		createBoard.getCreateButton().click();
		webdriverutils.verifycompleteTitle(driver, driver.getTitle());
		TrelloDeleteBoard deleteBoard=new TrelloDeleteBoard(driver);
		deleteBoard.getThreeDot().click();
		deleteBoard.getMoreOption().click();
		deleteBoard.getCloseOption().click();
		deleteBoard.getCloseButton().click();
		webdriverutils.elementTobeClickable(driver, deleteBoard.getPermanentlyDeletOption()).click();;
		webdriverutils.elementTobeClickable(driver, deleteBoard.getFinalDeletbutton()).click();
		Thread.sleep(20000);
		
	}

}
