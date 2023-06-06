Feature: Create Order


  Background:
    Given I am on the login page

    When I enter valid username

    When I enter valid password

    When I click the login button

    Then I should be redirected to the dashboard


  Scenario: Move to Create Order Page
    Given I am on create order dropdown

    When  I select appraisal option

    Then  I should be redirected to the create order page


  Scenario:  Create New Order
    Given I A hello worldfgfg