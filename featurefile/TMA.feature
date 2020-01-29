Feature: Register
@register
Scenario: Register on TestMe App
Given user open TestMeApp
When user click signup
And enter username as "PriyaS5432"
And enter first name as "Priya"
And enter last name as "Sonkar"
And enter password as "Priya1297"
And enter confirm password as "Priya1297"
And enter gender as "Female"
And enter e-mail as "Priya12497@rediff.com"
And enter mobile number as "8855667799"
And enter dob as "04/12/1997"
And enter Address as "Hinjewadi Pune"
And enter security question as "What is your Birth Place?"
And enter answer as "Bhilai"
Then user registered successfully

@login
Scenario: Login using datatable 
	Given user open TestMeApp 
	When user click signin 
	And user enter credentials as 
		|lalitha|
		|Password123|
