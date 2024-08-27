package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/FeaturesWithTags/TagsDemo.feature" },
				glue = "stepDefinition", 
				dryRun = true, 
//				monochrome = false,
//				tags="@smoke"
//				tags ="@smoke or @regression"
//				tags ="@smoke and @regression"
//				tags = "(@smoke or @regression) and @end2end"
//				tags = "@regression and not @smoke"
				tags = "(@smoke or @regression) and not @end2end"
		)
//				plugin = {"pretty", "html:test-output", 
//						"json:target/cucumber.json", 
//						"junit:junit_xml/cucumber.xml" })
public class RunWithSingleTag {

}
