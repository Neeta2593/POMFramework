package pages;


import org.openqa.selenium.WebDriver;
import ObjectRepository.OR;

public class HomePage {
		 WebDriver driver;	
		 public HomePage(WebDriver driver){
			 this.driver= driver;
		}
		 public String getHomePageDashboardUserName(){
	         return    driver.findElement(OR.objhomePageUserName).getText();
	     }
		 public void clickNewCustomer(){
			 driver.findElement(OR.objNewCustomer).click();
		 }
	 }
