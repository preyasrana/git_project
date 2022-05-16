package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.testbase;

public class Learning_Page extends testbase {

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a[contains(text(),'SwitchTo')]")
	WebElement lbl_Switchto;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//ul//li//a[contains(text(),'Windows')]")
	WebElement lnk_Windows;

	@FindBy(id = "aswift_2")
	WebElement frm_mainframe;

	@FindBy(id = "ad_iframe")
	WebElement frm_Advertisement;

	@FindBy(xpath = "//div[@class='tabpane pullleft']//li//a[contains(text(),'Open New Seperate Windows')]")
	WebElement lnk_new_Seperatewindow;
	
	@FindBy(xpath = "//div[@class='tabpane pullleft']//li//a[contains(text(),'Open New Tabbed Windows ')]")
	WebElement lnk_new_tabbedwindow;

	@FindBy(xpath = "//div[@id='mys-content']//div[@id='dismiss-button']")
	WebElement btn_Windowclose;
	
	@FindBy(xpath = "//div[@class='tab-content']//div[1]//a")
	WebElement btn_tabbed_click;
	
	@FindBy(xpath = "//a[@class='nav-link']//span[contains(text(),'Downloads')]")
	WebElement lnk_download;
	
	@FindBy(xpath = "//a[@class='nav-link']//span[contains(text(),'Documentation')]")
	WebElement lnk_Documentation;
	
	@FindBy(xpath = "//div[@class='tab-content']//div[@id='Seperate']//button[contains(text(),'click')]")
	WebElement btn_seperate_click;
	
	
	public Learning_Page() {

		PageFactory.initElements(driver, this);
	}

	public void hover_Switchto() throws InterruptedException {
		moveToElement(lbl_Switchto);

	}

	public void click_windows() {
		isClickable(lnk_Windows);
	}

	public void switchframe_advertise() {

		switchToFrame(frm_mainframe);
		switchToFrame(frm_Advertisement);
	}

	public void click_windows_close() {
		isClickable(btn_Windowclose);
	}

	public void switch_parentwindow() {
		switchToparent();
		switchToparent();
	}

	public void click_new_seperatewindow() {
		isClickable(lnk_new_Seperatewindow);
	}
	
	public void click_new_tabbedwindow() {
		isClickable(lnk_new_tabbedwindow);
	}
	
	public void click_on_btntabbed() {
		isClickable(btn_tabbed_click);
	}
	
	public void click_on_Download() {
		isClickable(lnk_download);
	}
	
	public void click_on_Documentation() {
		isClickable(lnk_Documentation);
	}
	
	public void click_on_btnseperate() {
		isClickable(btn_seperate_click);
	}
	
	

}
