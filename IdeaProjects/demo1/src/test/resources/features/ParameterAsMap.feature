Feature: NopCommerce Successfully login in

  Scenario : Successfully login in NopCommerce
    Given user on login pages
    And user clicks on login buttons
    Then user enter "<username>" and "<password>"
      | username             | password    |
      | alikhan70p@gmail.com | alikhan0786 |
    And quit the browsers