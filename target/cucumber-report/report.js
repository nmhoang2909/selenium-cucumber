$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Basic.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "This is a basic feature of this project",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3056210455,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "First scenario",
  "description": "",
  "id": ";first-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User open the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User navigate to Google Search page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Verify that User is on correct Google Search page",
  "keyword": "Then "
});
formatter.match({
  "location": "BasicStep.userOpenTheBrowser()"
});
formatter.result({
  "duration": 305004959,
  "status": "passed"
});
formatter.match({
  "location": "BasicStep.userNavigateToGoogleSearchPage()"
});
formatter.result({
  "duration": 2413022198,
  "status": "passed"
});
formatter.match({
  "location": "BasicStep.verifyThatUserIsOnCorrectGoogleSearchPage()"
});
formatter.result({
  "duration": 14702530,
  "status": "passed"
});
formatter.after({
  "duration": 150391835,
  "status": "passed"
});
formatter.before({
  "duration": 1193908881,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Second scenario",
  "description": "",
  "id": ";second-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User open the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User navigate to Gmail page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Verify that User is on correct Google Search page",
  "keyword": "Then "
});
formatter.match({
  "location": "BasicStep.userOpenTheBrowser()"
});
formatter.result({
  "duration": 55667,
  "status": "passed"
});
formatter.match({
  "location": "BasicStep.userNavigateToGmailPage()"
});
formatter.result({
  "duration": 2314128003,
  "status": "passed"
});
formatter.match({
  "location": "BasicStep.verifyThatUserIsOnCorrectGoogleSearchPage()"
});
formatter.result({
  "duration": 14077265,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cG[oogle]\u003e but was:\u003cG[mail]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat steps.BasicStep.verifyThatUserIsOnCorrectGoogleSearchPage(BasicStep.java:31)\n\tat ✽.Then Verify that User is on correct Google Search page(features/Basic.feature:12)\n",
  "status": "failed"
});
formatter.after({
  "duration": 860276082,
  "status": "passed"
});
});