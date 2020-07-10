package pages;
import org.openqa.selenium.WebDriver;
import ObjectRepository.OR;

public class LoginPage {
	 
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver= driver;
	}
	
	public void setUserID(String userID) {
		driver.findElement(OR.objbyuid).sendKeys(userID);
	}
	
	public void setPassword(String password) {
		driver.findElement(OR.objbypassword).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(OR.objbylogin).click();
	}
	
	public String getLoginTitle(){
		return driver.findElement(OR.objtitleText).getText();
	    }
	
	  public void loginToApp(String strUserName,String strPasword){
	        this.setUserID(strUserName);
	        this.setPassword(strPasword);
	        this.clickLogin();        
	    }
}
