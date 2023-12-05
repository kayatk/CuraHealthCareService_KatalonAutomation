Feature: Menu Bar Navigation
Scenario Outline: User should be navigate to Login and Home Page through Menu bar

Given User navigated to the Cura Healthcare system using URL
When User clicks on Side Menu
And Click on the <Option>
Then User should navigate to respective page <Option>
And close the browser

Examples:
|Option|
|Login |
|Home  |