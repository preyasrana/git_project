package Auth2;

import static io.restassured.RestAssured.given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import API_packages_files.Reusable_methods;
import POJO.Getcouses;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

public class Auth_2 {

	public JsonPath json;
	public static WebDriver driver;

	@Test
	public void Auth() throws InterruptedException {

	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/"
				+ "auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/"
				+ "v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps."
				+ "googleusercontent.com&response_type=code&"
				+ "redirect_uri=https://rahulshettyacademy.com/getCourse.php");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Snapdealmark007@gmail.com");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SnapMARK@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='passwordNext']//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		System.out.println("url is --->"+url);
		
		
		//String url = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AX4XfWipPNR-G2fRN7Z7-M0H4QK0-MqxBmXthHPWMdgdpOpNIHkwoKNVEBpvlXtKmXjpNA&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=none";
		String Partialcode = url.split("code=")[1];
		//System.out.println(Partialcode);
		String code = Partialcode.split("&scope")[0];
		System.out.println(code);
		
		// Get code
		// get access token
		String token = given().urlEncodingEnabled(false)
				.queryParam("code", code)
				.queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
				.queryParam("grant_type", "authorization_code")

				.when().log().all()
				.post("https://www.googleapis.com/oauth2/v4/token").asString();
		

		json = Reusable_methods.rawToJson(token);

		String accesstoken = json.getString("access_token");
		System.out.println("access token is ::" + accesstoken);
		
		String res  = given().queryParam("access_token", accesstoken)
				.when()
				.get("https://rahulshettyacademy.com/getCourse.php").asString();
		System.out.println("Response is >>"+res);
		

		// actual request
		Getcouses response = given().queryParam("access_token", accesstoken).expect().defaultParser(Parser.JSON)
				.when()
				.get("https://rahulshettyacademy.com/getCourse.php").as(Getcouses.class);

		System.out.println(response);
		
		System.out.println(response.getLinkedIn());
		System.out.println(response.getInstructor());
		

	}

}
