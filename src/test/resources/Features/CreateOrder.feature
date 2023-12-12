@SecondFeature
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

    When  user enter client

    When user enter transaction type

    When user enter address

    When user enter product

    When user check supporting doc radio button

    When user click on continue button

    When user click on confirm button



#  Scenario: Move to submit report
#    Given user is on View appraisal
#    When user click on action button
#
#    When user select submit submit appraisal report
#
#    When user should be redirected to the SubmitAppraisal page
#
#    When user click on choose file button
#
#    When user click on submit report button
