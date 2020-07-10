package pages;
import org.openqa.selenium.WebDriver;
import ObjectRepository.OR;

public class CustomerPage {
	WebDriver driver;
	
	public CustomerPage(WebDriver driver){
		this.driver= driver;
	}	
	public void setCustomerName(String strCustomerName) {
		driver.findElement(OR.objbyCustomerName).sendKeys(strCustomerName);
	}	
	public void selectGender() {
		driver.findElement(OR.objbyGender).click();
	}	
	public void setDate(String strDate) {
		driver.findElement(OR.objbyDate).sendKeys(strDate);
	}
	public void setCAddress(String strCAddress) {
		driver.findElement(OR.objCAddress).sendKeys(strCAddress);
	}
	
	
	  public void fillCustomerForm(String strCustomerName,String strDate){
		  	this.setCustomerName(strCustomerName);
	        this.selectGender();
	        this.setDate(strDate);        
	    }
}
