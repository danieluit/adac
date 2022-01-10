package org.hotelbook;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotellogin extends LibGlobal {
	public Hotellogin() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (id="username")
	private WebElement txtUserName;
	
	@FindBy (id="password")
	private WebElement txtPassword;
	
	@FindBy (id="login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void Loginpage(String userName, String passWord ) {
		type(getTxtUserName(), userName);
		type(getTxtPassword(), passWord);
		click(getBtnLogin());
		
		
	}
	

}



