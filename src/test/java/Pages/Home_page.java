package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.testbase;

public class Home_page extends testbase {

	@FindBy(xpath = "//ul[@id='main-nav']//li//a[contains(text(),'Shop')]")
	WebElement lnk_shop;

	public Home_page() {
		// this.driver = driver;
		// AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,
		// 30);
		PageFactory.initElements(driver, this);
		// this.driver = driver;

	}

	public void click_on_shop() {

		// moveToElement(txt_emailid_login);
		isClickable(lnk_shop);
		
	       

	}

}
