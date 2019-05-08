package bases;

import org.openqa.selenium.WebDriver;

/**
 * Created by hoangminhnguyen on 5/7/2019.
 */
public abstract class MasterStep {

    private WebDriver driver;

    public MasterStep() {
        driver = Hooks.driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
