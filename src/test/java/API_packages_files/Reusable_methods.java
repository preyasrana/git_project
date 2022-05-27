package API_packages_files;

import io.restassured.path.json.JsonPath;

public class Reusable_methods {

	public static JsonPath rawToJson(String response) {

		JsonPath jsonpath_get = new JsonPath(response);
		return jsonpath_get;

	}

}
