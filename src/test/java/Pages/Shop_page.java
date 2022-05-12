package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utility.testbase;

public class Shop_page extends testbase {
	
	@FindBy(xpath  = "//div[@id='woocommerce_price_filter-2']//h4")
	WebElement price_label;
	
	
	public String shop_page_display() {
		return driver.getTitle();
	}
	
	public String price_label() {
		return price_label.getText();
	}
	
	
	
	

}
