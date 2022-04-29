package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.XLS_Reader;
import Utility.testbase;
import factory.DriverFactory;

public class MyAccount_page extends testbase {

	// *********** Account Details ********************
	@FindBy(xpath = "//nav[@class='woocommerce-MyAccount-navigation']//ul//li//a[contains(text(),'Account Details')]")
	WebElement lnk_accdetail;

	@FindBy(id = "account_first_name")
	WebElement txt_firstname;

	@FindBy(id = "account_last_name")
	WebElement txt_lastname;

	@FindBy(xpath = "//p//input[@name='save_account_details']")
	WebElement btn_savechanges;

	@FindBy(xpath = "//div[@class='woocommerce-message']")
	WebElement validation_message;

	// ******************** Address Details ********************
	@FindBy(xpath = "//nav[@class='woocommerce-MyAccount-navigation']//ul//li//a[contains(text(),'Addresses')]")
	WebElement lnk_addresses;

	@FindBy(xpath = "//div[@class='woocommerce-MyAccount-content']//p")
	WebElement heading_addressesline;

	@FindBy(xpath = "//header[@class='woocommerce-Address-title title']//h3[contains(text(),'Billing Address')]//following::a[1]")
	WebElement lnk_billing_edit;

	@FindBy(xpath = "//header[@class='woocommerce-Address-title title']//h3[contains(text(),'Billing Address')]//following::a[2]")
	WebElement lnk_shipping_edit;

	@FindBy(xpath = "//div[@class='woocommerce-MyAccount-content']//h3")
	WebElement billing_heading_name;

	@FindBy(xpath = "//div[@class='woocommerce-MyAccount-content']//h3")
	WebElement shipping_heading_name;

	@FindBy(id = "select2-chosen-1")
	WebElement billing_country_name;

	@FindBy(id = "s2id_billing_country")
	WebElement drp_billing_country;

	@FindBy(id = "s2id_autogen1_search")
	WebElement txt_search_country;
	

	@FindBy(xpath = "//div//ul[@id='select2-results-1']//li")
	List<WebElement> list_searched_country;

	///////////// ********************************************* ///////////////////

	public MyAccount_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// ********************* Account Details ****************************
	public void click_on_accountdetail_link() {
		lnk_accdetail.click();
	}

	public void click_field() {
		clearValue(txt_firstname);
		clearValue(txt_lastname);
	}

	public void enter_firstname(String firstname) {
		txt_firstname.sendKeys(firstname);
	}

	public void enter_lastname(String lastname) {
		txt_lastname.sendKeys(lastname);
	}

	public void pagescroll() throws InterruptedException {
		scrollToElement(btn_savechanges);
		Thread.sleep(2000);
	}

	public void click_on_savechanges_btn() {
		btn_savechanges.click();
	}

	public String MyAccount_page_getmessage() {
		return validation_message.getText();
	}

	public String myaccount_page_display() {
		return driver.getTitle();
	}

	// ****************** Address Details *****************************

	public void click_on_addresses_link() {
		lnk_addresses.click();
	}

	public String Address_headingline_getmessage() {
		return heading_addressesline.getText();
	}

	public void click_on_billingaddress_editlink() {
		lnk_billing_edit.click();
	}

	public void click_on_shippinggaddress_editlink() {
		lnk_shipping_edit.click();
	}

	public String billing_heading_name() {
		return billing_heading_name.getText();
	}

	public String shipping_heading_name() {
		return shipping_heading_name.getText();
	}

	public String billing_default_country_name() {
		return billing_country_name.getText();

	}

	public void click_on_country_dropdown() {
		drp_billing_country.click();
	}

	public void enter_countryname(String countryname) {
		txt_search_country.sendKeys(countryname);
	
	}

	public List<String> list_searched_country() {

		return getMultipleText(list_searched_country);
	}

	public void click_on_country_searched_value() {

		List<String> Actualresult = new ArrayList<>();
		Actualresult = list_searched_country();
		System.out.println("Actualresult" + Actualresult);

		String ExpectedResult = "Japan";

		for (int i = 0; i < Actualresult.size(); i++) {

			System.out.println(Actualresult.get(i));
			
			
			
			if (ExpectedResult.equals(Actualresult.get(i))) {

				System.out.println("Country Value matched :: " + Actualresult.get(i));
				

				int j = i + 1;		
				
					
				driver.findElement(By.xpath("//div//ul[@id='select2-results-1']//li[" + j + "]")).click();
				

			} else {
				System.out.println("Country value not matched :: " + Actualresult.get(i));
			}
		}

	}

}
