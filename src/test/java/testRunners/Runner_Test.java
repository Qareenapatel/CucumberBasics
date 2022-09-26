package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\patel\\eclipse-practiceQA\\CucumberBasic\\src\\test\\resources\\LoginFeature\\Login.feature",
glue="stepDefinitions",
monochrome = true,
plugin = {"pretty","html:target/HtmlReports/report.html","json:target/JsonReports/report.json,","junit:target/JUnitReports/report.xml"})
public class Runner_Test {

}
