Feature: Login Successfully in CRM
  @RegressionTest
  Scenario Outline: Login Successfully in CRM
    Given user on login page
    When user gets title of the FREE CRM
    Then user register "<username>" and "<password>"
    And user clicks on login button
    Then user enter "<username1>" and "<password1>"
    And quit the browser


    Examples:
      | username             | password    | username1            | password1   |
      | alikhan30p0@gmail.com | alikhan0786 | alikhan30p0@gmail.com | alikhan0786 |
      | alikhan0p0@gmail.com  | alikhan0786 | alikhan0p0@gmail.com  | alikhan0786 |

