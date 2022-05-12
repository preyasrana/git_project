package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.testbase;

public class Shop_page extends testbase {
	
	@FindBy(xpath  = "//div[@class='price_label']")
	WebElement price_label;
	
	public Shop_page() {

		PageFactory.initElements(driver, this);

	}
	
	
	public String shop_page_display() {
		return driver.getTitle();
	}
	
	public String price_label() {
		return price_label.getText();
	}
	
	
	
	

}
