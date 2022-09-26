Feature: Login functionality

Scenario: Check with valid credentials

Given users luanch chrome browser
When users opens url "https://www.saucedemo.com/"
Then users enters username as "problem_user" and password as "secret_sauce"
And user clicks on login button
When page title shoud be "Swag Labs"
When user click on react button
And user click on logout
And user close browser