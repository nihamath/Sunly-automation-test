
Feature: Test the User listing functionality


  Scenario: Verify whether all the user names are displayed in the users list
    Given Admin launch the application
    And Enter the valid login credentials
    When Admin click on the login button
    Then Admin gets a toast message "User login success."
    And Admin redirected to the dashboard page
    When Admin click on the User List sub menu under the User menu
    Then Admin should redirected to the user listing page
    
      Scenario: Verify whether the total number of rows per page is 10 by default
    Given Admin launch the application
    And Enter the valid login credentials
    When Admin click on the login button
    Then Admin gets a toast message "User login success."
    And Admin redirected to the dashboard page
    When Admin click on the User List sub menu under the User menu
    Then Admin should redirected to the user listing page
    And Observe that 10 records are dispalyed by default
    
     Scenario: Verify whether the search functionality is working fine
    Given Admin launch the application
    And Enter the valid login credentials
    When Admin click on the login button
    Then Admin gets a toast message "User login success."
    And Admin redirected to the dashboard page
    When Admin click on the User List sub menu under the User menu
    Then Admin should redirected to the user listing page
    And Enter the search value as "nihamathulla@qburst.com"
    Then Search by email result will be displayed successfully
    
    
     Scenario: Verify whether the filter functionality is working fine
    Given Admin launch the application
    And Enter the valid login credentials
    When Admin click on the login button
    Then Admin gets a toast message "User login success."
    And Admin redirected to the dashboard page
    When Admin click on the User List sub menu under the User menu
    Then Admin should redirected to the user listing page
    And Enter the search value as "nihamathulla@qburst.com"
    Then Search by email result will be displayed successfully
    

 
