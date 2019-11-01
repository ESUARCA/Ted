#Author: esuarca@gmail.com

@tag
Feature: Buy ticket at Vivacolombia
  As a vivacolombia user 
  I want to buy a ticket
  to travel to Peru
  
  @tag1
  Scenario: User buys ticket to travel to Peru
    Given I am on the page of vivacolombia
    When I buy a ticket to canocristales
    Then To travel this weekend
