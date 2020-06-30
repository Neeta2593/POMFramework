package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	By byuserID= By.name("uid");
	By bypassword= By.name("password");
	By bylogin= By.name("btnLogin");
	By titleText =By.className("barone");
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver= driver;
	}
	
	public void setUserID(String userID) {
		driver.findElement(byuserID).sendKeys(userID);
	}
	
	public void setPassword(String password) {
		driver.findElement(bypassword).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(bylogin).click();
	}
	
	public String getLoginTitle(){
		return driver.findElement(titleText).getText();
	    }
	
	  public void loginToApp(String strUserName,String strPasword){
	        this.setUserID(strUserName);
	        this.setPassword(strPasword);
	        this.clickLogin();        
	    }
}
