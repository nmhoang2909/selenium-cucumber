package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/",
        glue={"bases", "steps"},
        plugin = {"pretty", "html:target/cucumber-report", "json:target/cucumber.json"}
)
public class AllTest {
}
