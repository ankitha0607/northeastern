package northeastern;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import northeastern.pageobjects.northeasterncanvashomepage;
import northeastern.pageobjects.canvasloginpage;

public class  stepdefinitions{
	WebDriver driver;
	

	@Given("I open the northeastern university page")
	public void i_open_the_northeastern_university_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://canvas.northeastern.edu/");
	   
	}
	@When("I click on the log in button")
	public void i_click_on_the_log_in_button() {
		northeasterncanvashomepage page1 = new northeasterncanvashomepage(driver);
		page1.clickonlogin();
		
	}
	@Then("I validate the canvas login page is displayed")
	public void i_validate_the_canvas_login_page_is_displayed() throws InterruptedException {
		Thread.sleep(5000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(newTb.get(1));
	    canvasloginpage page2 = new canvasloginpage(driver);
	    if (page2.loginbuttobdisplay()) {
	    	System.out.println("window handle changed");
	    	
	    }
	    
	}



}