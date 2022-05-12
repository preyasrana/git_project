#Author
#Date
#Description
@MyAccount_AccountDetail_feature
Feature: feature to My account Page on Account Details functionality

  @regression
  Scenario: Verify My account page for click on Account details link 
    Given user is on Home Page
    When user click on Myaccount link
    Then user navigate to Register Page
    When user has enter "<emailid>" & "<password>"
    And click on login button
    Then user navigate to myaccount page
    And click on Accountdetail link
    
  @smoketest
  Scenario Outline: Update my account page related info
    Given user is on Home Page
    When user click on Myaccount link
    Then user navigate to Register Page   
    When user has enter "<emailid>" & "<password>"
    And click on login button
    Then user navigate to myaccount page
    And click on Accountdetail link
    When user has entered profiledata "<firstname>" & "<lastname>"
    And click on savechanges button
    	
    Examples:		
    | firstname | lastname |
    | Preyas | Rana |
 
    
     
    
    
    
    
    
    
    
  
      
      
      
