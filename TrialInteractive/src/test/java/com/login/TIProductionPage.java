package com.login;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.UtilityClass;

public class TIProductionPage extends UtilityClass {
	public TIProductionPage() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath="//*[@class='k-button-icon fa fa-th icon-size ng-star-inserted']")
	private WebElement kButtonIcon1;

	@FindBy(xpath="(//*[@class='context-item mark-active ng-star-inserted'])[12]")
	private WebElement settings;
	
	@FindBy(xpath="(//span[(text()='Documents')])")
	private WebElement document;
			
	@FindBy(xpath="//span[@class='k-button-icon fa fa-th icon-size ng-star-inserted']")
	private WebElement buttonIcon2;
	
	@FindBy(xpath="//a[@title='eTMF']")
	private WebElement eTMFRoom;
	
	@FindBy(xpath="(//*[@class='sidebar-menu__item'])[1]")
	private WebElement eTMFDocuments;
	
	@FindBy(xpath="//*[text()='Import']")
	private WebElement Import;
	
	@FindBy(xpath="(//*[text()='Documents'])[2]")
	private WebElement uploadDocuments;
	
	@FindBy(xpath="//*[text()='Browse']")
	private WebElement browse;
	
	@FindBy(xpath="//*[text()='Import and Apply Metadata']")
	private WebElement apply;
	
	@FindBy(xpath="//*[text()='Yes']")
	private WebElement yes;
	
	@FindBy(xpath="//div[@class='fa fa-caret-down ng-star-inserted']")
	private WebElement viewBy;
	
	@FindBy(xpath="//*[text()='Posted Date']")
	private WebElement postedDate;
	
	@FindBy(xpath="(//*[@class='k-treeview-item ng-tns-c52-26 ng-star-inserted'])[1]")
	private WebElement box1;
	
	@FindBy(xpath="//*[@class='main-button k-button k-button-md k-rounded-md k-button-flat-primary k-button-flat ng-star-inserted']")
	private WebElement kButton3;
	
	@FindBy(xpath="//*[text()='Processed Documents']")
	private WebElement processedDocs;
	
	@FindBy(xpath="(//*[@class='k-i-caret-alt-right k-icon ng-star-inserted'])[4]")
	private WebElement pdfConversion;
	
	@FindBy(xpath="(//*[@class='tree-node-wrapper ng-star-inserted'])[5]")
	private WebElement pending;
	
	@FindBy(xpath="(//*[@class='tree-node-wrapper ng-star-inserted'])[6]")
	private WebElement inprogress;
	
	@FindBy(xpath="(//*[@class='tree-node-wrapper ng-star-inserted'])[7]")
	private WebElement processed;
	
	@FindBy(xpath="//*[@class='k-treeview-md k-treeview']")
	private WebElement block1;
	
	@FindBy(xpath="(//*[@class='tree-node-wrapper ng-star-inserted'])[13]")
	private WebElement upload;
	
	@FindBy(xpath="(//div[@class='tree-node-wrapper ng-star-inserted'])[81]")
	private WebElement user1;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement checkBox;
	
	@FindBy(xpath="//span[text()='Mass Coding']")
	private WebElement mass;
	
	@FindBy(xpath="//*[@id='mass-coding-reason']")
	private WebElement reason;
	
	@FindBy(xpath="(//*[@class='k-i-calendar k-button-icon k-icon ng-star-inserted'])[1]")
	private WebElement calender;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
    private WebElement category;
	
	@FindBy(xpath="//*[text()='General']")
	private WebElement type;

	@FindBy(xpath="//*[@class='k-icon k-i-tag ng-star-inserted']")
	private WebElement DocType;
	
	@FindBy(xpath="//*[@class='doc-info-input k-textbox w-100']")
	private WebElement search;
	
	@FindBy(xpath="//*[@class='k-checkbox-label ng-star-inserted']")
	private WebElement box;
	
	@FindBy(xpath="//*[text()='Select']")
	private WebElement select;
	
	@FindBy(xpath="//*[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement box2;  
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	private WebElement box3;  
	
	
	public WebElement getBox3() {
		return box3;
	}
	public WebElement getBox2() {
		return box2;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getCalender() {
		return calender;
	}
	public WebElement getDocType() {
		return DocType;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getBox() {
		return box;
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getCategory() {
		return category;
	}
	public WebElement getReason() {
		return reason;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getBlock1() {
		return block1;
	}
	public WebElement getUpload() {
		return upload;
	}
	public WebElement getMass() {
		return mass;
	}
	public WebElement getUser1() {
		return user1;
	}
	public WebElement getkButtonIcon1() {
		return kButtonIcon1;
	}
	public WebElement getSettings() {
		return settings;
	}
	public WebElement getDocument() {
		return document;
	}
	public WebElement getButtonIcon2() {
		return buttonIcon2;
	}
	public WebElement geteTMFRoom() {
		return eTMFRoom;
	}
	public WebElement geteTMFDocuments() {
		return eTMFDocuments;
	}
	public WebElement getImport() {
		return Import;
	}
	public WebElement getUploadDocuments() {
		return uploadDocuments;
	}
	public WebElement getBrowse() {
		return browse;
	}
	public WebElement getApply() {
		return apply;
	}
	public WebElement getYes() {
		return yes;
	}
	public WebElement getViewBy() {
		return viewBy;
	}
	public WebElement getPostedDate() {
		return postedDate;
	}
	public WebElement getBox1() {
		return box1;
	}
	public WebElement getkButton3() {
		return kButton3;
	}
	public WebElement getProcessedDocs() {
		return processedDocs;
	}
	public WebElement getPdfConversion() {
		return pdfConversion;
	}	
	public WebElement getPending() {
		return pending;
	}
	public WebElement getInprogress() {
		return inprogress;
	}
	public WebElement getProcessed() {
		return processed;
	}
	public WebElement getType() {
		return type;
		
	}
}
