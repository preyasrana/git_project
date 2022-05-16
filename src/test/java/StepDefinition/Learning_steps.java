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

}
