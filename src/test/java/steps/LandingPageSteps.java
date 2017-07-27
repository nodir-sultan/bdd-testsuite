package steps;

import cucumber.api.java.en.When;
import pages.LandingPage;
import util.DriverFactory;

public class LandingPageSteps extends DriverFactory {

    @When("^she decides to contact$")
    public void she_decides_to_contact() throws Throwable {
        new LandingPage(driver).she_decides_to_contact();
    }
}

