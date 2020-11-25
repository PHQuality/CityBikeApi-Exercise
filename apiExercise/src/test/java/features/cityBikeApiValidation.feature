Feature: Validating the city bike api

Scenario Outline: As a user I want to verify that that give city is in given country and return their corresponded latitude and longitude

	Given user calls cityBike api get request succefully
	When the API call got success with status code 200
	Then user can veify "<city>" is in "<country>" and user can view latitude and longitude
	
	Examples:
	|TestCase 	   |  city       |  country		|
	|Testcase01    |  Paris      |  FR          |
	|Testcase02    |  Moscow     |  RU          |
	
	
	
	
	

