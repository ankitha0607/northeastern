package northeastern.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class northeasterncanvashomepage{
	WebDriver driver;
	
	By loginbutton = By.xpath("/html/body/div[2]/header/div[1]/div[3]/nav/ul/li[6]/a");
	
    public northeasterncanvashomepage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickonlogin() {
		driver.findElement(loginbutton).click();
		}
}