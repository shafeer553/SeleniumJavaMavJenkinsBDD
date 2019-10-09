@gema_all_tests @regression @smoke
Feature: Cloud for customer application

  @gema_login @smoke
  Scenario Outline: validate gema application user login
    Given user with a valid gema "<username>" and "<password>"
    When user enters username and password in the application
    When user clicks on signin
    Then user login should be "<status>" and welcome displayed

    Examples: 
      | username             | password  | status  |
      | shafeer.shaik@ey.com | Welcome@2 | Success |
      | shafeer.shaik@ey.com | Welcome@2 | Success |

  @gema_camp_creation @smoke
  Scenario: create a camapign in GEMA
    Given user enters valid gema user name and password
    When fill all the required gema campaign creation form
    And click on create a campaign
    Then new campaign created successfully
    When user clicks on logout
    Then user should be logged out from application
