package load;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class GetPageLoadTimeReport {

    @Test
    public void samplePageLoadFunction() {

        String extentReportFile = System.getProperty("user.dir")
                + "\\Test Results - GetPageLoadTimeReport.html";
        ExtentReports extent = new ExtentReports(extentReportFile, false);
        ExtentTest extentTest = extent.startTest("Display www.magicleap.com load time",
                "Sending GET using Selenium WebDriver to www.magicleap.com");

        WebDriver driver = new ChromeDriver();
        extentTest.log(LogStatus.INFO, "Browser Launched");
        EventFiringWebDriver efDriver = new EventFiringWebDriver(driver);
        WDEventListener eventListener = new WDEventListener();
        efDriver.register(eventListener);
        for (int i = 1; i<150; i++){
            efDriver.get("https://www.magicleap.com");
            extentTest.log(LogStatus.INFO, "Send GET to www.magicleap.com");
            efDriver.navigate().refresh();
        }
        efDriver.quit();
        extentTest.log(LogStatus.INFO, "Browser closed");
        extent.endTest(extentTest);
        extent.flush();
    }
}
