Feature:Signin Functionality
  Scenario: Signin with valid username and password
    Given Navigate to luma
    When Click signin link
    And Enter valid user information to login form and click signin button
    Then User should be signin successfully