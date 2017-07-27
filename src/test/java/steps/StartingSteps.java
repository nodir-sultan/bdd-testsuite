package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

import java.util.concurrent.TimeUnit;

public class StartingSteps extends DriverFactory {

    private WebDriver driver;

    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
        System.out.println("Starting run of actual scenario");
    }

    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
        System.out.println("Finishing run of actual scenario, even if it failed");
    }

    @Given("^the user is on landing page$")
    public void setup() throws Throwable {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.magicleap.com/#/home");
        driver.getCurrentUrl();
    }

    @Before("@Signup-DataDriven")
    public void signupSetup() {
        System.out.println("@Signup-DataDriven tagged scenario is going to run ");
    }

    @After("@Signup-DataDriven")
    public void signupTeardown() {
        System.out.println("@Signup-DataDriven tagged scenario is finished to run");
    }

}
