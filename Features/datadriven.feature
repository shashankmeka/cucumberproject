Feature: Test Free CRM App

Scenario Outline: Test Multiple Data
Given user enter Free CRM url
When user enter "<username>" and "<password>"
Then user is on Homepage
And close App


Examples:
|username|password|
|shashankmeka023@gmail.com|Shashank@123|
|darade.kp143@gmail.com|Krushna@123|
|sayli.panhale@gmail.com|Menu88**|
|suraj.salve1996@gmail.com|Suraj@1996|
|gshnde95@gmail.com|Gaurav59|
|Kukdesmit1@gmail.com|Sum#78648|
