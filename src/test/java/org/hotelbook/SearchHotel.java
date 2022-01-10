package org.hotelbook;

import org.base.LibGlobal;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LibGlobal {

	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="location")
	private WebElement dDnLocation;
	
	@FindBy (id="hotels")
	private WebElement dDnHotels;
	
	@FindBy (id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy (id="room_nos")
	private WebElement dDnNoOfRooms;
	
	
	@FindBy (id="datepick_in")
	private WebElement txtChechInDate;
	
	@FindBy (id="datepick_out")
	private WebElement txtChechOutDate;
	
	@FindBy (id="adult_room")
	private WebElement dDnAdultPerRoom;
	
	@FindBy (id="child_room")
	private WebElement dDnChildernPerRoom;
	
	@FindBy (id="Submit")
	private WebElement btnSearch;
	
	@FindBy (id="username_show")
	private WebElement txtWelcome;
	
	
	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getTxtChechInDate() {
		return txtChechInDate;
	}

	public WebElement getTxtChechOutDate() {
		return txtChechOutDate;
	}

	public WebElement getdDnAdultPerRoom() {
		return dDnAdultPerRoom;
	}

	public WebElement getdDnChildernPerRoom() {
		return dDnChildernPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTxtWelcome() {
		return txtWelcome;
	}
	
	
	

	public void verifyWelcomeText(String expvalue) {
		String actvalue = getAttribute(getTxtWelcome());
		Assert.assertEquals("Verify welcome Msg",expvalue,actvalue);
		
		

	}
	
	public void searchHotels(String location,String hotels,String roomType,String noOfRoom,String checkInDate,String checkOutDate,String adultPerRoom,String childrenPerRoom ) {
		
		selectoptionByVisible(getdDnLocation(), location);
		selectoptionByVisible(getdDnHotels(), hotels);
		selectoptionByVisible(getdDnRoomType(), roomType);
		selectoptionByVisible(getdDnNoOfRooms(), noOfRoom);
		type(getTxtChechInDate(), checkInDate);
		type(getTxtChechOutDate(), checkOutDate);
		selectoptionByVisible(getdDnAdultPerRoom(), adultPerRoom);
		selectoptionByVisible(getdDnChildernPerRoom(), childrenPerRoom);
		click(getBtnSearch());
		
		
		
		
		

	}
	
	
	
	
	
	

}


