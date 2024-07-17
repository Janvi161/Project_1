package seleniumgluecode;

//import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class test {
    public  WebDriver driver;
    
    
    
    
	@Given("user is on Login page")
    public void user_is_on_homepage() throws Throwable {     
    	driver = new ChromeDriver();    	
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://192.168.0.162:8020/Login.aspx");	
        driver.manage().window().maximize();
        Thread.sleep(1000);	
        
    }
    
   
    @When("user enters username and Password")
    public void user_enters_username_and_Password() throws Throwable {
    	driver.findElement(By.id("txtUser")).sendKeys("STATEMAKER");
        driver.findElement(By.id("txtPass")).sendKeys("Pass@1234");
        driver.findElement(By.id("btnLogin")).click(); 
       
    }
    
    @Then("User is loged in Successfully")
    public void success_message_is_displayed() throws Throwable {
    	String exp_message = "ATAL MISSION FOR REJUVENATION AND URBAN TRANSFORMATION 2.0";
    	String actual = driver.findElement(By.xpath("//*[@id=\"Label5\"]")).getText();
        Assert.assertEquals(exp_message, actual);
        Thread.sleep(1000);
        driver.quit();  
        //System.out.println("ATAL MISSION FOR REJUVENATION AND URBAN TRANSFORMATION 2.0");
    }      
}