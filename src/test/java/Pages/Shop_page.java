package Pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.testbase;

public class Shop_page extends testbase {

	List<Double> listprice;
	List<Double> Invalidlistprice;

	@FindBy(xpath = "//div[@class='price_label']")
	WebElement price_label;

	@FindBy(xpath = "//div[@class='price_label']//span[@class='from']")
	WebElement from_price;

	@FindBy(xpath = "//div[@class='price_label']//span[@class='to']")
	WebElement to_price;

	@FindBy(xpath = "//ul[@class='products masonry-done']//li")
	List<WebElement> list_product;

	@FindBy(xpath = "//ul[@class='products masonry-done']//li//span[@class='price']")
	List<WebElement> listof_product;

	@FindBy(xpath = "//ul[@class='products masonry-done']//li//span[@class='price']/span")
	List<WebElement> list_productprice;

	@FindBy(xpath = "//ul[@class='products masonry-done']//li//span[@class='price']/ins/span")
	List<WebElement> list_insproductprice;

	// Slider
	@FindBy(xpath = "//div[@class='price_slider ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']")
	WebElement filter_by_price;

	@FindBy(xpath = "//div[@class='price_slider_amount']//button[contains(text(),'Filter')]")
	WebElement btn_filter;

	public Shop_page() {

		PageFactory.initElements(driver, this);

	}

	public String shop_page_display() {
		return driver.getTitle();
	}

	public String price_label() {
		//return price_label.getText();
		return getText(price_label);
	}

	public void click_on_filter_btn() {
		isClickable(btn_filter);
	}

	public void filter_product_list() throws InterruptedException {

		
		Thread.sleep(5000);
		
		
		listprice = new ArrayList<>();

		Invalidlistprice = new ArrayList<>();
		int Productsize = list_product.size();
		System.out.println("Productsize -->" + Productsize);

		for (WebElement productprice : list_productprice) {
			System.out.println(productprice.getText().replace("₹", ""));

			double getprice = Double.parseDouble(productprice.getText().replace("₹", ""));

			listprice.add(getprice);
		}

		for (WebElement productprice : list_insproductprice) {
			System.out.println(productprice.getText().replace("₹", ""));
			double getprice = Double.parseDouble(productprice.getText().replace("₹", ""));
			listprice.add(getprice);
		}

		System.out.println(listprice);

		String fromprice = from_price.getText().replace("₹", "");
		double from_price = Double.parseDouble(fromprice);
		System.out.println(from_price);

		String toprice = to_price.getText().replace("₹", "");
		double to_price = Double.parseDouble(toprice);
		System.out.println(to_price);

		for (int i = 0; i < listprice.size(); i++) {

			if (listprice.get(i) >= from_price && listprice.get(i) <= to_price) {
				System.out.println("Valid Price");
			} else {
				System.out.println("Invalid Price");
				Invalidlistprice.add(listprice.get(i));
			}
		}
		System.out.println(""+price_label.getText()+" for Invalid list prices -->" + Invalidlistprice);
	}

	public void Filter_product_dragdrop(int from, int to) throws InterruptedException {

		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.dragAndDropBy(filter_by_price, from, to).perform();

	}

}
