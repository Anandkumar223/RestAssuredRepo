#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
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
#""git hub token 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
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verify users
  I want to use this template for my feature file

  Scenario: Verify the list of users
    Given send a get request to get the list of users
    And Verify the list of users

