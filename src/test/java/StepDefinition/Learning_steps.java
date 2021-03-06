package StepDefinition;

import java.util.List;
import org.testng.Assert;
import Pages.Learning_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Learning_steps {

	Learning_Page learning_step = new Learning_Page();

	String Actual_message;
	String Expected_Message;

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

	@When("user click on Accordianlink")
	public void user_click_on_Accordianlink() throws InterruptedException {

		learning_step.hover_Widgets();
		learning_step.click_accordion();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();
		Thread.sleep(5000);

	}

	@When("user click on resizablelink")
	public void user_click_on_resizablelink() throws InterruptedException {

		learning_step.hover_interactions();
		learning_step.click_resizable();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);

	}

	@When("user click on Selectablelink")
	public void user_click_on_Selectablelink() throws InterruptedException {

		learning_step.hover_interactions();
		learning_step.click_Selectable();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);

	}
	
	@When("user click on ckeditorlink")
	public void user_click_on_ckeditorlink() throws InterruptedException {

		learning_step.hover_wysiwyg();
		learning_step.click_ckeditor();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);

	}

	@When("user click on progressbarlink")
	public void user_click_on_progressbarlink() throws InterruptedException {

		learning_step.hover_more();
		learning_step.click_on_progressbar();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);

	}

	@When("user click on youtubelink")
	public void user_click_on_youtubelink() throws InterruptedException {

		learning_step.hover_video();
		learning_step.click_youtube();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);

	}

	@When("user click on loaderlink")
	public void user_click_on_loaderlink() throws InterruptedException {

		learning_step.hover_more();
		learning_step.click_loader();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();
		Thread.sleep(5000);

	}

	@When("user click on dragdropstaticlink")
	public void user_click_on_dragdropstaticlink() throws InterruptedException {

		learning_step.hover_interactions();
		learning_step.hover_Dragdrop();
		Thread.sleep(2000);
		learning_step.click_staticdragdrop();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);

	}

	@When("user click on Datepickerlink")
	public void user_click_on_Datepickerlink() throws InterruptedException {

		learning_step.hover_Widgets();
		learning_step.click_datepicker();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);

	}

	@When("user click on filedownloadlink")
	public void user_click_on_filedownloadlink() throws InterruptedException {

		learning_step.hover_more();
		learning_step.click_filedownload();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);

	}

	@When("user click on downloadprogressbarlink")
	public void user_click_on_downloadprogressbarlink() throws InterruptedException {

		learning_step.hover_more();
		learning_step.click_lnk_prgdownload();
		Thread.sleep(2000);
		learning_step.switchframe_advertise();
		Thread.sleep(2000);
		learning_step.click_windows_close();

		Thread.sleep(5000);

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

	@Then("Verify file related progressbar")
	public void Verify_file_related_progressbar() throws InterruptedException {

		learning_step.click_btn_progress();
		if (learning_step.display_progresslbl()) {
			System.out.println("test");
		}
	}

	@Then("Verify progressbar for filedownload")
	public void Verify_progressbar_for_filedownload() throws InterruptedException {

		learning_step.click_btn_prgdownload();
		if (learning_step.display_downloadprogresslbl()) {
			System.out.println("Download Completed !!!!");
		}
	}

	@When("bydefault first accordian open display")
	public void bydefault_first_accordian_open_display() throws InterruptedException {

		System.out.println(learning_step.get_accordian_attribute());

		if (learning_step.get_accordian_attribute().contains("panel-collapse collapse in")) {
			Assert.assertTrue(true, "By default First accordian Open display");
			System.out.println("By default First accordian Open display");

		} else {

			Assert.assertTrue(false, "By default First accordian not open display");
		}
	}

	@When("verify accordian related text")
	public void verify_accordian_related_text() throws InterruptedException {

		System.out.println(learning_step.get_acctxt_collapse1());

		Actual_message = learning_step.get_acctxt_collapse1();
		System.out.println(Actual_message);

		Expected_Message = "This Automation Testing API is very simple to read and understand. Every method in this is self explanatory. "
				+ "If a layman looks into this code/script can understand what is happening. "
				+ "You can read the automation script like manual test case.";
		Assert.assertEquals(Expected_Message, Actual_message);

	}

	@When("user click on Datepicker icon")
	public void user_click_on_Datepicker_icon() throws InterruptedException {

		learning_step.click_dob_picker_ico();
		Thread.sleep(5000);

	}

	@When("verify Download button should be display & clickable")
	public void verify_Download_button_should_be_display_clickable() throws InterruptedException {

		learning_step.click_file_download();
	}

	@When("user click on run button")
	public void user_click_on_run_button() throws InterruptedException {

		learning_step.click_loader_run();
	}

	@Then("loader please wait display or not & verify popup")
	public void loader_please_wait_display_or_not_verify_popup() throws InterruptedException {

		learning_step.loader_verify();
		learning_step.popup_verify();
		learning_step.click_popup_close();
		Thread.sleep(5000);

	}

	@When("user resize object")
	public void user_resize_object() throws InterruptedException {

		learning_step.resize_obj();
		Thread.sleep(5000);
		String widthheight = learning_step.resize_width_height();
		System.out.println(widthheight);

		List<Integer> values = learning_step.resized_object();
		System.out.println(values);

	}

	@Then("Datepicker should be visible")
	public void Datepicker_should_be_visible() throws InterruptedException {

		String datevalues = learning_step.dob_picker_present();
		System.out.println(datevalues);

		List<String> values = learning_step.dob_days();
		System.out.println(values);

		for (int i = 0; i < values.size(); i++) {

			System.out.println(values.get(i));

			if (datevalues.equals(values.get(i))) {

				System.out.println("value matched :: " + values.get(i));
			} else {
				System.out.println("value not matched :: " + values.get(i));
			}
		}

	}

	@Then("user dragdrop object")
	public void user_dragdrop_object() throws InterruptedException {

		learning_step.dragdrop_obj();
		Thread.sleep(8000);

	}

	@Then("Verify object display or not")
	public void Verify_object_display_or_not() throws InterruptedException {

		String fromdrag_text = learning_step.get_fromdrag_attribute();
		System.out.println("fromdrag_text ::" + fromdrag_text);

		List<String> to_drag_values = learning_step.get_todrag_attribute();
		System.out.println(to_drag_values);

		for (int i = 0; i < to_drag_values.size(); i++) {
			if (to_drag_values.get(i).contentEquals(fromdrag_text)) {
				System.out.println("true");
			}
		}

	}

	@When("user click on Serialize option")
	public void user_click_on_Serialize_option() throws InterruptedException {

		learning_step.click_on_serialize();

		Actual_message = learning_step.gettext_serialized();
		System.out.println(Actual_message);

		Expected_Message = "None:";
		Assert.assertEquals(Expected_Message, Actual_message);
	}

	@When("verify list of serialized value")
	public void verify_list_of_serialized_value() throws InterruptedException {

		Thread.sleep(4000);
		learning_step.list_serialized();

		Actual_message = learning_step.gettext_serialized();
		System.out.println("Actual_message ::" + Actual_message);

		Expected_Message = "Readability , Single Line Coding , Method Chaining , Cross Browser Testing , Extent Reports , Data Driven Testing , Functional Testing";
		Assert.assertEquals(Expected_Message, Actual_message);
		// softAssert.assertEquals(Expected_Message, Actual_message);
		// learning_step.softAssert.assertEquals(Expected_Message, Actual_message);

	}

	@When("user click on Default Functionality option")
	public void user_click_on_Default_Functionality_option() throws InterruptedException {

		learning_step.click_on_default_functionality();
		Thread.sleep(4000);

	}

	@Then("user has start video")
	public void user_has_start_video() throws InterruptedException {

		learning_step.switchframe_video();

		learning_step.playVideo();

		Thread.sleep(5000);

		learning_step.pauseVideo();

		Thread.sleep(5000);

		learning_step.playVideo();

	}
	
	@Then("user has entered any details in ckeditor")
	public void user_has_entered_any_details_in_ckeditor(String Details) throws InterruptedException {
		
		learning_step.switchframe_ckeditor();
		
		learning_step.enter_CKEditor_details(Details);
		Thread.sleep(5000);
		
		
	}

	@Then("Verify Filedownloaded or not")
	public void Verify_Filedownloaded_or_not() throws InterruptedException {

		learning_step.isFileDownloaded(learning_step.configreader.init_prop().getProperty("file_download_path"),

				learning_step.configreader.init_prop().getProperty("file_download_name"));

	}

}
