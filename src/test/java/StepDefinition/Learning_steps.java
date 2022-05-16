package StepDefinition;

import java.util.List;

import org.testng.Assert;

import Pages.Learning_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Learning_steps {

	Learning_Page learning_step = new Learning_Page();

	String Actual_message;
	String Expected_Message;

	@When("user click on windowlink")
	public void user_click_on_windowlink() throws InterruptedException {

		learning_step.hover_Switchto();
		learning_step.click_windows();
		Thread.sleep(2000);

		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);
		// learning_step.switch_parentwindow();
	}

	@When("user click on Accordianlink")
	public void user_click_on_Accordianlink() throws InterruptedException {

		learning_step.hover_Widgets();
		learning_step.click_accordion();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);

	}

	@When("user click on Datepickerlink")
	public void user_click_on_Datepickerlink() throws InterruptedException {

		learning_step.hover_Widgets();
		learning_step.click_datepicker();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);

	}

	@When("verify open new tab window by default selected")
	public void verify_open_new_tab_window_by_default_selected() throws InterruptedException {

		learning_step.click_on_btntabbed();
		learning_step.switchToLatestWindow();
		learning_step.click_on_Download();
		learning_step.click_on_Documentation();
		Thread.sleep(4000);
		learning_step.switchToPartentWindow();

	}

	@When("user click on new seperate window")
	public void user_click_on_new_seperate_window() throws InterruptedException {

		learning_step.click_new_seperatewindow();
		learning_step.click_on_btnseperate();
		learning_step.switchToLatestWindow();
		learning_step.click_on_Download();
		learning_step.click_on_Documentation();
		Thread.sleep(4000);
		learning_step.switchToPartentWindow();

	}

	@When("bydefault first accordian open display")
	public void bydefault_first_accordian_open_display() throws InterruptedException {

		System.out.println(learning_step.get_accordian_attribute());

		if (learning_step.get_accordian_attribute().contains("panel-collapse collapse in")) {
			Assert.assertTrue(true, "By default First accordian Open display");
			System.out.println("By default First accordian Open display");

		} else {

			Assert.assertTrue(false, "By default First accordian not open display");
		}
	}

	@When("verify accordian related text")
	public void verify_accordian_related_text() throws InterruptedException {

		System.out.println(learning_step.get_acctxt_collapse1());

		Actual_message = learning_step.get_acctxt_collapse1();
		System.out.println(Actual_message);

		Expected_Message = "This Automation Testing API is very simple to read and understand. Every method in this is self explanatory. "
				+ "If a layman looks into this code/script can understand what is happening. "
				+ "You can read the automation script like manual test case.";
		Assert.assertEquals(Expected_Message, Actual_message);

	}

	@When("user click on Datepicker icon")
	public void user_click_on_Datepicker_icon() throws InterruptedException {

		learning_step.click_dob_picker_ico();
		Thread.sleep(5000);

	}

	@Then("Datepicker should be visible")
	public void Datepicker_should_be_visible() throws InterruptedException {

		String datevalues = learning_step.dob_picker_present();
		System.out.println(datevalues);
	   
		List<String> values =  learning_step.dob_days();
		System.out.println(values);
		
		for (int i = 0; i < values.size(); i++) {

			System.out.println(values.get(i));
		
			if (datevalues.equals(values.get(i))) {
				
				System.out.println("value matched :: "+ values.get(i));
			}
			else {
				System.out.println("value not matched :: " + values.get(i));
			}	
		}
		
		
		
		
		

	}

}
