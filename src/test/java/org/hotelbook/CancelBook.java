package org.hotelbook;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBook extends LibGlobal {
	public CancelBook() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath ="//a[text()='Booked Itinerary']")
	private WebElement btncancel;
	
	@FindBy (name ="ids[]")
	private WebElement btnradio;
	
	@FindBy (xpath = "(//input[@type='button'])[1]")
	private WebElement btnconfirm;
	
	public WebElement getBtncancel() {
		return btncancel;
	}

	public WebElement getBtnradio() {
		return btnradio;
	}

	public WebElement getBtnconfirm() {
		return btnconfirm;
	}

	public void cancelboo() {
		click(getBtncancel());
		click(getBtnradio());
		click(getBtnconfirm());
		alert();
	}
	
	

}
