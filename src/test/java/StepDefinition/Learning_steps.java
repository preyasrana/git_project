package StepDefinition;

import Pages.Learning_Page;
import io.cucumber.java.en.When;

public class Learning_steps {

	Learning_Page learning_step = new Learning_Page();

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

}
