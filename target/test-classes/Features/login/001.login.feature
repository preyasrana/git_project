#Author
#Date
#Description
@feature
Feature: feature to login test functionality

  @smoketest
  Scenario: check login is successfully with valid credentails
    Given user is on Home Page
    When user click on Myaccount link
    Then user navigate to Register Page
    When user has enter "<emailid>" & "<password>"
    And click on login button
    Then user navigate to myaccount page
    
 @smoketest1
 Scenario: check home page on broken images & broken urls
    Given user is on Home Page
    Then Verify broken images
    Then Verify broken urls 
    
  @smoketest1
  Scenario: check login/register page on broken images & broken urls
    Given user is on Home Page
    When user click on Myaccount link
    Then user navigate to Register Page
    Then Verify broken images
    Then Verify broken urls     
    
     
    
    
    
    
    
    
    
  
      
      
      
