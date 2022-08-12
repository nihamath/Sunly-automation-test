
Feature: Test the login functionality

  Scenario: Verify the login functionality with valid credentials
    Given Admin launch the application
    And Enter the valid login credentials
    When Admin click on the login button
    Then Admin gets a toast message "User login success."
    And Admin redirected to the dashboard page
    
    
    Scenario: Verify the login functionality with invalid credentials
    Given Admin launch the application
    And Enter the invalid login credentials
    When Admin click on the login button
    Then Admin gets a toast message "Incorrect email or password."
    
     Scenario: Verify the login functionality with a valid user app credentials
    Given Admin launch the application
    And Enter the valid user app login credentials
    When Admin click on the login button
    Then Admin gets a toast message "Incorrect email or passwoord."
    
       
     Scenario: Verify the logout functionality 
    Given Admin launch the application
    And Enter the valid login credentials
    When Admin click on the login button
    Then Admin gets a toast message "User login success."
    And Admin redirected to the dashboard page
    When Admin click on the username in the dashboard
    And Click on the logout button
    Then Admin gets a toast message "You have been logged out successfully."
   
