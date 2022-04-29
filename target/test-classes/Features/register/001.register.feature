#Author
#Date
#Description
@feature
Feature: Feature to Register test functionality

  @smoketest1
  Scenario: Check Register Functionality working or not with Valid Details
    Given user is on Home Page
    When user click on Myaccount link
    Then user navigate to Register Page
    When user entered "<Email_address>" & "<Password>"
    And click on Register button
    Then user navigate to myaccount page
    Then Verify broken images
    Then Verify broken urls

    
    
    
    
    
    
    
    
  

  
      
      
      
