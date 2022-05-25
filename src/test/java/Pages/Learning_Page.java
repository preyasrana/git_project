package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Utility.testbase;

public class Learning_Page extends testbase {

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a[contains(text(),'SwitchTo')]")
	WebElement lbl_Switchto;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a[contains(text(),'Widgets')]")
	WebElement lbl_Widgets;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a[contains(text(),'Interactions ')]")
	WebElement lbl_Interactions;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a[contains(text(),'Drag and Drop')]")
	WebElement lbl_dragdrop;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a[contains(text(),'Video')]")
	WebElement lbl_video;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a[contains(text(),'More')]")
	WebElement lbl_more;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//ul//li//a[contains(text(),'Youtube')]")
	WebElement lnk_youtube;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//ul//li//a[contains(text(),'Windows')]")
	WebElement lnk_Windows;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//ul//li//a[contains(text(),' Accordion ')]")
	WebElement lnk_Accordion;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a[contains(text(),'File Download')]")
	WebElement lnk_filedownload;
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li//a[contains(text(),'Loader')]")
	WebElement lnk_loader;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//ul//li//a[contains(text(),'Resizable')]")
	WebElement lnk_Resizable;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//ul//li//a[contains(text(),'Static ')]")
	WebElement lnk_staticdragdrop;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//ul//li//a[contains(text(),' Datepicker ')]")
	WebElement lnk_datepicker;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//ul//li//a[contains(text(),'Selectable')]")
	WebElement lnk_selectable;

	@FindBy(id = "aswift_2")
	WebElement frm_mainframe;

	@FindBy(id = "ad_iframe")
	WebElement frm_Advertisement;

	@FindBy(xpath = "//div[@class='tabpane pullleft']//li//a[contains(text(),'Open New Seperate Windows')]")
	WebElement lnk_new_Seperatewindow;

	@FindBy(xpath = "//div[@class='tabpane pullleft']//li//a[contains(text(),'Open New Tabbed Windows ')]")
	WebElement lnk_new_tabbedwindow;

	@FindBy(xpath = "//div[@id='mys-content']//div[@id='dismiss-button']")
	WebElement btn_Windowclose;

	@FindBy(xpath = "//div[@class='tab-content']//div[1]//a")
	WebElement btn_tabbed_click;

	@FindBy(xpath = "//a[@class='nav-link']//span[contains(text(),'Downloads')]")
	WebElement lnk_download;

	@FindBy(xpath = "//a[@class='nav-link']//span[contains(text(),'Documentation')]")
	WebElement lnk_Documentation;

	@FindBy(xpath = "//div[@class='tab-content']//div[@id='Seperate']//button[contains(text(),'click')]")
	WebElement btn_seperate_click;

	@FindBy(xpath = "//div[@class='panel panel-default']//div[@id='collapse1']")
	WebElement acc_collapse1;

	@FindBy(xpath = "//div[@class='panel panel-default']//div[@id='collapse1']//div")
	WebElement ele_acctxt_collapse1;

	@FindBy(xpath = "//form[@class='form-horizontal']//div[@class='col-xs-1']")
	WebElement ele_dob_picker_ico;

	@FindBy(id = "ui-datepicker-div")
	WebElement ele_dob_picker;

	@FindBy(xpath = "//tbody//tr//td[@data-handler='selectDay']//a")
	List<WebElement> ele_dob_days;

	@FindBy(xpath = "//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")
	WebElement ele_resize;

	@FindBy(xpath = "//div[@id='resizable']")
	WebElement ele_resize_width_height;

	@FindBy(xpath = "//div[@id='resizable']//div[3]")
	WebElement ele_resize_width_height_new;

	@FindBy(xpath = "//div[@class='col-xs-10 col-xs-offset-2'][1]//img")
	WebElement ele_from_drag;

	@FindBy(xpath = "//div[@id='droparea']")
	WebElement ele_to_drop;

	@FindBy(xpath = "//div[@class='col-xs-4 col-xs-offset-2']//img")
	List<WebElement> get_todrag_attribute;

