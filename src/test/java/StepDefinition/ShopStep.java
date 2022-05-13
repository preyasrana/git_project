package StepDefinition;

import org.testng.Assert;

import Pages.Shop_page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopStep {
	
	Shop_page shop  = new Shop_page();
	
	@Then("user redirect on shop page verify page")
	public void user_redirect_on_shop_page_verify_page() {
		 
		System.out.println("Inside Steps - user redirect on shop page verify page");

		String Actual_message = shop.shop_page_display();
		System.out.println(Actual_message);

		String Expected_Message = "Products – Automation Practice Site";
		Assert.assertEquals(Expected_Message,Actual_message);	
	}
	
	@Then("verify filter by price content")
	public void verify_filter_by_price_content () {
		 
		System.out.println("Inside Steps - verify filter by price content");
		
		String Actual_message =  shop.price_label();
		System.out.println(Actual_message);
		
		//String Expected_Message = "Price: ₹150 — ₹500";
		//Assert.assertEquals(Expected_Message,Actual_message);	
		
	}
	
	@Then("Verify list product based on Filtration")
	public void Verify_list_product_based_on_Filtration() throws InterruptedException {
		
		shop.filter_product_list();
		
	}	
	
	@Then("user click on slider price")
	public void user_click_on_slider_price() throws InterruptedException {
		
		shop.Filter_product_dragdrop(50, 0);
		
	}
	
	@Then("user click on slider price new")
	public void user_click_on_slider_price_new() throws InterruptedException {
		
		shop.Filter_product_dragdrop(5, 0);
		
	}
	
	
	
	@When("user click on Filter button")
	public void user_click_on_Filter_button() throws InterruptedException {
		
	   shop.click_on_filter_btn();
		
	}	
	
	
	
	
	
	
	
	
	
	
	
}
