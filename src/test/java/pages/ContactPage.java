package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;

public class ContactPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='contact']/div[4]/div[1]/div/div[1]/h1") //(css = ".ng-binding");
    private WebElement addressTextBox;

    @FindBy(xpath = ".//*[@id='firstname']") // (css = "#firstname");
    private WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='lastname']")  //(css = "#lastname");
    private WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@id='email']") //(css = "#email");
    private WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='phone']") //(css = "#phone");
    private WebElement phoneNumberTextBox;

    @FindBy(xpath = "//*[@id='inquiry_type']/option[@value='General']")  //(css = "#inquiry_type"); OR select[@id='inquiry_type'
    private WebElement inquiryTypeDropDown;

    @FindBy(xpath = "//input[@id='company']")  //(css = "#company");
    private WebElement companyTextBox;

    @FindBy(xpath = "//textarea[@id='message']")  //(css = "#message");
    private WebElement descriptionTextBox;

    @FindBy(xpath = "//button[@type='submit']")  //(css = ".pure-button.pure-button-primary");
    private WebElement submitButton;

    @FindBy(xpath = ".//*[@id='firstname-error']")  //(css = "#firstname-error");
    private WebElement firstNameError;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void she_verify_the_words_exist(String address) throws Throwable {
        assert addressTextBox.isDisplayed();
        assertEquals("Verification that the words “7500 west sunrise boulevard” exist failed", address,
                addressTextBox.getText());
        //"7500 west sunrise boulevard / plantation / florida / 33322",
        // driver.findElement(By.xpath(".//*[@id='contact']/div[4]/div[1]/div/div[1]/h1")).isDisplayed());
        System.out.println("address = " + addressTextBox.isDisplayed());
    }

    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        firstNameTextBox.clear();
        firstNameTextBox.sendKeys(firstName);
    }

    public void she_does_not_provide_the_first_name(String firstName) throws Throwable {
        firstNameTextBox.clear();
        firstNameTextBox.sendKeys(firstName);
    }

    public void she_provides_the_last_name_as(String lastName) throws Throwable {
        lastNameTextBox.clear();
        lastNameTextBox.sendKeys(lastName);
    }

    public void she_provides_the_email_as(String email) throws Throwable {
        emailTextBox.clear();
        emailTextBox.sendKeys(email);
    }

    public void she_provides_the_phoneNumber_as(String phoneNumber) throws Throwable {
        phoneNumberTextBox.clear();
        phoneNumberTextBox.sendKeys(phoneNumber);
    }

    public void she_selects_the_inquiryType_as(String general) throws Throwable {
        inquiryTypeDropDown.click();
        /*
        * new Select(driver.findElement(By.xpath("//select[@id='inquiry_type']"))).selectByVisibleText("General");
        * By.xpath(".//*[@id='inquiry_type']/option[@value='General']"))
        * By.xpath(".//*[@id='inquiry_type']/option[@value='Education']"))
        * By.xpath(".//*[@id='inquiry_type']/option[@value='Public Relations']"))
        * By.xpath(".//*[@id='inquiry_type']/option[@value='Partnership']"))
        * */
    }

    public void she_provides_the_company_as(String company) throws Throwable {
        companyTextBox.clear();
        companyTextBox.sendKeys(company);
    }

    public void she_provides_the_description_as(String description) throws Throwable {
        descriptionTextBox.clear();
        descriptionTextBox.sendKeys(description);
    }

    public void she_clicks_submit_button() throws Throwable {
        submitButton.click();
    }

    public void she_should_be_rejected_to_submit_contact_request() throws Throwable {
        firstNameError.isSelected();
        firstNameError.isDisplayed();
    }

    public void she_checks_if_the_element_is_displayed() throws Throwable {
        addressTextBox.isDisplayed();
        System.out.println(" address = " + addressTextBox.getText());
        System.out.println(" address = " + addressTextBox.isDisplayed());
    }

    public void she_validates_the_incorrect_address_is_not_present() throws Throwable {
        String wrongAddress = "1800 Griffin Rd";
        assertNotSame("1800 Griffin Rd is present", wrongAddress, addressTextBox.getText());
        System.out.println("Validated that incorrect address -" + wrongAddress + "- is not present");
    }

}