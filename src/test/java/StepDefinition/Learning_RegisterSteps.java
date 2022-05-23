package StepDefinition;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import Pages.Learning_Register_page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Learning_RegisterSteps {

	Learning_Register_page learning_reg = new Learning_Register_page();
	String Actual_message;
	String Expected_Message;

	@When("firstname lastname gets placeholder name then verify")
	public void firstname_lastname_gets_placeholder_name_then_verify() throws InterruptedException {

		System.out.println("Inside Steps - firstname lastname gets placeholder name");

		Actual_message = learning_reg.get_firstname_placeholder();
		System.out.println(Actual_message);

		Expected_Message = "First Name";
		Assert.assertEquals(Expected_Message, Actual_message);

		Actual_message = learning_reg.get_lastname_placeholder();
		System.out.println(Actual_message);

		Expected_Message = "Last Name";
		Assert.assertEquals(Expected_Message, Actual_message);

	}

	@When("user enter firstname")
	public void user_enter_firstname(String firstname) throws InterruptedException {

		learning_reg.enter_firstname(firstname);
	}

	@When("user enter lastname")
	public void user_enter_lastname(String lastname) throws InterruptedException {

		learning_reg.enter_lastname(lastname);
	}

	@When("user enter address")
	public void user_enter_address(String address) throws InterruptedException {

		learning_reg.enter_address(address);
	}

	@When("user click on submit")
	public void user_click_on_submit() throws InterruptedException {

		learning_reg.clicksubmit();
	}

	@When("user hover on Emailid")
	public void user_hover_on_Emailid() throws InterruptedException {

		Actual_message = learning_reg.hover_emailid();
		System.out.println(Actual_message);

		Expected_Message = "Provide a valid email id for further updates";
		Assert.assertEquals(Expected_Message, Actual_message);

	}

	@When("get Validation messages")
	public void get_Validation_messages() throws InterruptedException {

		System.out.println(learning_reg.get_validationmessage());
		Thread.sleep(5000);

	}

	@When("user enter emailid")
	public void user_enter_emailid(String emailid) throws InterruptedException {

		learning_reg.enter_emailid(emailid);
	}

	@When("user enter phone")
	public void user_enter_phone(String phone) throws InterruptedException {

		learning_reg.enter_phone(phone);
	}

	@When("user upload photo")
	public void user_upload_photo() throws InterruptedException {

		learning_reg.click_on_uploadbtn();
	}

	@When("user click on gender")
	public void user_click_on_gender() throws InterruptedException {

		learning_reg.clickongender();
	}

	@When("user click on Hobbies")
	public void user_click_on_Hobbies() throws InterruptedException {

		learning_reg.clickonHobbies();
	}

	@When("user click on Languages")
	public void user_click_on_Languages() throws InterruptedException {

		learning_reg.clickonlanguages();
		learning_reg.listlanguages();

	}

	@Then("Verify Selected languages")
	public void Verify_Selected_languages() throws InterruptedException {
		List<String> Expected_listlanguage = learning_reg.Selectedlanguages();

		List<String> Actual_listlanguage = new ArrayList<String>();
		Actual_listlanguage.add("German");
		Actual_listlanguage.add("Estonian");
		Actual_listlanguage.add("Dutch");
		Actual_listlanguage.add("Croatian");

		Expected_listlanguage.retainAll(Actual_listlanguage);
		Actual_listlanguage.removeAll(Expected_listlanguage);
		System.out.println("similiar Languages ::" + Expected_listlanguage);
		System.out.println("different Languages ::" + Actual_listlanguage);

	}

	@When("user click on Skill")
	public void user_click_on_Skill() throws InterruptedException {

		learning_reg.clickonskills("Analytics");
		Thread.sleep(5000);
	}

	@When("user select dateofbirth")
	public void user_select_dateofbirth() throws InterruptedException {

		// sel_dob_year
		learning_reg.sel_dob_year("1991");

		Actual_message = learning_reg.firstoption_date_year();
		System.out.println(Actual_message);

		Expected_Message = "1991";
		Assert.assertEquals(Expected_Message, Actual_message);

		// ***** sel_dob_month **********
		learning_reg.sel_dob_month("April");

		Actual_message = learning_reg.firstoption_dob_month();
		System.out.println(Actual_message);

		Expected_Message = "April";
		Assert.assertEquals(Expected_Message, Actual_message);

		// sel_dob_day
		learning_reg.sel_dob_day("27");
		Actual_message = learning_reg.firstoption_dob_day();
		System.out.println(Actual_message);

		Expected_Message = "27";
		Assert.assertEquals(Expected_Message, Actual_message);

		Thread.sleep(5000);
	}

}
