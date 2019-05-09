package utils.drivermanager;

import bases.MasterDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends MasterDriver {
    private static final String GECKO_PROPERTY = "webdriver.gecko.driver";
    private final String geckoWinDriver = getDriverFile("/drivers/geckodriver_win.exe");

    @Override
    protected void createDriver() {
        System.setProperty(GECKO_PROPERTY, geckoWinDriver);
        driver = new FirefoxDriver();
    }
}
