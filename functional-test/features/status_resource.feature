Feature: Functionally testing the status resource

Scenario: Should get 200
  When I make a request to '/status'
  Then response should be 200