package Runners;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;*/

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDefinition" } , monochrome =true,plugin = {"pretty", "html:target/Html-reports/cucumber-reports.html","json:target/Json-reports/cucumber.json","junit:target/XML-reports/Cucumber.xml"},tags = "@Regression" )

@CucumberOptions(features = "src/test/resources/Features/register", glue = { "" }, monochrome = true, plugin = {
		"pretty", "html:target/Html-reports/cucumber-reports.html", "json:target/Json-reports/cucumber.json",
		"junit:target/XML-reports/Cucumber.xml", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/" }, tags = "@smoketest")

@Test
public class Register_TestRunner extends AbstractTestNGCucumberTests {
	
	

}