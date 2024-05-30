package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/Features",
		glue="stepDefinitions",
		publish=true,
		plugin= {"html:reposrts/cucumber-html-report.html","json:report/cucumber-json/cucumber.json"},
		dryRun=false
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
