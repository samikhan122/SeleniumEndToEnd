Feature: sign in to FreeCRM PRO

  Scenario: login to CRM pro
    Given launch URL
    When page is loaded get the title
    Then enter the "username" and "password"
      | username    | password  |
      | samikhan123 | Davita08! |
    And click on login Button
    Then Quit the browser