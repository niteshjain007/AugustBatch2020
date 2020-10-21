Feature: demo 
#Background:
#Given browser is opened

@smokeTest
Scenario: demo for test data and tags in smoke
Given there are 12 bananas
When rohan ate 4 bananas
Then total number of bananas remaining should be 8

@regressionTest
Scenario: demo for test data and tags in regression
Given there are below fruits with each of 10 count
|orange|banana|papaya|
When rohan ate 4 of each fruit
Then print remaining fruits count

@sanityTest
Scenario: demo for test data and tags in regression
Given there are below fruits with each of 12 count
|chery|pineapple|papaya|
When rohan ate 7 of each fruit
Then print remaining fruits count

@regressionTest
Scenario: demo for test data and tags in regression
Given there are below fruits with each of 12 count
|chery|pineapple|papaya|
When ram ate 7 of each fruit
Then print remaining fruits count




