package pages;

import bases.MasterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends MasterPage {

    private GooglePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "xpath")
    private WebElement googleDemo;

    public static GooglePage using(WebDriver driver) {
        return new GooglePage(driver);
    }

    public void navigateToPage(String url) {
        getDriver().navigate().to(url);
    }

    public String getTitlePage() {
        return getDriver().getTitle();
    }

    public String getTextGoogleDemo() {
        return googleDemo.getText();
    }
}
