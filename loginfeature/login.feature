Feature: keto user Access
Background: 
    Given User lands on landing page and click on take quiz

  @LoginKeto
  Scenario Outline: Keto User Acess
    Then user click on access on my plan
    When user navigated to login page user fills <username> and <password>
    Then user navigated to home dashboard and click on water update button

    Examples: 
      | username           | password            | status  |
      | xyz010@yopmail.com |     1234567         | success |
      | xyxx1@yopmail.com  |     0123454         | Fail    |
