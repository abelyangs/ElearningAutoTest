@knowledge_login
Feature:

  Scenario Outline:
    Given Enter E-learning address "<url>"
    And   User enter the user name is "<username>"
    And   User enter the password is "<pwd>"
    And   User click the login button
    When  User click the knowledge menu btn
    And   Select the status value is "<status>"
    Then  Click the Search btn
    And   The table will populate the data for active type

  Examples:
    |url|username|pwd|status|
#    |http://192.168.88.128:8081/service/manage/loginPage|123456|admin|Active|
 #   |http://192.168.88.128:8081/service/manage/loginPage|123456|admin|Inactive|
    |http://192.168.88.128:8081/service/manage/loginPage|123456|admin|All|