	@FindBy(xpath = "//div[@class=' nav nav-tabs']//ul[@class='nav nav-tabs nav-stacked']//a[contains(text(),'Serialize')]")
	WebElement lnk_Serialize;

	@FindBy(xpath = "//div[@class=' nav nav-tabs']//ul[@class='nav nav-tabs nav-stacked']//a[contains(text(),'Default Functionality ')]")
	WebElement lnk_default_functionality;

	@FindBy(xpath = "//div[@id='Serialize']//span[2]")
	WebElement gettext_Serialize;

	@FindBy(xpath = "//ul[@class='SerializeFunc']//li//b")
	List<WebElement> lst_Serialize;

	// Video player elements
	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']")
	WebElement ele_videoElement;

	@FindBy(xpath = "//div[@id='movie_player']//div[@class='ytp-cued-thumbnail-overlay']//button[@class='ytp-large-play-button ytp-button']")
	WebElement btn_playvideo;

	@FindBy(xpath = "//div[@class='ytp-left-controls']//button[@title='Pause (k)']")
	WebElement btn_pausevideo;

	@FindBy(xpath = "//div[@class='ytp-left-controls']//button[@title='Replay']")
	WebElement btn_replayvideo;

	@FindBy(xpath = "//span[@class='ytp-time-current']")
	WebElement ele_video_currentPlayTime;

	@FindBy(xpath = "//iframe[@src='https://www.youtube.com/embed/wPECeNP1BoY']")
	WebElement iframe_videoplayer;

	@FindBy(xpath = "//div[@class='cont_box']//div[1]//a[contains(text(),'Download')]")
	WebElement btn_filedownload;
	
	@FindBy(xpath = "//div[@class='panel-body']//button[contains(text(),'Run')]")
	WebElement btn_loader_run;
	
	@FindBy(xpath = "//div[@class='blockUI blockMsg blockPage']")
	WebElement loader_pleasewait;
	
	@FindBy(xpath = "//div[@class='modal-content']//h4")
	WebElement popup_header_title;
	
	@FindBy(xpath = "//div[@class='modal-content']//button[contains(text(),'Close')]")
	WebElement btn_popup_close;
	
	
	
	

	public Learning_Page() {

		PageFactory.initElements(driver, this);
	}

	public void click_btn_playvideo() {
		isClickable(btn_playvideo);
	}

	public void click_btn_pausevideo() {
		isClickable(btn_pausevideo);
	}

	public void playVideo() {
		try {
			click_btn_playvideo();
		} catch (Exception e) {

		}
	}

	public void pauseVideo() {
		try {
			click_btn_pausevideo();
			Thread.sleep(1000);
		} catch (Exception e) {

		}
	}

	public boolean isVideoPlaying() {

		return getAttribute(btn_playvideo, "title").contains("pause");

	}

	public boolean isVideoPlaying(WebElement ele) {
		return isVideoPlaying(btn_playvideo);
	}

