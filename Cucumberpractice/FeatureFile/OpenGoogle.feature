Feature: This is to test google search
Scenario: Google search scenario
	Given user is entering Google.co.in
	When user is typing the search term "DD"
	And enters the return key
	Then the user should see the search results 