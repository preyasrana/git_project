#Author
#Date
#Description
@feature
Feature: Feature to Learning_Automation test functionality

  @smoketest1
  Scenario: Check Switchto Functionality working or not
    Given user is on Home Page
    When user click on windowlink
    Then verify open new tab window by default selected
    When user click on new seperate window

  @smoketest1
  Scenario: Check Accordian Functionality working or not
    Given user is on Home Page
    When user click on Accordianlink
    Then bydefault first accordian open display
    Then verify accordian related text

  @smoketest1
  Scenario: Check Datepicker Functionality working or not
    Given user is on Home Page
    When user click on Datepickerlink
    When user click on Datepicker icon
    Then Datepicker should be visible

  @smoketest
  Scenario: Check Resizable Functionality working or not
    Given user is on Home Page
    When user click on resizablelink
    When user resize object
    
