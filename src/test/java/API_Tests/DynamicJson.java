package API_Tests;

import org.testng.annotations.Test;

import API_packages_files.Reusable_methods;
import API_packages_files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;


public class DynamicJson {
	
	public  JsonPath json;
	
	@Test
	public void postdata() {
		
		RestAssured.baseURI ="http://216.10.245.166";
		
		String res = given().log().all().header("Content-Type","application/json").body(payload.Addbook())
		.when().post("/Library/Addbook.php")
		.then().statusCode(200)
		.extract().response().asString();
		
		
		json = Reusable_methods.rawToJson(res);
		System.out.println(json);
		String id = json.get("ID");
		System.out.println(id);
		
		
	}
	
	

}
