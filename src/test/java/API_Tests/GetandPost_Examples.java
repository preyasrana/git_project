package API_Tests;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.Map;
import org.apache.commons.collections4.map.HashedMap;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class GetandPost_Examples {
	
	//@Test
	public void getname() {
		
		baseURI = "https://reqres.in/api";
		
		given()
		   .get("/users?page=2")
		.then()
		    .statusCode(200)
		    .body("data[0].first_name", equalTo("Michael"))
		    .body("data.first_name", hasItems("Michael,Lindsay,Tobias,Byron,George"));
		
	}
	
	@Test
	public void testpost() {
		
		Map<String, Object> map = new HashedMap<String,Object>();
		//map.put("name", "preyas");
		//map.put("job", "test");
		
		//System.out.println(map);
		
		JSONObject  request = new JSONObject(map);
		request.put("name", "preyas");
		request.put("job", "test");
			
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		   .body(request.toJSONString())
		   .when()
		   .post("/users")
		   .then().statusCode(201)
		   
		   .log().all();
		
	}
	
	

}