	public Integer getCurrentTimeInSeconds() {
		try {
			hoverVideoPlayer();
			return Integer.valueOf(ele_video_currentPlayTime.getText().split(":")[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void hoverVideoPlayer() {

		moveToElement(ele_videoElement);
		// waitForWebElementIsVisible(ele_videoElement, 30);

	}

	public void sleep(long timeOut) {
		try {
			Thread.sleep(timeOut);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<String> dob_days() throws InterruptedException {

		return getMultipleAttribute(ele_dob_days, "class", "highlight");

	}

	public void hover_Switchto() throws InterruptedException {
		moveToElement(lbl_Switchto);

	}

	public void hover_Widgets() throws InterruptedException {
		moveToElement(lbl_Widgets);

	}

	public void hover_video() throws InterruptedException {
		moveToElement(lbl_video);

	}

	public void hover_interactions() throws InterruptedException {
		moveToElement(lbl_Interactions);

	}

	public void hover_Dragdrop() throws InterruptedException {
		moveToElement(lbl_dragdrop);

	}

	public void hover_more() throws InterruptedException {
		moveToElement(lbl_more);

	}

	public void click_filedownload() {
		isClickable(lnk_filedownload);
	}
	
	public void click_loader() {
		isClickable(lnk_loader);
	}

	public void click_windows() {
		isClickable(lnk_Windows);
	}

	public void click_accordion() {
		isClickable(lnk_Accordion);
	}
	
	public void click_popup_close() {
		isClickable(btn_popup_close);
	}

	public void click_file_download() throws InterruptedException {
		if (isElementPresent(btn_filedownload)) {
			
			isClickable(btn_filedownload);
			Thread.sleep(5000);
		}
	}
	
	public void loader_verify() throws InterruptedException {
		if (isElementPresent(loader_pleasewait)) {
			
			isdisplay(loader_pleasewait);
			  
			Thread.sleep(5000);
		}
		
	}
	
	
	public void popup_verify() throws InterruptedException {
		if (isElementPresent(popup_header_title)) {
			
			isdisplay(popup_header_title);
			  
			Thread.sleep(5000);
		}
		
	}
	
	public void click_loader_run() throws InterruptedException {
		if (isElementPresent(btn_loader_run)) {
			
			isClickable(btn_loader_run);
			Thread.sleep(5000);
		}
	}

	public void click_youtube() {
		isClickable(lnk_youtube);
	}

	public void click_datepicker() {
		isClickable(lnk_datepicker);
	}

	public void click_resizable() {
		isClickable(lnk_Resizable);
	}

	public void click_staticdragdrop() {
		isClickable(lnk_staticdragdrop);
	}

	public void click_Selectable() {
		isClickable(lnk_selectable);
	}

	public void switchframe_advertise() {

		switchToFrame(frm_mainframe);
		switchToFrame(frm_Advertisement);
	}

	public void switchframe_video() {
		switchToFrame(iframe_videoplayer);
	}

	public void click_windows_close() {
		isClickable(btn_Windowclose);
	}

	public void switch_parentwindow() {
		switchToparent();
		switchToparent();
	}

	public void click_new_seperatewindow() {
		isClickable(lnk_new_Seperatewindow);
	}

	public void click_new_tabbedwindow() {
		isClickable(lnk_new_tabbedwindow);
	}

	public void click_on_btntabbed() {
		isClickable(btn_tabbed_click);
	}

	public void click_on_Download() {
		isClickable(lnk_download);
	}

	public void click_on_Documentation() {
		isClickable(lnk_Documentation);
	}

	public void click_on_btnseperate() {
		isClickable(btn_seperate_click);
	}

	public String get_accordian_attribute() {
		return getAttribute(acc_collapse1, "class");
	}

	public String get_acctxt_collapse1() {
		return getText(ele_acctxt_collapse1);
	}

	public void click_dob_picker_ico() {
		isClickable(ele_dob_picker_ico);
	}

	public String dob_picker_present() {
		isElementPresent(ele_dob_picker);
		return getCurrentDay();

	}

	public void resize_obj() {

		resize(ele_resize, 250, 280);

	}

	public void dragdrop_obj() {

		dragAndDrop(ele_from_drag, ele_to_drop);

	}

	public String get_fromdrag_attribute() {
		return getAttribute(ele_from_drag, "src");
	}

	public List<String> get_todrag_attribute() throws InterruptedException {

		return getMultipleAttribute_value(get_todrag_attribute, "src");

	}

	public String resize_width_height() throws InterruptedException {

		return getAttribute(ele_resize_width_height, "style");

	}

	public List<Integer> resized_object() throws InterruptedException {

		List<Integer> list = new ArrayList<Integer>();
		Point point = ele_resize_width_height_new.getLocation();
		int xcord = point.getX();
		list.add(xcord);
		int ycord = point.getY();
		list.add(ycord);
		return list;

	}

	public void click_on_serialize() {
		isClickable(lnk_Serialize);
	}

	public void click_on_default_functionality() {
		isClickable(lnk_default_functionality);
	}

	public String gettext_serialized() {
		return getText(gettext_Serialize);
	}

	public List<String> list_serialized() throws InterruptedException {

		return getMultipleText(lst_Serialize);

	}

	// Video Player Methods

}
