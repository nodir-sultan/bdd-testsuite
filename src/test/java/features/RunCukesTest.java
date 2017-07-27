package features;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/BasicContactWorkflow.feature",
        format = {"pretty", "html:report/cucumber", "json:report/cucumber-report.json"})
public class RunCukesTest {
}