Feature: Cura healthcare app Login feature 
Scenario Outline: User Should be able to Login to the system using valid credentials

Given User navigated to the Cura Healthcare system using URL
When User clicks on Make appointment button
Then User should navigiates to Login Page
When User enters valid <userName> and <password>
And User clicks on Login button
Then User should be navigated to the Appointment Homepage

Examples: 

|userName  |password            |
| John Doe | g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM |

