package steps;

import base.DriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BasicStep {
    private WebDriver driver;

    public BasicStep() {
        this.driver = Hooks.driver;
    }

    @Given("^User open the Browser$")
    public void userOpenTheBrowser() throws Throwable {
//        driver = new DriverFactory(DriverFactory.Browsers.FIREFOX).getDriver();
        return;
    }

    @When("^User navigate to Google Search page$")
    public void userNavigateToGoogleSearchPage() throws Throwable {
        driver.navigate().to("https://www.google.com");
    }

    @Then("^Verify that User is on correct Google Search page$")
    public void verifyThatUserIsOnCorrectGoogleSearchPage() throws Throwable {
        Assert.assertEquals("Google", driver.getTitle());
    }

    @When("^User navigate to Gmail page$")
    public void userNavigateToGmailPage() throws Throwable {
        driver.navigate().to("https://gmail.com");
    }
}
