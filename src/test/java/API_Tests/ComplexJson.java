package API_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import API_packages_files.Reusable_methods;
import API_packages_files.payload;
import io.restassured.path.json.JsonPath;

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

	@Test
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

}
