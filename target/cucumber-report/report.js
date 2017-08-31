$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Basic.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "This is a basic feature of this project",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3282081037,
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
  "duration": 458174816,
  "status": "passed"
});
formatter.match({
  "location": "BasicStep.userNavigateToGoogleSearchPage()"
});
formatter.result({
  "duration": 2190379699,
  "status": "passed"
});
formatter.match({
  "location": "BasicStep.verifyThatUserIsOnCorrectGoogleSearchPage()"
});
formatter.result({
  "duration": 21510231,
  "status": "passed"
});
formatter.after({
  "duration": 146006140,
  "status": "passed"
});
formatter.before({
  "duration": 1457885589,
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
  "duration": 54630,
  "status": "passed"
});
formatter.match({
  "location": "BasicStep.userNavigateToGmailPage()"
});
formatter.result({
  "duration": 2696423662,
  "status": "passed"
});
formatter.match({
  "location": "BasicStep.verifyThatUserIsOnCorrectGoogleSearchPage()"
});
formatter.result({
  "duration": 26838167,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cG[oogle]\u003e but was:\u003cG[mail]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat steps.BasicStep.verifyThatUserIsOnCorrectGoogleSearchPage(BasicStep.java:31)\n\tat ✽.Then Verify that User is on correct Google Search page(features/Basic.feature:12)\n",
  "status": "failed"
});
formatter.after({
  "duration": 1213157968,
  "status": "passed"
});
});