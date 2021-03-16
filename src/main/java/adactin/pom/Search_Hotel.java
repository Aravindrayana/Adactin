package adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(name="location")
	private WebElement loca;
	
	@FindBy(name="hotels")
	private WebElement hotl;
	
	@FindBy(name="room_type")
	private WebElement rtype;
	
	@FindBy(name="room_nos")
	private WebElement rnos;
	
	@FindBy(name="datepick_in")
	private WebElement chckindate;
	
	@FindBy(name="datepick_out")
	private WebElement chckoutdate;
	
	@FindBy(name="adult_room")
	private WebElement adultper;
	
	@FindBy(name="child_room")
	private WebElement childper;
	
	@FindBy(name="Submit")
	private WebElement searchbtn;

	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	
	}

	public WebElement getLoca() {
		return loca;
	}

	public WebElement getHotl() {
		return hotl;
	}

	public WebElement getRtype() {
		return rtype;
	}

	public WebElement getRnos() {
		return rnos;
	}

	public WebElement getChckindate() {
		return chckindate;
	}

	public WebElement getChckoutdate() {
		return chckoutdate;
	}

	public WebElement getAdultper() {
		return adultper;
	}

	public WebElement getChildper() {
		return childper;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	
	

}
