Feature: To validate the login functionality
Scenario: To validate the login functionality with invalid crendentials
Given The user has to be in facebook login page
When The user has to fill username and password
And The user should click login button
Then The user navigate to invalid login page