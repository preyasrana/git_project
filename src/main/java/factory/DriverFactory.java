package factory;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;

	// public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	/**
	 * This method is used to initialize the thradlocal driver on the basis of given
	 * browser
	 * 
	 * @param browser
	 * @return this will return tldriver.
	 */
	public WebDriver init_driver(String browser) {

		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {

			// WebDriverManager.chromedriver().browserVersion("100.0.4896.127").setup();
			// WebDriverManager.chromedriver().driverVersion("100.0.4896.127").setup();
			System.out.println("system path"+System.getProperty("user.dir"));
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/resources/Download/chromedriver");
			// System.setProperty("webdriver.chrome.verboseLogging", "true");
			// WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();

			// DesiredCapabilities capabilities = new DesiredCapabilities();

			//ChromeOptions options = new ChromeOptions();
			// options.addArguments("start-maximized"); // open Browser in maximized mode
			//options.addArguments("window-size=1366,768");
			//options.addArguments("disable-infobars"); // disabling infobars
			//options.addArguments("--disable-extensions"); // disabling extensions
			//options.addArguments("--no-sandbox");
			//options.addArguments("--headless");
			// options.addArguments("--disable-gpu"); // applicable to windows os only
			//options.addArguments("--disable-dev-shm-usage");// overcome limited resource
			// options.addArguments("--remote-debugging-port=38500"); // # this
			//options.addArguments("--whitelisted-ips");

			// driver = new RemoteWebDriver(capabilities);
			// Capabilities actualCapabilities = ((RemoteWebDriver)
			// driver).getCapabilities();
			//driver = new ChromeDriver(options);

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}

		// getDriver().manage().deleteAllCookies();
		// getDriver().manage().window().maximize();

		return getDriver();

	}

	/**
	 * this is used to get the driver with ThreadLocal
	 * 
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		return driver;
	}

	/*
	*/

}
