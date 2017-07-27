package steps;

import cucumber.api.java.en.And;
import pages.ContactPage;
import util.DriverFactory;

import java.util.List;

//TO DO refactor data driven pattern
public class ContactSteps extends DriverFactory{

    @And("^she provides the her details as follows:$")
    public void she_provides_the_her_details_as_follows(List<ContactDetails> contacts) throws Throwable {
        ContactDetails ContactToSumbitUp = contacts.get(0);

        new ContactPage(driver).she_provides_the_first_name_as(ContactToSumbitUp.firstName);
        new ContactPage(driver).she_provides_the_last_name_as(ContactToSumbitUp.lastName);
        new ContactPage(driver).she_provides_the_email_as(ContactToSumbitUp.email);
        new ContactPage(driver).she_provides_the_phoneNumber_as(ContactToSumbitUp.phoneNumber);
        new ContactPage(driver).she_selects_the_inquiryType_as(ContactToSumbitUp.inquiryType);
        new ContactPage(driver).she_provides_the_company_as(ContactToSumbitUp.company);
        new ContactPage(driver).she_provides_the_description_as(ContactToSumbitUp.description);
    }

    private class ContactDetails {
        public String firstName;
        public String lastName;
        public String email;
        public String phoneNumber;
        public String inquiryType;
        public String company;
        public String description;
    }

}
