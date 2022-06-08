package API_Tests;

import org.testng.Assert;

import org.testng.annotations.Test;

import API_packages_files.Reusable_methods;
import API_packages_files.payload;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

public class ComplexJson {

	public JsonPath json;

	// @Test
	public void complexjson() {

		json = Reusable_methods.rawToJson(payload.CoursePrice());

		int count = json.getInt("courses.size()");
		System.out.println("Count of Courses ::" + count);

		double purchased_amount = json.getDouble("dashboard.purchaseAmount");
		System.out.println(purchased_amount);

		String course_title = json.getString("courses[1].title");
		System.out.println(course_title);

		for (int i = 0; i < count; i++) {
			double price = json.getDouble("courses[" + i + "].price");
			System.out.println("Price is  ::" + price);

			double copies = json.getDouble("courses[" + i + "].copies");
			System.out.println("Coupies is ::" + copies);
		}

		for (int i = 0; i < count; i++) {
			String coursetitle = json.getString("courses[" + i + "].title");
			if (coursetitle.equalsIgnoreCase("RPA")) {
				double price = json.getDouble("courses[" + i + "].price");
				System.out.println("RPA Price is  ::" + price);

				double copies = json.getDouble("courses[" + i + "].copies");
				System.out.println("RPA Coupies is ::" + copies);
				break;
			}
		}
	}

	//@Test
	public void sumprices() {

		json = Reusable_methods.rawToJson(payload.CoursePrice());

		double sum = 0;
		int count = json.getInt("courses.size()");
		for (int i = 0; i < count; i++) {

			double price = json.getDouble("courses[" + i + "].price");
			double copies = json.getDouble("courses[" + i + "].copies");

			double amount = price * copies;
			System.out.println(amount);
			sum = sum + amount;

		}

		System.out.println("toal sum value is ::" + sum);

		double purchased_amount = json.getDouble("dashboard.purchaseAmount");
		System.out.println(purchased_amount);

		Assert.assertEquals(sum, purchased_amount);

	}
	
	//@Test
	public void auth2() {
		
	//Get code
	//get access token
	String token =	given().queryParam("code", "4/0AX4XfWgtenR3ED9Wj5NDjvZ1WPIicWqZFuDI-RqjuWGY8z6uZGjVewRQ9Wdo2UrIRxHdfg")
		.queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
		.queryParam("grant_type", "authorization_code")
		
		.when().post("https://www.googleapis.com/oauth2/v4/token").asString();
		
	json = Reusable_methods.rawToJson(token);
	
	String accesstoken = json.getString("access_token");
	System.out.println("access token is ::"+accesstoken);
		
	
	//actual request	
	String response = given().queryParam("access_token", accesstoken)
		.when()
		.get("https://rahulshettyacademy.com/getCourse.php").asString();
			
		System.out.println(response);
		
	}
	
	
	@Test
	public void auth3() {
		
		
		
		
		RestAssured.baseURI = "https://api.spotify.com/v1";
		
		String response = given().queryParam("grant_type", "authorization_code")
				.queryParam("client_id", "4e95ed2a5096419d92787be74f2e0e8c")
				.queryParam("client_secret", "b72989f7c4ca4a49982fe66e60a0edb1")
				.queryParam("", "playlist-modify-public playlist-read-private playlist-modify-private")
				
				.when()
				.get("/browse/new-releases").asString();
					
				System.out.println(response);
				
	}
	
	

}
