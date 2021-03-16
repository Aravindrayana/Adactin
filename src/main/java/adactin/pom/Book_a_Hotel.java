package adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_a_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement fname;
	
	@FindBy(name="last_name")
	private WebElement lname;
	
	@FindBy(name="address")
	private WebElement addrs;
	
	@FindBy(name="cc_num")
	private WebElement cridnum;
	
	@FindBy(name="cc_type")
	private WebElement cridtype;
	
	@FindBy(name="cc_exp_month")
	private WebElement crdmonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement crdyear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvvnum;
	
	@FindBy(name="book_now")
	private WebElement booknow_btn;

	public Book_a_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddrs() {
		return addrs;
	}

	public WebElement getCridnum() {
		return cridnum;
	}

	public WebElement getCridtype() {
		return cridtype;
	}

	public WebElement getCrdmonth() {
		return crdmonth;
	}

	public WebElement getCrdyear() {
		return crdyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBooknow_btn() {
		return booknow_btn;
	}
	
	
}
