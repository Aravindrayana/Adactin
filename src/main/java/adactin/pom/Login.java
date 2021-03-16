package adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public static WebDriver driver;
	
	
	@FindBy(xpath="(//input[@class='login_input'])[1]")
	private WebElement uname;
	
	@FindBy(xpath="(//input[@class='login_input'])[2]")
	private WebElement passw;
	
	@FindBy(xpath="//input[@class='login_button']")
	private WebElement loginbtn;

	public Login(WebDriver driver2) {

	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPassw() {
		return passw;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
}
