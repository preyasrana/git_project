package StepDefinition;

import Pages.Home_page;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	Home_page homepage = new Home_page();
	
	
	@When("user click on Shop link")
	public void user_click_on_Shop_link() throws InterruptedException {

		System.out.println("Inside Steps - user click on Shop link");
		homepage.click_on_shop();

	}

}
