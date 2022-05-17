package API_Tests;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import java.util.Map;
import org.apache.commons.collections4.map.HashedMap;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchDelete {
	
@Test	
public void testput() {
		
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
		    .put("/users/2")
		    .then().statusCode(200)
		    .log().all();
		
	}

@Test
public void testpatch() {
	
	Map<String, Object> map = new HashedMap<String,Object>();
	//map.put("name", "preyas");
	//map.put("job", "test");
	
	//System.out.println(map);
	
	JSONObject  request = new JSONObject(map);
	request.put("name", "preyas");
	request.put("job", "testjob");
		
	System.out.println(request.toJSONString());
	
	baseURI = "https://reqres.in/api";
	
	given()
	  .header("Content-Type","application/json")
	  .contentType(ContentType.JSON)
	    .body(request.toJSONString())
	    .when()
	    .patch("/users/2")
	    .then().statusCode(200)
	    .log().all();
	
}

@Test
public void testdelete() {

	baseURI = "https://reqres.in/api";
	
	  when()
	    .delete("/users/2")
	    .then().statusCode(204)
	    .log().all();
	
}


}
