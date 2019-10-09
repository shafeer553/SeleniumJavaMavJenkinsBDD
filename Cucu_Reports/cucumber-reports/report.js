$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/contactcreation.feature");
formatter.feature({
  "name": "Cloud for customer application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@gema_all_tests"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": "validate gema application user login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gema_login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user with a valid gema \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters username and password in the application",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on signin",
  "keyword": "When "
});
formatter.step({
  "name": "user login should be \"\u003cstatus\u003e\" and welcome displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "status"
      ]
    },
    {
      "cells": [
        "shafeer.shaik@ey.com",
        "Welcome@2",
        "Success"
      ]
    },
    {
      "cells": [
        "shafeer.shaik@ey.com",
        "Welcome@2",
        "Success"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validate gema application user login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gema_all_tests"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@gema_login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user with a valid gema \"shafeer.shaik@ey.com\" and \"Welcome@2\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CampaignCreation_POM_TestCase.user_with_a_valid_gema_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password in the application",
  "keyword": "When "
});
formatter.match({
  "location": "CampaignCreation_POM_TestCase.login_gema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin",
  "keyword": "When "
});
formatter.match({
  "location": "CampaignCreation_POM_TestCase.user_clicks_on_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login should be \"Success\" and welcome displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CampaignCreation_POM_TestCase.closeBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validate gema application user login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@gema_all_tests"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@gema_login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user with a valid gema \"shafeer.shaik@ey.com\" and \"Welcome@2\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CampaignCreation_POM_TestCase.user_with_a_valid_gema_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password in the application",
  "keyword": "When "
});
formatter.match({
  "location": "CampaignCreation_POM_TestCase.login_gema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin",
  "keyword": "When "
});
formatter.match({
  "location": "CampaignCreation_POM_TestCase.user_clicks_on_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login should be \"Success\" and welcome displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CampaignCreation_POM_TestCase.closeBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "create a camapign in GEMA",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@gema_all_tests"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@gema_camp_creation"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enters valid gema user name and password",
  "keyword": "Given "
});
formatter.match({
  "location": "GEMA_CampaignCreation_U_FrameWork.launchApplication1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill all the required gema campaign creation form",
  "keyword": "When "
});
formatter.match({
  "location": "GEMA_CampaignCreation_U_FrameWork.login_gema1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on create a campaign",
  "keyword": "And "
});
formatter.match({
  "location": "GEMA_CampaignCreation_U_FrameWork.clickNewCamp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new campaign created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "GEMA_CampaignCreation_U_FrameWork.new_campaign_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on logout",
  "keyword": "When "
});
formatter.match({
  "location": "GEMA_CampaignCreation_U_FrameWork.user_clicks_on_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be logged out from application",
  "keyword": "Then "
});
formatter.match({
  "location": "GEMA_CampaignCreation_U_FrameWork.user_should_be_logged_out_from_application()"
});
formatter.result({
  "status": "passed"
});
});