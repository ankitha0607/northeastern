package northeastern.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class canvasloginpage {
	
	WebDriver driver;
	
	By loginbutton = By.xpath("/html/body/section/div/div[1]/div/form/div[3]/button");

	
public canvasloginpage(WebDriver driver) {
		
		this.driver = driver;
	}
	
    public boolean loginbuttobdisplay() {
    	boolean k = driver.findElement(loginbutton).isDisplayed();
    	return k;
    }
}
