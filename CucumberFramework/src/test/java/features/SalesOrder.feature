Feature: As a store user I want to create a sales order
@regressionTest
Scenario Outline: Verify the sales order creation 
Given user is on sales order page
When user clicks on New to create new order 
And user provides Customer as "<customer>"
And user provides itemCode as "<itemCode>"
And user provied quantity as 2
And user saves the order
Then system should display missing field popup for Delivery Date
Examples:
|customer	|itemCode		|
|Customer001|itemcode001	|
