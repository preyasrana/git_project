package Auth2;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import POJO.Addplace;
import POJO.location;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder {

	public JsonPath json;

	Addplace addplc = new Addplace();
	location loc = new location();

	@Test
	public void serialzed() {

		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();

		ResponseSpecification res = new ResponseSpecBuilder().expectStatusCode(200)
				.expectContentType(ContentType.JSON)
				.build();

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

		// Code
		RequestSpecification response = given().spec(req).body(addplc);

		Response getresponse = response.when().post("/maps/api/place/add/json")
				.then().spec(res).extract().response();

		System.out.println(getresponse.asString());

	}

}
