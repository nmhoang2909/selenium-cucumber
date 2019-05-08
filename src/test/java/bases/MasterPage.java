package bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by hoangminhnguyen on 5/7/2019.
 */
public abstract class MasterPage {
    private WebDriver driver;

    public MasterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
