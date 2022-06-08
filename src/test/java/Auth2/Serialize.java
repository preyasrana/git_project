package Auth2;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import POJO.Addplace;
import POJO.location;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Serialize {

	public JsonPath json;

	Addplace addplc = new Addplace();
	location loc = new location();
	

	@Test
	public void serialzed() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
	
		addplc.setAccuracy(100);
		addplc.setName("Preyas rana");
		addplc.setPhone_number("(+91) 990 123 1111");
		addplc.setAddress("30, new layout, side 09");
		addplc.setWebsite("https://www.google.com");
		addplc.setLanguage("English US");
		
		List<String> mylist = new ArrayList<>();
		mylist.add("new park");
		mylist.add("new");
		addplc.setTypes(mylist);
		
		loc.setLat(-23.1234);
		loc.setLng(12.4566);
		
		addplc.setLocation(loc);
		
		//Code 
		String response = given().log().all()
				 .queryParam("key", "qaclick123")
				.body(addplc)
			.when().post("/maps/api/place/add/json").then()
			.assertThat().statusCode(200).extract().response().asString();

		System.out.println(response);

	}

}
