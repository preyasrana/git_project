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

  @smoketest1
  Scenario: Check Resizable Functionality working or not
    Given user is on Home Page
    When user click on resizablelink
    When user resize object

  @smoketest1
  Scenario: Check Selectable Functionality working or not
    Given user is on Home Page
    When user click on Selectablelink
    When user click on Serialize option
    When verify list of serialized value
    When user click on Default Functionality option

  @smoketest1
  Scenario: Check dragdrop Functionality working or not
    Given user is on Home Page
    When user click on dragdropstaticlink
    Then user dragdrop object
    Then Verify object display or not

  @smoketest1
  Scenario: Check Youtube Functionality working or not
    Given user is on Home Page
    When user click on youtubelink
    Then user has start video

  @smoketest1
  Scenario: Check Filedownload functionality working or not
    Given user is on Home Page
    When user click on filedownloadlink
    Then verify Download button should be display & clickable
    Then Verify Filedownloaded or not

  @smoketest1
  Scenario: Check loader functionality working or not
     Given user is on Home Page
     When user click on loaderlink
     When user click on run button
     Then loader please wait display or not & verify popup
     
  @smoketest1
  Scenario: Check progressbar functionality working or not
     Given user is on Home Page
     When user click on progressbarlink 
     Then Verify file related progressbar
     
  @smoketest1
  Scenario: Check progressbar-text functionality working or not
     Given user is on Home Page
     When user click on downloadprogressbarlink 
     Then Verify progressbar for filedownload
     
  @smoketest1
  Scenario: Check ckeditor functionality working or not
     Given user is on Home Page
     When user click on ckeditorlink
     Then user has entered any details in ckeditor 
     |Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.|
     
            
     
