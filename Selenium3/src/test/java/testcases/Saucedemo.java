
package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Saucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		//Open Firefox browser
		WebDriver driver= new FirefoxDriver();
		
		//Maximize the Browser window
	    driver.manage().window().maximize();
	    
	    //Delete all cookies
	    driver.manage().deleteAllCookies();
	    
	    //Enter the URL
	    String Url="https://www.saucedemo.com/";
	    driver.get(Url);
	    
	  //Type the value admin in uername textfield
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    
	  //Type the value merury in password textfield
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	    
	    // Click on the login button 
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    
	    
	    WebDriverWait wait= new WebDriverWait(driver,20);
	    //wait.until(ExpectedConditions.titleIs("saucedemo- Homepage"));
	    
	    // click the side button
	   driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
	    
	   //click the all items button
	   driver.findElement(By.xpath("//*[@id='inventory_sidebar_link']")).click();
	   
	   //click the about page
	   driver.findElement(By.xpath("//*[@id='about_sidebar_link']")).click();
	   
	   	   
	   // back to home page
	   
	   driver.navigate().back();
	   
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	// Add to cart in product
	   driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
	   
	   	   
	   // click the side button
	   driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
	   
	   
	   //click the Reset app state
	   
	   driver.findElement(By.xpath("//*[@id='reset_sidebar_link']")).click();
	   
	   //close the button
	   driver.findElement(By.xpath("//*[@id='react-burger-cross-btn']")).click();
	   
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
	        // Remove the product
	   	   driver.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']")).click();
	}
	    
	   
	}

