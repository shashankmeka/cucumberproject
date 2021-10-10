@Pune
Feature: Test free CRM App
	Given user enter valid data
	
	@Sanitytesting
	Scenario: Sanity testing
	Given user is on contactPage
	
	@Regrassiontesting
	Scenario: Regrassion testing
	Given user is on DealsPage
	
	@EndtoEndtesting
	Scenario: End testing
	Given user is on conpaniesPage
	
