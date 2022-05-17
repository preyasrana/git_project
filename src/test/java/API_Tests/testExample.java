package API_Tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class testExample {

	@Test
	public void getname() {

		Response response = RestAssured.get("https://reqres.in/api/users?page=2");

		System.out.println(response);
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.body().asString());
		System.out.println(response.statusLine());
		System.out.println(response.getHeader("content-type"));
		
		

	}

}
