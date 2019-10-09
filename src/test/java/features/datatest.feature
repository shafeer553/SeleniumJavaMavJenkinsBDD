#Author: Shafeer.Shaik@ey.com
#Keywords Summary : to test data fecthing from JSON file
#Feature: to test data fecthing from JSON file
#Scenario: Fetch data from JSON file and drive test
#Given: No PreCondition
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@datajson
Feature: Fecth data from JSON file
  

  @datajson
  Scenario: fetch data from Json file
    Given I want to automate flows with json data firstName and lastName
    	|firstName|lastName|
    	|shafeer|shaik|
    	    
    And enjoy the automation
    When I automate the flow
    Then I print json data
  
  