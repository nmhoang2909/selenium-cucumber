package steps;

import bases.MasterStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.GooglePage;

public class GoogleStep extends MasterStep {

    private GooglePage googlePage = GooglePage.using(getDriver());

    @Given("^User open the Browser$")
    public void userOpenTheBrowser() {
    }

    @When("^User navigate to \"([^\"]*)\" page$")
    public void userNavigateToPage(String url) {
        googlePage.navigateToPage(url);
    }

    @Then("^Verify that User is on correct Google Search page$")
    public void verifyThatUserIsOnCorrectGoogleSearchPage() {
        Assert.assertEquals("Google", googlePage.getTitlePage());
    }
}
