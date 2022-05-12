
@feature
Feature: feature to Filter by Price test functionality

 @smoketest1
 Scenario: Verify Shop link page redirection
     Given user is on Home Page
     When user click on Shop link
     Then user redirect on shop page verify page
     
 @smoketest1   
 Scenario: Verify Shop link page redirection
     Given user is on Home Page
     When user click on Shop link
     Then verify filter by price content
     Then Verify list product based on Filtration
     
 @smoketest
 Scenario: Verify Shop link page redirection
     Given user is on Home Page
     When user click on Shop link
     Then user click on slider price 
     
     
      
     
   
   
   
   





