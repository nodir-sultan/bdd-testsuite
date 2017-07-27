Feature:
  As a user
  I want to be able to navigate to contact page
  So that i can fill out contact form and submit request

  @Signup-DataDriven
  Scenario Outline: Positive test - Data driven user contact request submit
    Given the user is on landing page
    When she decides to contact
    And she verify the words exist <address>
    And she provides the first name as <firstName>
    And she provides the last name as <lastName>
    And she provides the email as <email>
    And she provides the phone number as <phoneNumber>
    And she selects the inquiry type as <general>
    And she provides the company as <company>
    And she provides the description as <description>
    And she clicks submit button
    Then she should be redirected to thanks for reaching out page
    Examples:
      | address | firstName | lastName | email | phoneNumber | general | company | description |
      | 7500 west sunrise boulevard / plantation / florida / 33322 | simplqenameA | simplelastA | abcderemailA@aq.com | 123-456-7890 | General | anycompanyA | anydescriptionA |

  @Signup-DataDriven
  Scenario Outline: Negative test - Data driven user contact request rejected
    Given the user is on landing page
    When she decides to contact
    And she verify the words exist <address>
    And she does not provide the first name <firstName>
    And she provides the last name as <lastName>
    And she provides the email as <email>
    And she provides the phone number as <phoneNumber>
    And she selects the inquiry type as <general>
    And she provides the company as <company>
    And she provides the description as <description>
    And she clicks submit button
    Then she should be rejected to submit contact request
    Examples:
      | address | firstName | lastName | email | phoneNumber | general | company | description |
      | 7500 west sunrise boulevard / plantation / florida / 33322 |  | simplelastA | abcderemailA@aq.com | 123-456-7890 | General | anycompanyA | anydescriptionA |

  Scenario: Negative test - validate the address does not equal “1800 Griffin Rd”
    Given the user is on landing page
    When she decides to contact
    And she checks if the element is displayed
    Then she validates the incorrect address is not present