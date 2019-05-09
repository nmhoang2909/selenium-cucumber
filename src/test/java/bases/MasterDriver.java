package bases;

import org.openqa.selenium.WebDriver;

public abstract class MasterDriver {
    protected WebDriver driver;

    protected abstract void createDriver();

    public WebDriver getDriver() {
        if (null == driver) {
            createDriver();
        }
        return driver;
    }

    public void quitDriver() {
        if (null != driver) {
            driver.quit();
            driver = null;
        }
    }

    protected String getDriverFile(String driverFile) {
        return getClass().getResource(driverFile).getPath();
    }
}
