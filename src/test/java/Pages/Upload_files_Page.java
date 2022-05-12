package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.testbase;

public class Upload_files_Page extends testbase {

	@FindBy(xpath = "//div[@id='fine-uploader-gallery']//div[@class='qq-upload-button-selector qq-upload-button']")
	WebElement btn_upload;
	
	String filepath = "src/test/resources/UploadFiles/Artboard.png";

	public Upload_files_Page() {

		PageFactory.initElements(driver, this);
	}

	public void click_on_uploadbtn() throws InterruptedException {

		// moveToElement(txt_emailid_login);
		scrollToElement(btn_upload);
		isClickable(btn_upload);
		Thread.sleep(5000);
		String path = System.getProperty("user.dir")+ filepath;
		System.out.println("Uploaded file name: "+path);
		uploadFile(path);
		Thread.sleep(5000);
	}

}
