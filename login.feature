  ## Feature file 
  ## login
  Feature: Login functionality
  Scenario Outline: Successfull login
    Given User login is on the login 
    When  User enters "<username>"  and "<password>"
    Then  User should see the welcome message 

    Examples: 
      | username | password |
      | testuser | testpass |
      | user2    | pass2    |
      
