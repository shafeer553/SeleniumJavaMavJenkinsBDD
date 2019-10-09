package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src\\test\\java\\features"},glue= {"stepDefinition"}, plugin= {"pretty","json:Cucu_Reports/cucumber.json"}, tags= {"@gema_login"}, dryRun = true)

@CucumberOptions(features = "src\\test\\java\\features", glue = { "stepDefinition" }, plugin = { "pretty",
		"json:Cucu_Reports/Cucumber.json", "junit:Cucu_Reports/Cucumber.xml",
		"html:Cucu_Reports/cucumber-reports" }, monochrome = true, tags = { "" })

public class TestRunner {

}