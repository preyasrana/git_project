package Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.testbase;

public class Learning_Register_page extends testbase {

	String filepath = "/src/test/resources/UploadFiles/Artboard.png";

	@FindBy(xpath = "//input[@ng-model='FirstName']")
	WebElement txt_firstname;
	
	
	@FindBy(xpath = "//button[@id='submitbtn']")
	WebElement btn_submit;

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

	@FindBy(xpath = "//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@type='radio' and @value='Male']")
	WebElement radio_male_gender;

	@FindBy(xpath = "//input[@id='checkbox1']")
	WebElement checkbox_hobbies;

	@FindBy(id = "msdd")
	WebElement txt_language;

	@FindBy(xpath = "//div[@id='msdd']//following::ul//li//a")
	List<WebElement> list_language;

	@FindBy(xpath = "//div[@class='form-group']//label[contains(text(),'Languages')]")
	WebElement lbl_language;

	@FindBy(xpath = "//multi-select//div[@class='ui-autocomplete-multiselect-item']")
	List<WebElement> selected_language;

	@FindBy(xpath = "//select[@ng-model='Skill']")
	WebElement sel_skill;

	@FindBy(xpath = "//select[@id='yearbox']")
	WebElement sel_date_year;

	@FindBy(xpath = "//select[@ng-model='monthbox']")
	WebElement sel_date_month;

	@FindBy(xpath = "//select[@ng-model='daybox']")
	WebElement sel_date_day;

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
	
	public String get_validationmessage() {
		// return price_label.getText();
		return getAttribute(txt_firstname, "validationMessage");
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
		isClickable_javascript(btn_uploadimg);
		Thread.sleep(5000);
		String path = System.getProperty("user.dir") + filepath;
		System.out.println("Uploaded file name: " + path);
		uploadFile(path);
		Thread.sleep(5000);
	}

	public void clickongender() {
		isClickable(radio_male_gender);
	}
	
	public void clicksubmit() {
		isClickable(btn_submit);
	}

	public void clickonHobbies() {
		isClickable(checkbox_hobbies);
	}

	public void clickonlanguages() {
		isClickable(txt_language);
	}

	public void listlanguages() throws InterruptedException {

		getMultipleTextwithclick(list_language, "German");
		getMultipleTextwithclick(list_language, "Estonian");
		getMultipleTextwithclick(list_language, "Dutch");
		getMultipleTextwithclick(list_language, "Croatian");
		Thread.sleep(3000);
		isClickable(lbl_language);
	}

	public List<String> Selectedlanguages() throws InterruptedException {

		return getMultipleText(selected_language);

	}

	public void clickonskills(String skillvalue) {

		selectByValue(sel_skill, skillvalue);
	}

	public void sel_dob_year(String dob_year) {

		selectByValue(sel_date_year, dob_year);

	}

	public String firstoption_date_year() {
		return firstSelectedOption(sel_date_year);
	}

	public void sel_dob_month(String dob_month) {

		selectByText(sel_date_month, dob_month);

	}

	public String firstoption_dob_month() {
		return firstSelectedOption(sel_date_month);
	}

	public void sel_dob_day(String dob_day) {

		selectByText(sel_date_day, dob_day);

	}

	public String firstoption_dob_day() {
		return firstSelectedOption(sel_date_day);
	}

}
