#Author
#Date
#Description
@MyAccount_Address_feature
Feature: feature to My account Page on Address(billing/shipping) functionality

  @smoketest
  Scenario: Verify My account page for billing address functionality
    Given user is on Home Page
    When user click on Myaccount link
    Then user navigate to Register Page
    When user has enter "<emailid>" & "<password>"
    And click on login button
    Then user navigate to myaccount page
    And click on Address link
    
  @smoketest
  Scenario: Verify billing & Shipping address Edit(navigation) click functionality
     Given user is on Home Page
     When user click on Myaccount link
     Then user navigate to Register Page
     When user has enter "<emailid>" & "<password>"
     And click on login button
     Then user navigate to myaccount page
     And click on Address link
     And click on billing edit link
     Then user click on browser back button
     And user click on shipping edit link
     And click on Address link
     
  @smoketest
  Scenario: Verify billing address on by default country functionality
     Given user is on Home Page
     When user click on Myaccount link
     Then user navigate to Register Page
     When user has enter "<emailid>" & "<password>"
     And click on login button
     Then user navigate to myaccount page
     And click on Address link
     And click on billing edit link  
     Then by default country show as India
     
  @smoketest
  Scenario Outline: Verify country dropdown functionality
     Given user is on Home Page
     When user click on Myaccount link
     Then user navigate to Register Page
     When user has enter "<emailid>" & "<password>"
     And click on login button
     Then user navigate to myaccount page
     And click on Address link
     And click on billing edit link  
     Then click on country dropdown
     And user enter <countryname> in country searchpanel Verify fetch country list
     
     
     Examples:
     |countryname|
     |j|
     
     
    
       
 
    
     
    
    
    
    
    
    
    
  
      
      
      
