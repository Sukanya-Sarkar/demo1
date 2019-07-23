$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/tagDemo.Feature");
formatter.feature({
  "name": "ECommerce Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "name": "Buy a product with cash payment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Buy a product with CC payment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "name": "This is a blank test",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});