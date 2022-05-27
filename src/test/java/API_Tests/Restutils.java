package API_Tests;

import org.apache.commons.lang3.RandomStringUtils;

public class Restutils {

	public static String getid() {

		String generatestring = RandomStringUtils.randomNumeric(1);

		return ("110" + generatestring);
	}
	
	public static String getemail() {

		String generatestring = RandomStringUtils.randomAlphabetic(1);

		return ("110" + generatestring);
	}

}
