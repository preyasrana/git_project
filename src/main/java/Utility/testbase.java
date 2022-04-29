package Utility;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import factory.DriverFactory;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import javax.xml.bind.DatatypeConverter;

public class testbase extends DriverFactory {

	public String Expected_Message;
	public String Actual_message;

	// waitForWebElementIsClickable
	public void waitForWebElementIsClickable(WebElement webElement, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}

	// waitForWebElementIsVisible
	public void waitForWebElementIsVisible(WebElement webElement, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}

	// isdisplay
	public boolean isdisplay(WebElement element) {
		boolean value = false;
		waitForWebElementIsVisible(element, 10);
		try {
			value = element.isDisplayed();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return value;
	}

	// isClickable
	public boolean isClickable(WebElement element) {
		boolean value = false;

		System.out.println(driver);
		waitForWebElementIsClickable(element, 10);

		try {

			if (element.isDisplayed() && element.isEnabled()) {

				element.click();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		return value;
	}

	public boolean isClickable(List<WebElement> element) {
		boolean value = false;

		System.out.println(driver);

		try {

			((WebElement) element).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return value;
	}

	// switchToFrame
	public void switchToFrame(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// switchToLatestWindow
	public String switchToLatestWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
			}
		}
		return parentWindow;
	}

	// refreshPage method
	public void refreshPage() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// browser back method
	public void browserback() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// First Selected dropdown value/text
	public String firstSelectedOption(WebElement element) {
		String value = null;
		try {
			Select sel = new Select(element);
			value = sel.getFirstSelectedOption().getText();

			// Print the Currently selected value
			System.out.println("firstSelectedOption  ::" + value);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return value;
	}

	// getText
	public String getText(WebElement element) {
		String value = null;
		try {
			waitForWebElementIsVisible(element, 30);
			scrollToElement(element);
			value = element.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	// moveToElement
	public void moveToElement(WebElement element) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(element).build().perform();
			// JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("arguments[0].scrollIntoView(true);", element);
			// Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// validateImage
	public boolean validateImage(WebElement element) {
		WebElement imageElement = element;
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(imageElement.getAttribute("src"));
			HttpResponse response = client.execute(request);
			if (response.getStatusLine().getStatusCode() != 200) {

				System.out.println("Image is invalid");
				return false;
			} else {
				System.out.println(response.getStatusLine().getStatusCode());
				System.out.println("Image is Valid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	// List value get
	public List<WebElement> list_values(List<WebElement> element) {

		try {
			System.out.println("List of values :: " + element.size());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return element;
	}

	// list of values
	public List<String> getMultipleText(List<WebElement> element) {
		List<String> values = new ArrayList<>();
		try {
			List<WebElement> webElements = element;
			for (WebElement webElement : webElements) {
				values.add(webElement.getText());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(values);
		return values;
	}

	// List validateImage
	public List<WebElement> Validate_image(List<WebElement> element) {

		try {
			System.out.println("List of images :: " + element.size());

			for (WebElement imgele : element) {

				HttpClient client = HttpClientBuilder.create().build();
				HttpGet request = new HttpGet(imgele.getAttribute("src"));
				// System.out.println("request is :::" + request);
				HttpResponse response = client.execute(request);

				if (response.getStatusLine().getStatusCode() != 200) {
					System.out.println("Image is invalid   ::" + response.getStatusLine().getStatusCode() + ":URL:"
							+ imgele.getAttribute("src"));
				} else {

					System.out.println("Image is Valid   ::" + response.getStatusLine().getStatusCode() + ":URL:"
							+ imgele.getAttribute("src"));
				}

				/*
				 * String data = imgele.getAttribute("src"); System.out.println("data is  >> " +
				 * data); String extension;
				 * 
				 * switch (data) { case "data:image/svg+xml;base64": extension = "svg";
				 * 
				 * String[] strings = data.split(","); // convert base64 string to binary data
				 * byte[] newdata = DatatypeConverter.parseBase64Binary(strings[1]); String path
				 * = "C:\\Users\\Ene\\Desktop\\test_image." + extension; File file = new
				 * File(path); try (OutputStream outputStream = new BufferedOutputStream(new
				 * FileOutputStream(file))) { outputStream.write(newdata); } catch (IOException
				 * e) { e.printStackTrace(); }
				 * 
				 * if (response.getStatusLine().getStatusCode() != 200) {
				 * System.out.println("Image is invalid   ::" +
				 * response.getStatusLine().getStatusCode() + ":URL:" +
				 * imgele.getAttribute("src")); } else {
				 * 
				 * System.out.println("Image is Valid   ::" +
				 * response.getStatusLine().getStatusCode() + ":URL:" +
				 * imgele.getAttribute("src")); }
				 * 
				 * break;
				 * 
				 * default:
				 * 
				 * if (response.getStatusLine().getStatusCode() != 200) {
				 * System.out.println("Image is invalid   ::" +
				 * response.getStatusLine().getStatusCode() + ":URL:" +
				 * imgele.getAttribute("src")); } else {
				 * 
				 * System.out.println("Image is Valid   ::" +
				 * response.getStatusLine().getStatusCode() + ":URL:" +
				 * imgele.getAttribute("src")); }
				 * 
				 * break;
				 * 
				 * }
				 */

				/*
				 * String base64String =imgele.getAttribute("src"); String[] strings =
				 * base64String.split(","); HttpResponse response = client.execute(request);
				 * String extension;
				 * 
				 * switch (strings[0]) {
				 * 
				 * case "data:image/jpeg;base64": extension = "jpeg"; break;
				 * 
				 * case "data:image/svg+xml;base64": extension = "svg"; break;
				 * 
				 * case "data:image/png;base64": extension = "png"; break; default://should
				 * write cases for more images types extension = "png"; break; }
				 * 
				 * //convert base64 string to binary data byte[] data =
				 * DatatypeConverter.parseBase64Binary(strings[1]); String path =
				 * "C:\\Users\\Ene\\Desktop\\test_image." + extension; File file = new
				 * File(path); try (OutputStream outputStream = new BufferedOutputStream(new
				 * FileOutputStream(file))) { outputStream.write(data); } catch (IOException e)
				 * { e.printStackTrace(); }
				 */

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	// Sendkeys
	public void sendKeys(WebElement element, String value) {
		try {
			waitForWebElementIsVisible(element, 30);
			scrollToElement(element);
			WebElement webelement = element;
			clearValue(webelement);
			element.sendKeys(Keys.chord(Keys.CONTROL, "a"), value);
			implicitWait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// implicitWait
	private final int waitTime = 30;

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}

	// scrollToElement
	public void scrollToElement(WebElement element) {
		try {
			WebElement webelement = element;
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webelement);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// clearValue
	public void clearValue(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = '';", element);
			implicitWait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// List validateURL
	public List<WebElement> Validate_URL(List<WebElement> element) {

		try {

			System.out.println("List of Url is" + element.size());

			for (WebElement url : element) {

				// System.out.println(links);

				HttpClient client = HttpClientBuilder.create().build();

				HttpGet request = new HttpGet(url.getAttribute("href"));
				HttpResponse response = client.execute(request);

				if (response.getStatusLine().getStatusCode() != 200) {
					System.out.println("URL is invalid   ::" + response.getStatusLine().getStatusCode() + ":URL:"
							+ url.getAttribute("href"));

				} else {

					System.out.println("URL is Valid   ::" + response.getStatusLine().getStatusCode() + ":URL:"
							+ url.getAttribute("href"));
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	// getemailString
	protected String getemailString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();

		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}

	private String chars = "abcdefghijklmnopqrstuvwxyz";
	private String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String NUMS = "1234567890";
	private String SPEC = "@#$%^&+=";
	private Random rnd = new Random();

	private String getTwoFrom(String src) {
		int index1 = (int) (rnd.nextFloat() * src.length()), index2 = (int) (rnd.nextFloat() * src.length());
		return "" + src.charAt(index1) + src.charAt(index2);
	}

	// CreatePassword for Random
	public String createPassword() {
		return getTwoFrom(chars) + getTwoFrom(CHARS) + getTwoFrom(NUMS) + getTwoFrom(SPEC);
	}

}
