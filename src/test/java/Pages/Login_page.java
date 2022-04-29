package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.testbase;
import factory.DriverFactory;

public class Login_page extends testbase {

	String Actualmessage;
	// By txt_username_login = By.name("userId");
	// By txt_password_login = By.name("password");
	// By btn_login = By.xpath("//button[normalize-space()='Login']");
	// By btn_logout =
	// By.xpath("//div[@class='main-top-action-logout']//img[@title='Logout']");
	
	@FindBy(id = "username")
	WebElement txt_emailid_login;

	@FindBy(id = "password")
	WebElement txt_password_login;
	
	@FindBy(name = "login")
	WebElement btn_login;
	
	@FindBy(xpath = "//ul[@id='main-nav']//li//a[contains(text(),'My Account')]")
	WebElement lnk_myaccount;
	
	

	public Login_page(WebDriver driver) {
		// this.driver = driver;
		// AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,
		// 30);
		PageFactory.initElements(driver, this);
		// this.driver = driver;

	}
		
	
	public void click_on_Myaccount() {
		
		//moveToElement(txt_emailid_login);
		isClickable(txt_emailid_login);

	}

	public String login_page_display() {
		return driver.getTitle();
	}
	
	public void enter_emailid(String emailid) {
		moveToElement(txt_emailid_login);
		txt_emailid_login.sendKeys(emailid);
	}

	public void enter_password(String password) {
		
		moveToElement(txt_password_login);
		txt_password_login.sendKeys(password);
	}

	public void click_login() {
		btn_login.click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@FindBy(name = "userId")
	// @CacheLookup
	WebElement txt_username_login;

	@FindBy(name = "password")
	// @CacheLookup
	WebElement txt_password_login;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btn_login;

	@FindBy(xpath = "//div[@class='main-top-action-logout']//img[@title='Logout']")
	WebElement btn_logout;

	@FindBy(tagName = "a")
	List<WebElement> Links;

	// Validation messages
	@FindBy(xpath = "//label[@class='d-error']")
	WebElement Validation_Message;

	// Asterisk Field
	@FindBy(xpath = "//label[contains(text(),'Username')]//span[@class='astrisk']")
	WebElement asterisk_username_login;

	@FindBy(xpath = "//label[contains(text(),'Password')]//span[@class='astrisk']")
	WebElement asterisk_username_password;

	@FindBy(xpath = "//div//input[@type='password']")
	WebElement invisible_password;
	
	/*

	/*
	 * By astrisk_username_login =
	 * By.xpath("//label[contains(text(),'Username')]//span[@class='astrisk']"); By
	 * astrisk_username_password =
	 * By.xpath("//label[contains(text(),'Password')]//span[@class='astrisk']");
	 */
	

	/*
	public Login_page(WebDriver driver) {
		// this.driver = driver;
		// AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,
		// 30);
		PageFactory.initElements(driver, this);
		// this.driver = driver;

	}

	public void enter_username(String username) {
		txt_username_login.sendKeys(username);
	}

	public void enter_password(String password) {
		txt_password_login.sendKeys(password);
	}

	public void click_login() {
		btn_login.click();

	}

	public void check_logout_isdisplay() {
		btn_logout.isDisplayed();

		for (WebElement link : Links) {
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}

	}

	public void click_logout() {
		btn_logout.click();
	}

	public boolean Check_Login_btn_Enabled_OR_Disabled() {

		return btn_login.isEnabled();
	}

	public String Verify_Validation_Messages() {

		Actualmessage = Validation_Message.getText();
		return Actualmessage;

	}

	public boolean username_asterisk_isdisplay() {
		return isdisplay(asterisk_username_login);
	}

	public boolean password_asterisk_isdisplay() {
		return isdisplay(asterisk_username_password);
	}
	*/
	

}
