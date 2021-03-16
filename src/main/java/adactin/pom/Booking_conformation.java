package adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_conformation {

	public static WebDriver driver;
	
	@FindBy(name="my_itinerary")
	private WebElement myitine;

	public Booking_conformation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getMyitine() {
		return myitine;
	}
	
	
	
}
