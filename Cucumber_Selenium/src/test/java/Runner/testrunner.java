package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Feature\\Feature.feature",glue= {"seleniumgluecode"},
plugin = { "pretty", "html:target/cucumber-reports" })

public class testrunner {

}
