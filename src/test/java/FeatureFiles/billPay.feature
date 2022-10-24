Feature: Bill Pay Functionality

  Background:
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "gStone"
    And Fill in the Login Password input as "stone123456"
    When Click to Log in button

  Scenario Outline: Bill Payment Process
    And Click to Bill Pay button
    And Fill in the Payee Name input as "<payeeName>"
    And Fill in the Bill Address input as "<address>"
    And Fill in the Bill City input as "<city>"
    And Fill in the Bill State input as "<state>"
    And Fill in the Bill Zip Code input as "<zipcode>"
    And Fill in the Bill Phone input as "<phone>"
    And Fill in the Account input as "<account>"
    And Fill in the Verify Account input as "<verifyAccount>"
    And Fill in the Amount input as "<amount>"
    When Click to Send Payement button
    Then Bill Payment Complete message should be displayed
    And Click to Log out button

    Examples:
      | payeeName | address        | city      | state | zipcode | phone      | account | verifyAccount | amount |
      | Electric  | Greenfly Blvd. | London    | UK    | 1425    | 5328759663 | 123456  | 123456        | 85     |
      | Water     | Dayton City    | Ohio      | US    | 2563    | 5328759661 | 74123   | 74123         | 42     |
      | Telephone | Sunset Blvd.   | Hollywood | US    | 9685    | 5328759664 | 14563   | 14563         | 23     |