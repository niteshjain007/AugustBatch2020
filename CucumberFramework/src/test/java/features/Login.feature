Feature: Login 
Scenario: Login verification for invalid input
#Given user is on login page
#When user specify invalid username and valid password 
#And user clicks on submit button
#Then error message should be displayed

Given user is on login page
When user specify below credential 
|nitesh.qa.learning@gmail.com|shlokogy@123	|
And user clicks on submit button
Then error message should be displayed



#Scenario: Login verification for valid credential
#Given user is on login page
#When user specify valid username "testology.qa.learning@gmail.com" and valid password as "Testology@123" 
#And user clicks on submit button
#Then user should see desk page

#Scenario Outline: Login verification for valid credential
#Given user is on login page
#When user specify valid username "<email>" and valid password as "<password>" 
#And user clicks on login button
#Then user should see desk page

#Examples:
#|email							|password		|
#|testology.qa.learning@gmail.com|Testology@123	|





