package load;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WDEventListener extends AbstractWebDriverEventListener {

    long startTime, averageTime, endTime;

    @Override
    public void beforeNavigateTo(String arg0, WebDriver arg1) {
        startTime = System.currentTimeMillis();
    }

    //TO DO write the logic
    @Override
    public void afterNavigateRefresh(WebDriver arg1) {
        averageTime = System.currentTimeMillis();
        System.out.println("Average load time" + "(in milliseconds) :  " + averageTime);
    }

    @Override
    public void afterNavigateTo(String url, WebDriver arg1) {
        endTime = System.currentTimeMillis();
        System.out.println("Page load time for " + url + " is (in milliseconds) : " + (endTime - startTime));

    }

}