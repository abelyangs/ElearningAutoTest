@base_flow
Feature: This is a simple test using Cucumber.

  Scenario Outline:
    Given I enter my blog address "<url>" and go to Home page
    When  I click the search button
    And   I enter "<field>" in the input field
    And   I click the first result of search
    Then  I go to the article page with title containing "<keyword>"

  Examples:
    |url|field|keyword|
    |http://yaowenjie.github.io|PowerShell|PowerShell|