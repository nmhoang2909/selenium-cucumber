package utils.drivermanager;

import bases.MasterDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends MasterDriver {
    private static final String CHROME_PROPERTY = "webdriver.chrome.driver";
    private final String chromeWinDriver = getDriverFile("/drivers/chromedriver_win.exe");

    @Override
    protected void createDriver() {
        System.setProperty(CHROME_PROPERTY, chromeWinDriver);
        driver = new ChromeDriver();
    }
}
