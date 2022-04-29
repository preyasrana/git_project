package Runners;

import org.testng.annotations.Test;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features/login" }, glue = { "" }, monochrome = true, plugin = {
		"pretty", "html:target/Html-reports/cucumber-reports.html", "json:target/Json-reports/cucumber.json",
		"junit:target/XML-reports/Cucumber.xml", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/" }, tags = "@smoketest")

@Test
public class Login_TestRunner extends AbstractTestNGCucumberTests {

}