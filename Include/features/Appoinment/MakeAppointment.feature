Feature: Make an Appointment in Cura healthcare 
Scenario Outline: User Should be able to Book an appointment in the Application

Given User logged into the system with valid credentials <userName> and <password>
When  User selects <facility>
And Selects healthcare <program>
And Select a <date> to the Appointment
And enter <comments> 
And Click on book Appointment button
Then Appointment Confirmation message should appear
And close the browser


Examples: 

|userName  |password                          |facility                       |program     |date      |comments |
| John Doe | g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM |Hongkong CURA Healthcare Center|Medicaid    |12/12/2023|Test     |
| John Doe | g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM |Tokyo CURA Healthcare Center   |Medicare    |12/11/2024|Test     |
| John Doe | g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM |Seoul CURA Healthcare Center   |None        |12/11/2023|Test     |


