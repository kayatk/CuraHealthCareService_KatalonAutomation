Feature: Cura healthcare app Login feature 
Scenario Outline: User Should be able to Login to the system using valid credentials

Given User navigated to the Cura Healthcare system using URL
When User clicks on Make appointment button
Then User should navigiates to Login Page
When User enters <userName> and <password>
And User clicks on Login button
Then User should be navigated to the Appointment Homepage

Examples: 

|userName  |password            |
| John Doe | g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM |



Scenario Outline: User should not be able to Login to the system using Invalid credentials

Given User navigated to the Cura Healthcare system using URL
When User clicks on Make appointment button
Then User should navigiates to Login Page
When User enters <userName> and <password>
And User clicks on Login button
Then Error message should appear 

Examples: 

|userName  |password            |
| John Doe | RyzK/uu8Q1+7/zuOsKmZ+g== |