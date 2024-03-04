Feature: Test Travel agency
@SmokeTest
  Scenario: Test travel and confirm
    Given Visit the URl
      | https://blazedemo.com/index.php |
    When select the departure city and destination city
    Then Chose the respective flight
    And enter in the card details
      | John | 24949 Katy ranch rd | Katy | Texas | 77494 | 159465983652968 | 12 | 2028 | John Smith |
    Then assert the title for the confirmation page
    And capture the id and display on the console
    When Click back to homepage