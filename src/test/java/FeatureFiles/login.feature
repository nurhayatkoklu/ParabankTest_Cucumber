Feature:Login Functionality

  Scenario:Login process with valid information
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "gStone"
    And Fill in the Login Password input as "stone123456"
    When Click to Log in button
    Then Verify that you are logged in
    And Click to Log out button


  Scenario Outline:
    Given Navigate to Para Bank Website
    And Fill in the Login Username input as "<username>"
    And Fill in the Login Password input as "<password>"
    When Click to Log in button
    Then error message should be displayed

    Examples:
      | username | password    |
      | gStone   | stone123456 |
      | Tech     | Techno12    |
      | hhshaha  | 12345       |