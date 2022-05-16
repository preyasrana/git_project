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
	WebElement lnk_new_window;

	@FindBy(xpath = "//div[@id='mys-content']//div[@id='dismiss-button']")
	WebElement btn_Windowclose;

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

	public void click_new_window() {
		isClickable(lnk_new_window);
	}
	
	

}
