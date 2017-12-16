$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login.feature");
formatter.feature({
  "line": 2,
  "name": "login page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@navpg"
    }
  ]
});
formatter.before({
  "duration": 1224332331,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "login page",
  "description": "",
  "id": "login-page;login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the new user registration page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDef.I_am_on_the_home_page()"
});
formatter.result({
  "duration": 17536972454,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.I_click_on_the_login_button()"
});
formatter.result({
  "duration": 3303402971,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.the_new_user_registration_page_is_displayed()"
});
formatter.result({
  "duration": 65681925,
  "status": "passed"
});
});