#Author: sd.engineer@gmail.com
## (Comments)
#Test Case:
#Open Home page
#Click Sign-in button
#Fill Email address to create an account
#Click Create an account
#Fill all fields with correct data
#Click Register button

Feature: Registering new account

  @Start
  Scenario: Open the Home Page
    Given I open the Home Page 
    When I locate the sign in button
    Then I click it and I reach the registering page

  @Authentication
  Scenario: Create An Account
    Given I am in the authentication page
    When I fill the email address to create an account with an unique email
    Then I get the create an account form

  @Submit
  Scenario: Registering An Account
    Given I fill the fields with correct data
    When I click the register button
    Then my account is created
