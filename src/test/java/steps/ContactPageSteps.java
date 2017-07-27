package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.ContactPage;
import util.DriverFactory;

public class ContactPageSteps extends DriverFactory {

    @And ("^she verify the words exist ([^\"]*)$")
    public void she_verify_the_words_exist(String address) throws Throwable {
        new ContactPage(driver).she_verify_the_words_exist(address);
    }

    @And("^she provides the first name as ([^\"]*)$")
    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        new ContactPage(driver).she_provides_the_first_name_as(firstName);
    }

    @And("^she does not provide the first name ([^\"]*)$")
    public void she_does_not_provide_the_first_name_as(String firstName) throws Throwable {
        new ContactPage(driver).she_does_not_provide_the_first_name(firstName);
    }

    @And("^she provides the last name as ([^\"]*)$")
    public void she_provides_the_last_name_as(String lastName) throws Throwable {
        new ContactPage(driver).she_provides_the_last_name_as(lastName);
    }

    @And("^she provides the email as ([^\"]*)$")
    public void she_provides_the_email_as(String email) throws Throwable {
        new ContactPage(driver).she_provides_the_email_as(email);
    }

    @And("^she provides the phone number as ([^\"]*)$")
    public void she_provides_the_phoneNumber_as(String phoneNumber) throws Throwable {
        new ContactPage(driver).she_provides_the_phoneNumber_as(phoneNumber);
    }

    @And("^she selects the inquiry type as ([^\"]*)$")
    public void she_selects_the_inquiryType_as(String general) throws Throwable {
        new ContactPage(driver).she_selects_the_inquiryType_as(general);
    }

    @And("^she provides the company as ([^\"]*)$")
    public void she_provides_the_company_as(String company) throws Throwable {
        new ContactPage(driver).she_provides_the_company_as(company);
    }

    @And("^she provides the description as ([^\"]*)$")
    public void she_provides_the_description_as(String description) throws Throwable {
        new ContactPage(driver).she_provides_the_description_as(description);
    }

    @And("^she clicks submit button$")
    public void she_clicks_submit_button() throws Throwable {
        new ContactPage(driver).she_clicks_submit_button();
    }

    @And("^she checks if the element is displayed$")
    public void she_checks_if_the_element_is_displayed() throws Throwable {
        new ContactPage(driver).she_checks_if_the_element_is_displayed();
    }

    @Then("^she should be rejected to submit contact request$")
    public void she_should_be_rejected_to_submit_contact_request() throws Throwable {
        new ContactPage(driver).she_should_be_rejected_to_submit_contact_request();
    }

    @Then("^she validates the incorrect address is not present$")
    public void she_validates_the_incorrect_address_is_not_present() throws Throwable {
        new ContactPage(driver).she_validates_the_incorrect_address_is_not_present();
    }

}
