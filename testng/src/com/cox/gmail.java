package com.cox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class gmail {
     //  public static WebDriver driver = new FirefoxDriver();
	
@Test
public static void gmailLogin() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BALAKUMAR MK\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	 WebDriver driver = new ChromeDriver();
     // String appUrl = "https://accounts.google.com";
             // launch the firefox browser and open the application url
              driver.get("https://paytm.com/");
              
// maximize the browser window
             // driver.manage().window().maximize();
              
// declare and initialize the variable to store the expected title of the webpage.
             // String expectedTitle = " Sign in - Google Accounts ";
              
// fetch the title of the web page and save it into a string variable
              String actualTitle = driver.getTitle();
              System.out.println("!!!!!!!!!"+actualTitle);
             // Assert.assertEquals(expectedTitle,actualTitle);
              
// enter a valid username in the email textbox
//              WebElement login=driver.findElement(By.xpath("//div[contains(text(),'Log In/Sign Up')]"));
//              login.click();
//              WebElement username = driver.findElement(By.id("identifierId"));
//              username.clear();
//              username.sendKeys("9177133616");
 
// enter a valid password in the password textbox
//              WebElement password = driver.findElement(By.id("Gensur#92"));
//              password.clear();
//              password.sendKeys("password123");
              
// click on the Sign in button
//              WebElement SignInButton = driver.findElement(By.id("signIn"));
//              SignInButton.click();
              
// close the web browser
              driver.close();
}
}

