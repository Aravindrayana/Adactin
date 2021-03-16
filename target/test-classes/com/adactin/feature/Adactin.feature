Feature: Hotel Booking In Adactin Application

Scenario: Login Functionality

Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click On The Login Button And Its Navigate To The Search Hotel Page 

Scenario: Search Hotel Functionality

When user Select The Location In Location Field
And user Select The Hotel In Hotel Field
And user Select The Room Type In Room Type Field
And user Select The NumberOfRoom In NumberOfRoom
And user Select CheckInDate In CheckInDate Field
And user Select CheckOutDate In CheckOutDate Field
And user Select AdultsInRoom In AdultsInRoom Field
And user Select ChildInRoom In ChildInRoom Field
Then user Click On SearchButton And It Navigate To Select A Hotel

Scenario: Select Hotel Functionality

When user Click On RadioButton In SelectHotel Field
Then user Click On ContinueButton And It Navigate To Book A Hotel

Scenario: Book A Hotel Functionality

When user Enter FirstName In FirstName Field
And user Enter LastName In LastName Field
And user Enter Address In Address Field
And user Enter CreditCardNumber In CreditCardNumber Field
And user Enter CreditCardType In CreditCardType Field
And user Enter CreditCardMonth In CreditCardMonth Field
And user Enter CreditCardYear In CreditCardYear Field
And user Enter CreditCardCCVNumber In CreditCardCCVNumber Field
Then user Click On BookNowButton And It Navigate To Booking Conformation

Scenario: Booking Conformation Functionality

When user Click On ItineraryButton And It Navigate To Itinary Booking

Scenario: Logout Functionality

When user Click On LogoutButton And It Navigate To HomePage

