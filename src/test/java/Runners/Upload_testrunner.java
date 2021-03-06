package Runners;

/*
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

//@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features/Upload" }, glue = { "" }, monochrome = true, plugin = { "pretty",
		"html:target/Html-reports/cucumber-reports.html", "json:target/Json-reports/cucumber.json",
		"junit:target/XML-reports/Cucumber.xml", 
		"rerun:target/failedrerun.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/"}, 
       tags = "@smoketest")

@Test
public class Upload_testrunner extends AbstractTestNGCucumberTests{
	
     
}