package org.hotelbook;

import org.base.LibGlobal;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (className="login_title")
	private WebElement txtSelecthotal;
	
	
	@FindBy (id="radiobutton_0")
	private WebElement btnRadioButton;
	
	@FindBy (id="continue")
	private WebElement btnContinue;
	
	public WebElement getTxtSelecthotal() {
		return txtSelecthotal;
	}

	public WebElement getBtnRadioButton() {
		return btnRadioButton;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public void verifyWelcomeText(String expvalue) {
		String actvalue = getAttribute(getTxtSelecthotal());
		Assert.assertEquals("Verify Select hotal Msg",expvalue,actvalue);
		
		

	}
	public void selectHotel() {
		
		click(getBtnRadioButton());
		click(getBtnContinue());
		

	}
	
}
	

