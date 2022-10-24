Feature: Register Functionality

  Scenario:Register Create
    Given Navigate to Para Bank Website
    And Click to Register Menu button
    And Fill in the First Name input as "George"
    And Fill in the Last Name input as "Stone"
    And Fill in the Address input as "USA"
    And Fill in the City input as "Newyork"
    And Fill in the State input as "Newyork"
    And Fill in the Zip Code input as "1024"
    And Fill in the Phone input as "12546396"
    And Fill in the SSN input as "1234"
    And Fill in the Username input as "gStone"
    And Fill in the Password input as "stone123456"
    And Fill in the Confirm input as "stone123456"
    When Click to Register button
    Then Successfully message should be displayed
