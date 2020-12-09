package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Search.feature"},
		glue = {"stepdefinitions", "MyHooks"},
		tags = "@Smoke or @Regression",
		plugin = {"pretty"}
		
		)
public class AmazonTest {

}
