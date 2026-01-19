Feature: Login functionality

Scenario: Login with valid credentials
Given User1 navigates to Login page
When User1 enters valid email address into email field
And User1 enters valid password into password field
And User1 clicks on Login button
Then User1 should get successfully logged in
