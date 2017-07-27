package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void she_decides_to_contact() throws Throwable {
        driver.findElement(By.xpath("//a[contains(text(),'CONTACT')]")).click();
        /*
        driver.navigate().to("https://www.magicleap.com/#/contact");
         */
    }
}