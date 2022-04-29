package StepDefinition;

import org.testng.Assert;

//import org.testng.Assert;

//import org.junit.Assert;
//import org.testng.Assert;
import Pages.Register_page;
import Utility.XLS_Reader;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import junit.framework.Assert;

public class RegisterSteps {

	private Register_page register = new Register_page(DriverFactory.getDriver());
	String Expected_Message;
	protected boolean status;
	
	 //SoftAssert soft = new SoftAssert();
	
	XLS_Reader reader = new XLS_Reader("src/test/resources/Files/SampleExcel.xlsx");
	//String sheetName = "Website_Details";

	@Given("user is on Home Page")
	public void user_is_on_home_page() throws InterruptedException {

		System.out.println("==========  Register Page Functionality =============");
		System.out.println("Inside Steps - user is on Home Page");
		// DriverFactory.getDriver().get("http://practice.automationtesting.in/");
		Thread.sleep(2000);

	}

	@When("user click on Myaccount link")
	public void user_click_on_myaccount_link() throws InterruptedException {

		System.out.println("Inside Steps - user click on Myaccount link");
		register.click_on_Myaccount();

	}

	@Then("user navigate to Register Page")
	public void user_navigate_to_Register_Page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - user navigate to Register Page");

		String Actual_message = register.register_page_display();
		System.out.println(Actual_message);

		Expected_Message = "My Account – Automation Practice Site";
		Assert.assertEquals(Expected_Message,Actual_message);
		

		// register.register_page_display();
		Thread.sleep(4000);
		//soft.assertAll();

	}
	
	/*
	@Then("user navigate to Register Page Verify Page Title")
	public void user_navigate_to_Register_Page_Verify_Page_Title() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - user navigate to Register Page Verify Page Title");

		String Actual_message = register.register_page_display();
		System.out.println(Actual_message);

		Expected_Message = "My Account – Automation Practice Site1";
		soft.assertEquals(Actual_message, Expected_Message);

		// register.register_page_display();
		Thread.sleep(4000);
		//soft.assertAll();

	}
	*/

	@When("user entered {string} & {string}")
	public void user_entered_emailid_password(String emailid, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - user enter emailid & password");
		
		if(! reader.isSheetExist("Registration")){
			reader.addSheet("Registration");
			reader.addColumn("Registration", "EmailID");
			reader.addColumn("Registration", "Password");
		}
		
		
		
		int rowCount = reader.getRowCount("Registration");
		System.out.println("total rows: "+ rowCount);

		String Email_id = register.email_generate().concat("@gmail.com");
		System.out.println(Email_id);
		
		int newrowcount = rowCount+1; 
			
		reader.setCellData("Registration", "EmailID", newrowcount , Email_id);

		register.enter_emailid(Email_id);

		String psw_passwsord = register.password_generate();
		System.out.println(psw_passwsord);
		
		reader.setCellData("Registration", "Password", newrowcount , psw_passwsord);
		register.enter_password(psw_passwsord);
		
		
	}

	@When("click on Register button")
	public void click_on_register_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - click on Register button");

		register.click_register();
		Thread.sleep(5000);

	}
	
	@Then("Verify broken images")
	public void Verify_broken_images() {
		
		System.out.println("Verify broken images");
		register.Verify_broken_img();
	}
	
	@Then("Verify broken urls")
	public void Verify_broken_urls() {
		
		System.out.println("Verify broken urls");
		register.Verify_broken_url();
	}
	

	@Then("user navigate to myaccount page")
	public void user_navigate_to_myaccount_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - user navigate to myaccount page");

		// signout link display
		status = register.signout_isdisplay();
		System.out.println(status);
		if (status == true) {

			System.out.println("Signout link shows");
		} else {
			System.out.println("Signout link not shows");
		}

	}

}
