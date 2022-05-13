package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

//@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features/Shop" }, glue = { "" }, monochrome = true, plugin = { "pretty",
		"html:target/Html-reports/cucumber-reports.html", "json:target/Json-reports/cucumber.json",
		"junit:target/XML-reports/Cucumber.xml", 
		"rerun:target/failedrerun.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/"}, 
       tags = "@smoketest")

@Test
public class Shop_Testrunner extends AbstractTestNGCucumberTests{
	
	
	
     
}
