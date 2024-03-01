package com.mass;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.base.UtilityClass;
import com.login.TILoginPage;
import com.login.TIProductionPage;
import com.login.TIRoomsPage;

public class AddToCart extends UtilityClass{
	@Test
	public void test() throws IOException, InterruptedException {
		// launch the browser
		browserLaunch("https://secure.trialinteractive.com/");
		// maximize the browser
		maximize();
		// wait for all script
		time();

		// Enter the login credentials
		TILoginPage t = new TILoginPage();
		inputText(t.getUser(), stringData(1, 0));
		buttonClick(t.getLoginUser());

		inputText(t.getPass(), stringData(1, 1));
		buttonClick(t.getLogin());

		// click the room
		TIRoomsPage p = new TIRoomsPage();
		try {
			p.getRoomName();
			waitUntilElementVisible(driver, p.getRoomName());
			buttonClick(p.getRoomName());
		}

		catch (Exception e) {
			p.getRoomName();
			waitUntilElementVisible(driver, p.getRoomName());
			buttonClick(p.getRoomName());
		}
		insleep();

		// click the TI production icon
		TIProductionPage q = new TIProductionPage();
		buttonClick(q.getkButtonIcon1());
		insleep();

		// select eTMF
		buttonClick(q.geteTMFRoom());
		lowsleep();
		// select eTMF/Documents
		buttonClick(q.geteTMFDocuments());
		lowsleep();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", q.getUpload());
		buttonClick(q.getUpload());
		insleep();
	
		buttonClick(q.getCheckBox());
		
		Actions a=new Actions(driver);
		a.contextClick(q.getBox2());
		
        
	}}
