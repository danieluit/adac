package org.hotelstepdefinision;

import org.base.LibGlobal;
import org.hotelbook.BookHotel;
import org.hotelbook.CancelBook;
import org.hotelbook.Hotellogin;
import org.hotelbook.SearchHotel;
import org.hotelbook.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinision extends LibGlobal {
	
	@Given("User is on the adactin page")
	public void userIsOnTheAdactinPage() {
		
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		
	}

	@When("User should login {string} and {string}")
	public void userShouldLoginAnd(String string, String string2) {
		
		Hotellogin login = new Hotellogin();
		login.Loginpage(string,string2 );
		
	}

	@When("User should enter Search Hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userShouldEnterSearchHotel(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		
		SearchHotel search = new SearchHotel();
		search.searchHotels(string, string2, string3, string4, string5, string6, string7, string8);
	}

	
	@When("User should enter Select Hotel click radiobutton and Continue button")
	public void userShouldEnterSelectHotelClickRadiobuttonAndContinueButton() {
		
		SelectHotel sel = new SelectHotel();
		sel.selectHotel();
	}

	@When("User should enter Book A Hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userShouldEnterBookAHotel(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
		
		BookHotel boo = new BookHotel();
		boo.bookingPage(string, string2, string3, string4, string5, string6, string7, string8);
		
	}
	@Then("User want to cancel booking")
	public void userWantToCancelBooking() {
    CancelBook cancel = new CancelBook();
    cancel.cancelboo();
	
	}


	

}
