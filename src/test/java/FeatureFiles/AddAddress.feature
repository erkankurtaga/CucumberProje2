Feature: Add Address Functionality
  Background:
    Given Navigate to luma
    When Click signin link
    And Enter valid user information to login form and click signin button
    Then User should be signin successfully

  Scenario Outline:
     And User should be navigate to My Account page
     And User should be click to Manage Address link
     And User should be enter address information
     |phone|<phone>|
     |address1|<address1>|
     |address2|<address2>|
     |address3|<address3>|
     |country-select|<country>|
     |city|<city>|
     |zipcode|<zipcode>|

    And User should be save the adress successfully

    Examples:
    | phone | address1 | address2 | address3 |  city  | country | zipcode |
    |1234567890 | adres1   | adres2   | adres3   | Bursa  | Turkey  | 123456  |
    |2345678901 | adres4   | adres5   | adres6   | Bursa  | Turkey  | 123456  |
    |3456789012 | adres7   | adres8   | adres9   | Bursa  | Turkey  | 123456  |
