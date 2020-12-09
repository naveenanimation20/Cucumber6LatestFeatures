Feature: Amazon Search

@Smoke
Scenario: Search a Product MacBook air
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Air" and price 200
Then Product with name "Apple MacBook Pro" should be displayed
Then Order id is 12345 and username is "Naveen"

@Regression
Scenario: Search a Product Iphone
Given I have a search field on Amazon Page
When I search for a product with name "Iphone" and price 1200
Then Product with name "Iphone" should be displayed
Then Order id is 5677 and username is "Naveen automation"