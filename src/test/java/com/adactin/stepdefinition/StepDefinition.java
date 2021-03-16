package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.adactin.runner.Runner;
import com.autobaseclass.BaseClass;

import adactin.pom.Book_a_Hotel;
import adactin.pom.Booking_conformation;
import adactin.pom.Itinary_logout;
import adactin.pom.Login;
import adactin.pom.Search_Hotel;
import adactin.pom.Select_Hotel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	
	public static WebDriver driver = Runner.driver;
	
	
	
	
	 
	Login l = new Login(driver);
	Search_Hotel sh = new Search_Hotel(driver);
	Select_Hotel selh = new Select_Hotel(driver);
	Book_a_Hotel bh = new Book_a_Hotel(driver);
	Booking_conformation bc = new Booking_conformation(driver);
	Itinary_logout logout = new Itinary_logout(driver);

	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		//getUrl("https://adactinhotelapp.com");
		
		
	}
	
	//Login l;

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		
		sendKeys(l.getUname(), "Aravindhan");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		
		sendKeys(l.getPassw(), "A8807881338");
	}

	@Then("^user Click On The Login Button And Its Navigate To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_Its_Navigate_To_The_Search_Hotel_Page() throws Throwable {

		click(l.getLoginbtn());
	}
	
	//Search_Hotel sh

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
	
		singleDropdown(sh.getLoca(), "value", "Melbourne");
	}

	@When("^user Select The Hotel In Hotel Field$")
	public void user_Select_The_Hotel_In_Hotel_Field() throws Throwable {
		
		singleDropdown(sh.getHotl(), "value", "Hotel Sunshine");
	}

	@When("^user Select The Room Type In Room Type Field$")
	public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {
		
		singleDropdown(sh.getRtype(), "value", "Standard");
	}

	@When("^user Select The NumberOfRoom In NumberOfRoom$")
	public void user_Select_The_NumberOfRoom_In_NumberOfRoom() throws Throwable {
		
		singleDropdown(sh.getRnos(), "value", "2");
	}

	@When("^user Select CheckInDate In CheckInDate Field$")
	public void user_Select_CheckInDate_In_CheckInDate_Field() throws Throwable {
	
		sendKeys(sh.getChckindate(), "15/03/2021");
	}

	@When("^user Select CheckOutDate In CheckOutDate Field$")
	public void user_Select_CheckOutDate_In_CheckOutDate_Field() throws Throwable {
		
		sendKeys(sh.getChckoutdate(), "16/03/2021");
	}

	@When("^user Select AdultsInRoom In AdultsInRoom Field$")
	public void user_Select_AdultsInRoom_In_AdultsInRoom_Field() throws Throwable {
		
		singleDropdown(sh.getAdultper(), "value", "2");
	}

	@When("^user Select ChildInRoom In ChildInRoom Field$")
	public void user_Select_ChildInRoom_In_ChildInRoom_Field() throws Throwable {
	
		singleDropdown(sh.getChildper(), "value", "2");
	}

	@Then("^user Click On SearchButton And It Navigate To Select A Hotel$")
	public void user_Click_On_SearchButton_And_It_Navigate_To_Select_A_Hotel() throws Throwable {
	
		click(sh.getSearchbtn());
	}
	
	//Select_Hotel selh

	@When("^user Click On RadioButton In SelectHotel Field$")
	public void user_Click_On_RadioButton_In_SelectHotel_Field() throws Throwable {
		
		click(selh.getSelecthotel());
	}

	@Then("^user Click On ContinueButton And It Navigate To Book A Hotel$")
	public void user_Click_On_ContinueButton_And_It_Navigate_To_Book_A_Hotel() throws Throwable {
	
		click(selh.getContinu());
	}
	
	//Book_a_Hotel bh

	@When("^user Enter FirstName In FirstName Field$")
	public void user_Enter_FirstName_In_FirstName_Field() throws Throwable {
		
		sendKeys(bh.getFname(), "Aravind");
	}

	@When("^user Enter LastName In LastName Field$")
	public void user_Enter_LastName_In_LastName_Field() throws Throwable {
	
		sendKeys(bh.getLname(), "Ravi");
	}

	@When("^user Enter Address In Address Field$")
	public void user_Enter_Address_In_Address_Field() throws Throwable {
	
		sendKeys(bh.getAddrs(), "Thiruvannamalai");
	}

	@When("^user Enter CreditCardNumber In CreditCardNumber Field$")
	public void user_Enter_CreditCardNumber_In_CreditCardNumber_Field() throws Throwable {
	
		sendKeys(bh.getCridnum(), "5879654239874563");
	}

	@When("^user Enter CreditCardType In CreditCardType Field$")
	public void user_Enter_CreditCardType_In_CreditCardType_Field() throws Throwable {
	
		singleDropdown(bh.getCridtype(), "value", "VISA");
	}

	@When("^user Enter CreditCardMonth In CreditCardMonth Field$")
	public void user_Enter_CreditCardMonth_In_CreditCardMonth_Field() throws Throwable {
	
		singleDropdown(bh.getCrdmonth(), "value", "10");
	}

	@When("^user Enter CreditCardYear In CreditCardYear Field$")
	public void user_Enter_CreditCardYear_In_CreditCardYear_Field() throws Throwable {
	
		singleDropdown(bh.getCrdyear(), "value", "2022");
	}

	@When("^user Enter CreditCardCCVNumber In CreditCardCCVNumber Field$")
	public void user_Enter_CreditCardCCVNumber_In_CreditCardCCVNumber_Field() throws Throwable {
	
		sendKeys(bh.getCvvnum(), "332");
		
		implicitwait(30);
	}


	
	@Then("^user Click On BookNowButton And It Navigate To Booking Conformation$")
	public void user_Click_On_BookNowButton_And_It_Navigate_To_Booking_Conformation() throws Throwable {
	
		click(bh.getBooknow_btn());
	}
	
	//Booking_conformation bc

	@When("^user Click On ItineraryButton And It Navigate To Itinary Booking$")
	public void user_Click_On_ItineraryButton_And_It_Navigate_To_Itinary_Booking() throws Throwable {
	
		click(bc.getMyitine());
	}
	
	//Itinary_logout logout

	@When("^user Click On LogoutButton And It Navigate To HomePage$")
	public void user_Click_On_LogoutButton_And_It_Navigate_To_HomePage() throws Throwable {
	
		click(logout.getLogut());
	}



}
