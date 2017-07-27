package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage {

    WebDriver driver;

    public ThankYouPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isThankYouButtonDisplayed() throws Throwable {
        return driver.findElement(By.xpath("//div[@id='thankyou']/div[4]/div/div/div")).isDisplayed();
    }
}
