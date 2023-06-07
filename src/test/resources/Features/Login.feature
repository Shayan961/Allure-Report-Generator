Feature: Login feature


  Scenario: Successful login

    Given I am on the login page

    When I enter valid username

    When I enter valid password

    When I click the login button

    Then I should be redirected to the dashboard


#  Scenario: Invalid Credentials
#
#    Given I am on the login page
#
#    When I enter an invalid username
#
#    When I enter valid password
#
#    When I click the login button
#
#    Then I should see an error message
