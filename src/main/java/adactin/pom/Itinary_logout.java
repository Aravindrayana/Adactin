package adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinary_logout {
	
	public static WebDriver driver;
	
	@FindBy(name="logout")
	private WebElement logut;

	public Itinary_logout(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getLogut() {
		return logut;
	}
	
	

}
