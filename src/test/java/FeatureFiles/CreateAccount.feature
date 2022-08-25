Feature: Create Account Functionality

  Scenario: Create an account with valid user information
    Given Navigate to luma
    When Click register link
    And Enter valid user information to register form and click create account button

    |firstname|erkan|
    |lastname|group6a|
    |email|erkan.group6a@techno.study|
    |password|A1B2C3D4e5|
    |passconfirm|A1B2C3D4e5|

    Then User should be registered successfully