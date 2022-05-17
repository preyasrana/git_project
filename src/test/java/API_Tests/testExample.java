package API_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class testExample {

	@Test
	public void gettest1() {

		Response response = get("https://reqres.in/api/users?page=2");

		System.out.println(response);
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.body().asString());
		System.out.println(response.statusLine());
		System.out.println(response.getHeader("content-type"));

		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);

	}

	@Test
	public void gettest2() {

		baseURI = "https://reqres.in/api";
		given()
		   .get("/users?page=2")
		.then()
		    .statusCode(200)
		 .body("data[1].id", equalTo(8))
		 .body("data[1].email", equalTo("lindsay.ferguson@reqres.in"))
		    .log().all();

	}

}
