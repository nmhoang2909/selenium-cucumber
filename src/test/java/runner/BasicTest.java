package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue={"steps"},
        format = {"pretty", "html:target/cucumber-report", "json:target/cucumber-report/cucumber.json"}
)
public class BasicTest {
}
