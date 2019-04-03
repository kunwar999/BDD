Feature: Bdd Frame 
	This feature describes Bdd frame and its action

		Scenario: Click of proceed button should show welcome message 
			Given BddFrame is open 
			When proceed button is clicked 
			Then it should open login window which will have input fields like username and password
			
		Scenario: Click of proceed button should show welcome message 
			Given BddFrame is open 
			Given proceed button is clicked 
			Given Login panel is visible
			Given User enters username admin and password admin
			When user clicks on login button
			Then on successful login it should change main label to welcome message
			
		Scenario: Click of proceed button should show welcome message 
			Given BddFrame is open 
			Given proceed button is clicked 
			Given Login panel is visible
			Given User enters username test and password test
			When user clicks on login button
			Then on unsuccessful login it reset login panel fields
			
