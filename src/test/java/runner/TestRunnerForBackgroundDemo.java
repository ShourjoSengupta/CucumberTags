package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/FeatureBackground/BackgroundDemo.feature" },
				glue = "StepDefinitionBackground", 
				dryRun = true,
				plugin = {"pretty", "html:test-output", 
						"json:target/cucumber.json", 
						"junit:junit_xml/cucumber.xml" }) 
public class TestRunnerForBackgroundDemo {
	
			

}
