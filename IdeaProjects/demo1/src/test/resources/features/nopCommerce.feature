Feature: Login SucessFully into NOPCommerce123

  Scenario: success login into NopCommerce123
    Given user will be on loginPage
    When title will be diplayed from the UI to Console
      Then user registers userName and Password
#    And user clicks on login button to save
#    Then user enter email and password
   And after success will close the browser