Feature: Convert Number To String 
		This feature describes steps to convert given number to words

			Scenario: Convert Single Digit Number to Words 
				Given A Single Digit Number 
				When conversion API called 
				Then it should return that number in words 
				
			Scenario: Convert Double Digit Number to Words 
				Given A Double Digit Number 
				When conversion API called 
				Then it should return that number in words 
				
			Scenario: Convert Double Digit Number from teens to Words 
				Given A Double Digit Number from teens 
				When conversion API called 
				Then it should return that number in words 
				
			Scenario: Convert Triple Digit Number to Words 
				Given A Triple Digit Number 
				When conversion API called 
				Then it should return that number in words 
				
			Scenario: Convert long Number to Words 
				Given A long Number 
				When conversion API called 
				Then it should return that number in words 
				
			Scenario: Convert Given Single Digit Number to Words 
				Given A Single Digit Number is 5 
				When conversion API called 
				Then it should return that number in words as five 
				
			Scenario: Convert Given Double Digit Number to Words 
				Given A Double Digit Number is 67 
				When conversion API called 
				Then it should return that number in words as sixty seven 
				
			Scenario: Convert Given Double Digit Number from teens to Words 
				Given A Double Digit Number from teens is 14 
				When conversion API called 
				Then it should return that number in words as fourteen 
				
			Scenario: Convert Given Triple Digit Number to Words 
				Given A Triple Digit Number is 999 
				When conversion API called 
				Then it should return that number in words as nine hundred and ninety nine 
				
			Scenario: Convert Given long Number to Words 
				Given A long Number is 234567896 
				When conversion API called 
				Then it should return that number in words as twenty three crore forty five lakh sixty seven thousand eight hundred and ninety six