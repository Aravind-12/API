Feature: Application Login

Scenario: Home page default login
Given User is on Netbanking lading page
When User login into Application with "Spoo" and Password "4321"
Then Home is papulated 
And cards displayed are "true"


Scenario: Home page default login
Given User is on Netbanking lading page
When User login into Application with "aravind" and Password "1234"
Then Home is papulated 
And cards displayed are "false" 