package steps;

import base.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;


public class Hooks {

    protected static WebDriver driver;

    enum BROWSERS {
        BROWSER, CHROME, FIREFOX;
    }

    @Before
    public void beforeScenario() {
        String browser = System.getProperty("BROWSER");

        if (browser == null) {
            browser = System.getenv("BROWSER");
            if (browser == null) {
                browser = "chrome";
            }
        }

        if (browser.equals("chrome")) {
            driver = new DriverFactory(DriverFactory.Browsers.CHROME).getDriver();

        } else if (browser.equals("firefox")) {
            driver = new DriverFactory(DriverFactory.Browsers.FIREFOX).getDriver();

        }
        driver.manage().deleteAllCookies();
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenShot, "img/png");
            } catch (WebDriverException ex) {
                ex.printStackTrace();
            }
        }
        driver.close();
    }
}
