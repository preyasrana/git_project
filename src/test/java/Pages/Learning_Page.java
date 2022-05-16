package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.testbase;

public class Learning_Page extends testbase {

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a[contains(text(),'SwitchTo')]")
	WebElement lbl_Switchto;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a[contains(text(),'Widgets')]")
	WebElement lbl_Widgets;
	

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//ul//li//a[contains(text(),'Windows')]")
	WebElement lnk_Windows;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//ul//li//a[contains(text(),' Accordion ')]")
	WebElement lnk_Accordion;
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav']//ul//li//a[contains(text(),' Datepicker ')]")
	WebElement lnk_datepicker;

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

	@FindBy(xpath = "//div[@class='panel panel-default']//div[@id='collapse1']")
	WebElement acc_collapse1;
	
	
	@FindBy(xpath = "//div[@class='panel panel-default']//div[@id='collapse1']//div")
	WebElement ele_acctxt_collapse1;
	
	@FindBy(xpath = "//form[@class='form-horizontal']//div[@class='col-xs-1']")
	WebElement ele_dob_picker_ico;
	
	@FindBy(id = "ui-datepicker-div")
	WebElement ele_dob_picker;
	
	
	

	public Learning_Page() {

		PageFactory.initElements(driver, this);
	}

	public void hover_Switchto() throws InterruptedException {
		moveToElement(lbl_Switchto);

	}

	public void hover_Widgets() throws InterruptedException {
		moveToElement(lbl_Widgets);

	}

	public void click_windows() {
		isClickable(lnk_Windows);
	}

	public void click_accordion() {
		isClickable(lnk_Accordion);
	}
	
	public void click_datepicker() {
		isClickable(lnk_datepicker);
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

	public String get_accordian_attribute() {
		return getAttribute(acc_collapse1, "class");
	}
	

	public String get_acctxt_collapse1() {
		return getText(ele_acctxt_collapse1);
	}
	
	public void click_dob_picker_ico() {
		isClickable(ele_dob_picker_ico);
	}
	
	public void dob_picker_present() {
		isElementPresent(ele_dob_picker);
		getCurrentDay();
		
	}

}
