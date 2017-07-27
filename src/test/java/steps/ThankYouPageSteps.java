package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.ThankYouPage;
import util.DriverFactory;

public class ThankYouPageSteps extends DriverFactory {

    @Then("^she should be redirected to thanks for reaching out page$")
    public void she_should_be_redirected_to_thanks_for_reaching_out_page() throws Throwable {
        Assert.assertTrue(new ThankYouPage(driver).isThankYouButtonDisplayed());
    }

}
