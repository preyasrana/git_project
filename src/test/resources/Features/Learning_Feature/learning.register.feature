#Author
#Date
#Description
@feature
Feature: Feature to Register test functionality

  @smoketest1
  Scenario: Check Register Functionality working or not with Valid Details
    Given user is on Home Page
    Then firstname lastname gets placeholder name then verify
    When user enter firstname
      | preyas |
    When user enter lastname
      | rana |
    When user enter address
      | testing message by me |
    When user hover on Emailid
    When user enter emailid
      | testuser@gmail.com |
    When user enter phone
      | +9123409890 |
    When user upload photo
    When user click on gender
    When user click on Hobbies
    When user click on Languages
    Then Verify Selected languages
    When user click on Skill
    When user select dateofbirth

  @smoketest
  Scenario: Check Register Functionality working or not with Valid Details
    Given user is on Home Page
    When user click on submit
    When get Validation messages
     
