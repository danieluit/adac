package org.hotelbook;

import org.base.LibGlobal;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends LibGlobal {

	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (className="login_title")
	private WebElement txtbookahotel;
	
	
	@FindBy (id="first_name")
	private WebElement txtFirstName;
	
	@FindBy (id="last_name")
	private WebElement txtlastName;
	
	@FindBy (id="address")
	private WebElement txtAddress;
	
	@FindBy (id="cc_num")
	private WebElement txtCcNo;
	
	@FindBy (id="cc_type")
	private WebElement dDnCcType;
	
	@FindBy (id="cc_exp_month")
	private WebElement dDnExpMonth;
	
	@FindBy (id="cc_exp_year")
	private WebElement dDnExpYear;
	
	@FindBy (id="cc_cvv")
	private WebElement txtCvvNo;
	
	@FindBy (id="book_now")
	private WebElement btnBookNow;
	
	@FindBy (id="order_no")
	private WebElement orderid;
	
	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getTxtbookahotel() {
		return txtbookahotel;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtlastName() {
		return txtlastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcNo() {
		return txtCcNo;
	}

	public WebElement getdDnCcType() {
		return dDnCcType;
	}

	public WebElement getdDnExpMonth() {
		return dDnExpMonth;
	}

	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}

	public WebElement getTxtCvvNo() {
		return txtCvvNo;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	

	public void bookingPage(String firstname,String lastName,String address,String cardnum,String cardtype,String expmonth,String expyear,String cvv) throws InterruptedException {
		type(getTxtFirstName(), firstname);
		type(getTxtlastName(), lastName);
		type(getTxtAddress(), address);
		type(getTxtCcNo(), cardnum);
		selectoptionByText(getdDnCcType(), cardtype);
		selectoptionByText(getdDnExpMonth(), expmonth);
		selectoptionByText(getdDnExpYear(), expyear);
		type(getTxtCvvNo(), cvv);
		click(getBtnBookNow());
		Thread.sleep(5000);
		String data = getAttribute(getOrderid(),"value");
		System.out.println(data);
	}
	
	
	
	
	
	
	

}
