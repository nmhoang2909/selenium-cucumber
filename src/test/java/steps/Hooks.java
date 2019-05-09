package steps;

import bases.MasterDriver;
import utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import enums.DriverType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Hooks {
    public static WebDriver driver;
    private MasterDriver masterDriver;

    @Before
    public void beforeScenario() {
        masterDriver = DriverFactory.getMasterDriver(DriverType.CHROME);
        driver = masterDriver.getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenShot, "image/png");
            } catch (WebDriverException ex) {
                ex.printStackTrace();
            }
        }
        masterDriver.quitDriver();
    }
}
