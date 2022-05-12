package StepDefinition;

import Pages.Upload_files_Page;
import io.cucumber.java.en.When;

public class FileuploadSteps {
	
	Upload_files_Page upload = new Upload_files_Page();
	
	
	@When("user click on upload files link")
	public void user_click_on_upload_files_link() throws InterruptedException {

		System.out.println("Inside Steps - user click on upload button");
		upload.click_on_uploadbtn();
		System.out.println("File uploaded successfully");
		
	}
	
	
	
	

}
