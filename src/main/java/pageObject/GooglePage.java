package pageObject;

import base.PageObject;
import org.openqa.selenium.WebDriver;

public class GooglePage extends PageObject {

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToGoogleHomePage() {
        driver.navigate().to("https://www.google.com");
    }
}
