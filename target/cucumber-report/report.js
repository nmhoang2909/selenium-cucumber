$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/Google.feature");
formatter.feature({
  "name": "",
  "description": "  A demo Google feature",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open the Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleStep.userOpenTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Pass scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigate to \"https://www.google.com\" page",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleStep.userNavigateToPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that User is on correct Google Search page",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStep.verifyThatUserIsOnCorrectGoogleSearchPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open the Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleStep.userOpenTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Fail scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigate to \"https://gmail.com\" page",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleStep.userNavigateToPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that User is on correct Google Search page",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStep.verifyThatUserIsOnCorrectGoogleSearchPage()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cG[oogle]\u003e but was:\u003cG[mail]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat steps.GoogleStep.verifyThatUserIsOnCorrectGoogleSearchPage(GoogleStep.java:26)\r\n\tat ✽.Verify that User is on correct Google Search page(classpath:features/Google.feature:13)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});