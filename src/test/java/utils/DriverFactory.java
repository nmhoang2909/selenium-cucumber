package utils;

import enums.Browsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {

    private WebDriver driver;

    private static final String MAC = "mac";
    private static final String WIN = "win";

    private static final String OS_NAME = "os.name";

    private static final String GECKO_PROPERTY = "webdriver.gecko.driver";
    private static final String CHROME_PROPERTY = "webdriver.chrome.driver";

    private final String geckoMacDriver = getDriverFile("/drivers/geckodriver_mac");
    private final String chromeMacDriver = getDriverFile("/drivers/chromedriver_mac");

    private final String geckoWinDriver = getDriverFile("/drivers/geckodriver_win.exe");
    private final String chromeWinDriver = getDriverFile("/drivers/chromedriver_win.exe");


    private String getDriverFile(String driverFile) {
        return getClass().getResource(driverFile).getPath();
    }

    private WebDriver createDriver(Browsers browser) {
        switch (browser) {
            case FIREFOX:
                System.setProperty(GECKO_PROPERTY, (System.getProperty(OS_NAME).equalsIgnoreCase(MAC)) ? geckoMacDriver : geckoWinDriver);
                driver = (driver != null) ? driver : new FirefoxDriver();
                break;
            case CHROME:
                System.setProperty(CHROME_PROPERTY, (System.getProperty(OS_NAME).equalsIgnoreCase(MAC)) ? chromeMacDriver : chromeWinDriver);
                driver = (driver != null) ? driver : new ChromeDriver();
                break;
            default:
                driver = null;
                break;
        }
        return driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public DriverFactory(Browsers browser) {
        driver = createDriver(browser);
    }
}
