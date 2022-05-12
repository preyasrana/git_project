package Pages;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	
	
	public Shop_page() {

		PageFactory.initElements(driver, this);

	}

	public String shop_page_display() {
		return driver.getTitle();
	}

	public String price_label() {
		return price_label.getText();
	}

	public void filter_product_list() {
	
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
		System.out.println("Invalid list prices -->"+Invalidlistprice);
	}

}
