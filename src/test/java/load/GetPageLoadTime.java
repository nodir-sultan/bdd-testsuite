package load;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.net.URL;

public class GetPageLoadTime {

    public static void main(String[] args) throws Exception{

        URL aURL = new URL ("https://www.magicleap.com/");
        System.out.println("protocol = " + aURL.getProtocol());
        System.out.println("authority = " + aURL.getAuthority());
        System.out.println("port = " + aURL.getPort());
        System.out.println("content = " + aURL.getContent());

        WebDriver driver = new ChromeDriver();
        EventFiringWebDriver efDriver = new EventFiringWebDriver(driver);
        WDEventListener eventListener = new WDEventListener();
        efDriver.register(eventListener);
        for (int i = 1; i<150; i++){
            efDriver.get("https://www.magicleap.com");
            efDriver.navigate().refresh();
        }
        efDriver.quit();

        /*
        driver.get("https://www.magicleap.com");
        final JavascriptExecutor js = (JavascriptExecutor) driver;
        double loadTime = (Double) js.executeScript(
        "return (window.performance.timing.loadEventEnd - window.performance.timing.navigationStart) / 1000");
        System.out.print("Page load time for www.magicleap.com " + " is (in seconds) : " + loadTime);
        driver.quit();
        */

        /*
        StopWatch pageLoad = new StopWatch();
        pageLoad.start();
        driver.get("https://www.magicleap.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'CONTACT')]")));
        long pageLoadTime_ms = pageLoad.getTime(); //Get the time
        long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
        System.out.println("Page load time for www.magicleap.com " + pageLoadTime_ms + " milliseconds");
        System.out.println("Page load time for www.magicleap.com " + pageLoadTime_Seconds + " seconds");
        driver.quit();
        */
    }

}
