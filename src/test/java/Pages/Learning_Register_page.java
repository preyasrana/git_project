package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.testbase;

public class Learning_Register_page extends testbase {

	String filepath = "/src/test/resources/UploadFiles/Artboard.png";

	@FindBy(xpath = "//input[@ng-model='FirstName']")
	WebElement txt_firstname;

	@FindBy(xpath = "//input[@ng-model='LastName']")
	WebElement txt_lastname;

	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	WebElement txt_address;

	@FindBy(xpath = "//input[@type='email']")
	WebElement txt_email;
	
	@FindBy(xpath = "//div[@class='col-sm-4 col-xs-4 tooltptext']//span")
	WebElement Validation_email;

	@FindBy(xpath = "//input[@ng-model='Phone']")
	WebElement txt_phone;

	@FindBy(id = "imagesrc")
	WebElement btn_uploadimg;

	public Learning_Register_page() {

		PageFactory.initElements(driver, this);

	}

	public String get_firstname_placeholder() {
		return getAttribute(txt_firstname, "placeholder");
	}

	public String get_lastname_placeholder() {
		// return price_label.getText();
		return getAttribute(txt_lastname, "placeholder");
	}

	public void enter_firstname(String firstname) {
		sendKeys(txt_firstname, firstname);
	}

	public void enter_lastname(String lastname) {
		sendKeys(txt_lastname, lastname);
	}

	public void enter_address(String address) {
		sendKeys(txt_address, address);
	}

	public String hover_emailid() throws InterruptedException {
		moveToElement(txt_email);
		Thread.sleep(3000);
		return getText(Validation_email);
	}
	
	public void enter_emailid(String emailid) {
		sendKeys(txt_email, emailid);
	}

	public void enter_phone(String phone) {
		sendKeys(txt_phone, phone);
	}

	public void click_on_uploadbtn() throws InterruptedException {

		moveToElement(btn_uploadimg);
		// scrollToElement(btn_uploadimg);
		isClickable_javascript(btn_uploadimg);
		Thread.sleep(5000);
		String path = System.getProperty("user.dir") + filepath;
		// String path
		// ="/home/preyas.r@ah.zymrinc.com/Desktop/preyas/eclipse-workspace/git_project/src/test/resources/UploadFiles/Artboard.png";
		System.out.println("Uploaded file name: " + path);
		uploadFile(path);
		Thread.sleep(5000);
	}

}
