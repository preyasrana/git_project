package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.testbase;

public class Register_page extends testbase {

	@FindBy(xpath = "//ul[@id='main-nav']//li//a[contains(text(),'My Account')]")
	WebElement lnk_myaccount;

	@FindBy(xpath = "//h2[contains(text(),'Register')]")
	WebElement page_title;
	
	@FindBy(xpath = "//form[@id='searchform']//input")
	WebElement search_icon;
	
	@FindBy(xpath = "//div[@class='textwidget']//img")	
	WebElement Footer_logo;
	
	@FindBy(xpath = "//img")
	List<WebElement> listimg;
	
	@FindBy(xpath = "//a")
	List<WebElement> listurl;
	
	@FindBy(id = "reg_email")
	WebElement txt_emailid_register;

	@FindBy(id = "reg_password")
	WebElement txt_password_register;
	
	@FindBy(name = "register")
	WebElement btn_register;
	
	@FindBy(xpath = "//div[@class='woocommerce-MyAccount-content']//p//a[contains(text(),'Sign out')]")
	WebElement lnk_signout;
	
	
	public Register_page(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void click_on_Myaccount() throws InterruptedException {

		
		//Validate_image(listimg);
		//Validate_URL(listurl);		
		//moveToElement(search_icon);
		Thread.sleep(1000); 		
		//validateImage(Footer_logo);
		
		isClickable(lnk_myaccount);

	}

	public String register_page_display() {
		return driver.getTitle();
	}
	
	public String email_generate() {
		return getemailString();
	}
	
	public String password_generate() {
		return createPassword();
	}
	
	public void enter_emailid(String emailid) {
		txt_emailid_register.sendKeys(emailid);
	}

	public void enter_password(String password) {
		txt_password_register.sendKeys(password);
	}

	public void click_register() {
		btn_register.click();

	}

	
	public void Verify_broken_img() {
		
		Validate_image(listimg);
	}
	
    public void Verify_broken_url() {
		
    	Validate_URL(listurl);
	}
	
	public boolean signout_isdisplay() {
		return isdisplay(lnk_signout);
	}

}
