package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = { "src/test/resources/FeatureGoogle/Google.feature" },
					glue = "StepDefinitionGoogle", 
					dryRun = false, 
					monochrome = false,
					plugin = {"pretty", "html:test-output", 
							"json:target/cucumber.json", 
							"junit:junit_xml/cucumber.xml" })
	
	public class RunnerGoogle {
}
