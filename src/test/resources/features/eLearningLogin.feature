@EL_login_logout
Feature: Used to verify login and logout of E-learning system
  @EL_login
  Scenario Outline: Login E-learning system
    Given Enter E-learning address "<url>"
    And   User enter the user name is "<username>"
    And   User enter the password is "<pwd>"
    When  User click the login button
    Then  The user login status is "<status>"

  Examples: Login E-learning system
    |url|username|pwd|status|
    |http://192.168.88.128:8081/service/manage/loginPage|123456|admin|successfully|
    |http://192.168.88.128:8081/service/manage/loginPage|123456|adminTest|failed|

  @EL_logout
  Scenario: Successful logout E-learning system
    Given User have successfully entered home interface
    When  User click the logout button of the Upper right corner
    Then  System will successfully exit to login page