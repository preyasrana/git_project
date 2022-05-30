package API_Tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import API_packages_files.Reusable_methods;
import API_packages_files.payload;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static org.hamcrest.Matchers.*;



/*
  given()
      set cookies , add auth , param, header etc
  when()
     get,put,post,delete
  then()
    validate status code, exract code , cookies etc          
 */

public class Restassured {
	

	public  JsonPath json;
	// Give : All input details
	// When : Submit All api
	// Then : Validate response
	@Test
	public void RSA_post() {

		
		//**********************   Post method  **********************
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response =  given().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(payload.data()).when()
				.post("/maps/api/place/add/json").then().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)")
				.extract().response().asString();
		
		System.out.println(response);
		
		json = Reusable_methods.rawToJson(response);
	
		String placeid = json.getString("place_id");
		System.out.println("placeid is ::"+placeid);
		
		String addedaddress = "70 Summer walk, USA";
		
		//**********************  Update method  **********************
		given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\n"
				+ "\"place_id\":\""+placeid+"\",\n"
				+ "\"address\":\""+addedaddress+"\",\n"
				+ "\"key\":\"qaclick123\"\n"
				+ "}").when().put("/maps/api/place/update/json")
		.then().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		 
		//**********************  Get Method  **********************
		String getresponse =  given().queryParam("place_id", placeid).queryParam("key", "qaclick123")
		.when().get("/maps/api/place/get/json")
		.then().log().all().statusCode(200).extract().response().asString();
		
		json = Reusable_methods.rawToJson(getresponse);
	
		String expectedaddress = json.getString("address");
		System.out.println(expectedaddress);
		Assert.assertEquals(addedaddress, expectedaddress);
		
		//**********************    Delete Method   **********************
	    given().queryParam("key", "qaclick123").header("Content-Type","application/json")
	    .body("{\n"
	    		+ "    \"place_id\":\""+placeid+"\"\n"
	    		+ "}")
	    .when().delete("/maps/api/place/delete/json")
	    .then().log().all().statusCode(200).body("status", equalTo("OK"));

	}
	


	// @Test
	public void get() {

		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httprequest = RestAssured.given();
		Response res = httprequest.request(Method.GET, "");

		System.out.println("Response is ::" + res.getStatusLine());
		System.out.println("Response Pretty format::" + res.asPrettyString());

	}

	// @Test
	public void name() {

		RestAssured.baseURI = "https://reqres.in/api";
		RequestSpecification httpreq = RestAssured.given();
		Response res = httpreq.get("/users?page=2");

		System.out.println("As a Body response ::" + res.asString());
		System.out.println("Response Pretty format ::" + res.asPrettyString());
		int statuscode = res.getStatusCode();
		System.out.println("Status code is ::" + statuscode);
		Assert.assertEquals(statuscode, 200, "Status Code for api");

		System.out.println("Response is ::" + res.getStatusLine());
		Assert.assertEquals(res.getStatusLine(), "HTTP/1.1 200 OK", "Verify statusline code");

		Headers allheader = res.headers();

		for (Header header : allheader) {

			System.out.println("Key ::" + header.getName() + "   ,Value ::" + header.getValue());

		}

		String contenttype = res.header("Content-Type");
		System.out.println("Content type is ::" + contenttype);

		String server = res.header("Server");
		System.out.println("Server value is ::" + server);

		ResponseBody body = res.getBody();
		System.out.println("body response is" + body.asString());

		JsonPath jsonpath = res.jsonPath();

		int total = jsonpath.get("total");
		System.out.println("Total value is ::" + total);
		System.out.println("Total value is ::" + String.valueOf(total));

	}

	// @Test
	public void queryparam() {

		RestAssured.baseURI = "https://demoqa.com/BookStore/v1";

		RequestSpecification httpsreq = RestAssured.given();
		Response res = httpsreq.queryParam("ISBN", "9781449325862").get("/Book");
		ResponseBody body = res.getBody();
		System.out.println("body response is" + body.asString());

		String bodyres = body.asString();

		JsonPath jsonpath = new JsonPath(bodyres);
		System.out.println(jsonpath);

		String title = jsonpath.getString("title");
		System.out.println(title);

	}

	// @Test
	public void basicauth() {

		String Username = "Testing_new_user23";
		String Password = "Test10@Preyas";
		String isbn = "9781593277574";
		String baseUrl = "https://bookstore.demoqa.com";
		String endpoint = "/Account/v1/User";

		RestAssured.baseURI = baseUrl;
		RequestSpecification httpreq = given().auth().basic(Username, Password);
		Response res = httpreq.get(endpoint);

		ResponseBody body = res.body();
		String resnew = body.asString();

		System.out.println("Response ::" + body.asPrettyString());
		System.out.println("resnew  ::" + resnew);

	}

}
