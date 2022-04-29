package StepDefinition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.ScrollAction;
//import org.testng.Assert;
import org.testng.Assert;

import Pages.MyAccount_page;
import Utility.XLS_Reader;
import Utility.testbase;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyAccountsteps extends testbase {

	private MyAccount_page myaccount = new MyAccount_page(DriverFactory.getDriver());

	XLS_Reader reader = new XLS_Reader("src/test/resources/Files/SampleExcel.xlsx");

	@And("click on Accountdetail link")
	public void click_on_Accountdetail_link() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - click on Accountdetail link");
		myaccount.click_on_accountdetail_link();

		Actual_message = myaccount.myaccount_page_display();
		System.out.println(Actual_message);

		Expected_Message = "My Account – Automation Practice Site";
		Assert.assertEquals(Expected_Message, Actual_message);

		Thread.sleep(5000);

	}

	@And("click on Address link")
	public void click_on_Address_link() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - click on Address link");
		myaccount.click_on_addresses_link();

		Actual_message = myaccount.myaccount_page_display();
		System.out.println(Actual_message);

		Expected_Message = "My Account – Automation Practice Site";
		Assert.assertEquals(Expected_Message, Actual_message);

		Thread.sleep(2000);

		// To Verify Page heading
		Actual_message = myaccount.Address_headingline_getmessage();
		System.out.println(Actual_message);

		Expected_Message = "The following addresses will be used on the checkout page by default.";
		Assert.assertEquals(Expected_Message, Actual_message);

		Thread.sleep(2000);

	}

	@And("click on billing edit link")
	public void click_on_billing_edit_link() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - click on billing edit link");

		myaccount.click_on_billingaddress_editlink();

		// To Verify Page heading
		Actual_message = myaccount.billing_heading_name();
		System.out.println(Actual_message);

		Expected_Message = "Billing Address";
		Assert.assertEquals(Expected_Message, Actual_message);

		Thread.sleep(2000);
	}

	@Then("user click on browser back button")
	public void user_click_on_browser_back_button() throws InterruptedException {

		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - user click on browser back button");
		myaccount.browserback();

		// To Verify Page heading
		Actual_message = myaccount.Address_headingline_getmessage();
		System.out.println(Actual_message);

		Expected_Message = "The following addresses will be used on the checkout page by default.";
		Assert.assertEquals(Expected_Message, Actual_message);

		Thread.sleep(2000);

	}

	@And("user click on shipping edit link")
	public void user_click_on_shipping_edit_link() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - user click on shipping edit link");

		myaccount.click_on_shippinggaddress_editlink();

		// To Verify Page heading
		Actual_message = myaccount.shipping_heading_name();
		System.out.println(Actual_message);

		Expected_Message = "Shipping Address";
		Assert.assertEquals(Expected_Message, Actual_message);

		Thread.sleep(2000);
	}

	@When("user has entered profiledata {string} & {string}")
	public void user_has_entered_profiledata_firstname_lastname(String fname, String lname)
			throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - user has enter firstname & lastname");
		myaccount.click_field();
		myaccount.enter_firstname(fname);
		myaccount.enter_lastname(lname);
		// Page Scroll
		myaccount.pagescroll();
	}

	@And("click on savechanges button")
	public void click_on_savechanges_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - click on savechanges button");
		myaccount.click_on_savechanges_btn();

		String Actual_message = myaccount.MyAccount_page_getmessage();
		System.out.println(Actual_message);

		Expected_Message = "Account details changed successfully.";
		Assert.assertEquals(Expected_Message, Actual_message);

	}

	@Then("by default country show as India")
	public void by_default_country_show_as_India() throws InterruptedException {

		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - by default country show as India");

		Actual_message = myaccount.billing_default_country_name();
		System.out.println(Actual_message);

		Expected_Message = "India";
		Assert.assertEquals(Expected_Message, Actual_message);
	}

	@Then("click on country dropdown")
	public void click_on_country_dropdown() throws InterruptedException {

		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - click on country dropdown");

		myaccount.click_on_country_dropdown();
		Thread.sleep(5000);

	}

	@Then("^user enter (.*) in country searchpanel Verify fetch country list$")
	public void user_enter_countryname_in_country_searchpanel_Verify_fetch_country_list(String countryname)
			throws InterruptedException {

		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - user_enter_countryname_in_country_serachpanel Verify fetch country list");

		myaccount.enter_countryname(countryname);
		Thread.sleep(5000);
		
		myaccount.click_on_country_searched_value();

	}

}
