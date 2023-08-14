#Author: iamvishnu124@gmail.com

#Feature: List of scenarios.
#Scenario: Displaying the age of the person

Feature: Checking the Age

  Scenario: How old are you

    Given open the browser
    When navigate to the link
    Then Load the Website in Chrome

    Given User enters the name in the Your name Test field
    When The Date of birth is Provided
    Then Click on submit button then name and age is displayed
