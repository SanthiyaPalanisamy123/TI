package com.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.UtilityClass;

public class TIRoomsPage extends UtilityClass{
	public TIRoomsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='room-name'])[1]")
	private WebElement roomName;
	
	public WebElement getRoomName() {
		return roomName;
	}
}
