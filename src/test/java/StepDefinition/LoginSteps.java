package StepDefinition;

import Pages.Login_page;
import Utility.XLS_Reader;

import factory.DriverFactory;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	// Login_page login;
	String Expected_Message;
	protected boolean status;

	private Login_page login = new Login_page(DriverFactory.getDriver());

	XLS_Reader reader = new XLS_Reader("src/test/resources/Files/SampleExcel.xlsx");

	@When("user has enter {string} & {string}")
	public void user_has_enter_emailid_password(String emailid, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - user has enter emailid & password");

		String sheetName = "Registration";

		String EmailID = reader.getCellData(sheetName, "EmailID", 2);
		String Passsword = reader.getCellData(sheetName, "Password", 2);

		System.out.println(EmailID + " " + Passsword);

		login.enter_emailid(EmailID);
		login.enter_password(Passsword);

	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Steps - click on login button");
		login.click_login();
		Thread.sleep(5000);
	}

	/*
	 * 
	 * @Given("user is login on Page") public void user_is_login_on_page() throws
	 * InterruptedException { // Write code here that turns the phrase above into
	 * concrete actions
	 * 
	 * System.out.println("==========  Login Page Functionality =============");
	 * System.out.println("Inside Steps - user is login on Page");
	 * 
	 * //DriverFactory.getDriver().get("http://practice.automationtesting.in/");
	 * 
	 * Thread.sleep(2000);
	 * 
	 * }
	 * 
	 * @When("^user enter (.*) & (.*)$") public void
	 * user_enter_username_password(String username, String password) { // Write
	 * code here that turns the phrase above into concrete actions
	 * System.out.println("Inside Steps - user enter username & password");
	 * 
	 * // Page Factory Model
	 * 
	 * // login = new Login_page(driver); login.enter_username(username);
	 * login.enter_password(password);
	 * 
	 * // driver.findElement(By.name("userId")).sendKeys(username); //
	 * driver.findElement(By.name("password")).sendKeys(password);
	 * 
	 * }
	 * 
	 * @And("click on login button") public void click_on_login_button() throws
	 * InterruptedException { // Write code here that turns the phrase above into
	 * concrete actions System.out.println("Inside Steps - click on login button");
	 * 
	 * login.click_login(); Thread.sleep(5000); //
	 * driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	 * 
	 * }
	 * 
	 * @Then("user navigate to home page") public void user_navigate_to_home_page()
	 * throws InterruptedException { // Write code here that turns the phrase above
	 * into concrete actions
	 * System.out.println("Inside Steps - user navigate to home page");
	 * 
	 * // driver.findElement(By.xpath(
	 * "//div[@class='main-top-action-logout']//img[@title='Logout']")).isDisplayed(
	 * );
	 * 
	 * login.check_logout_isdisplay(); Thread.sleep(4000); login.click_logout();
	 * 
	 * }
	 * 
	 * // Regression Part
	 * 
	 * @Then("by Default Login button should be display as disabled") public void
	 * by_default_login_button_should_be_display_as_disabled() { // Write code here
	 * that turns the phrase above into concrete actions System.out.
	 * println("Inside Steps - by Default Login button should be display as disabled"
	 * ); // login = new Login_page(driver); status =
	 * login.Check_Login_btn_Enabled_OR_Disabled();
	 * 
	 * Assert.assertFalse(status, "Login Button shows disabled"); if (status ==
	 * false) { System.out.println("Login Button shows disabled"); } else {
	 * System.out.println("Login Button shows enabled"); } }
	 * 
	 * // Regression Part
	 * 
	 * @Then("show Validation message Username or password are not matching") public
	 * void show_Validation_message_Username_or_password_are_not_matching() {
	 * System.out.
	 * println("Inside Steps - show Validation message Username or password are not matching"
	 * ); Expected_Message =
	 * "Username or password are not matching. Kindly provide valid details.";
	 * Assert.assertEquals(login.Verify_Validation_Messages(), Expected_Message);
	 * login.Verify_Validation_Messages(); }
	 * 
	 * // Asterisk field
	 * 
	 * @Then("by Default Compulsory field on need to display as Asterisk") public
	 * void by_Default_Compulsory_field_on_need_to_display_as_Asterisk() {
	 * System.out.
	 * println("Inside Steps - by Default Compulsory field on need to display as Asterisk"
	 * );
	 * 
	 * status = login.username_asterisk_isdisplay(); System.out.println(status); if
	 * (status == true) { System.out.println("Username Asterisk sign shows"); } else
	 * {
	 * 
	 * System.out.println("Username Asterisk sign not shows"); }
	 * 
	 * // asterisk_username_password status = login.password_asterisk_isdisplay();
	 * System.out.println(status); if (status == true) {
	 * 
	 * System.out.println("Password Asterisk sign shows"); } else {
	 * System.out.println("Password Asterisk sign not shows"); }
	 * 
	 * }
	 * 
	 */

}
