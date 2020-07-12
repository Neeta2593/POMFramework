package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.OR;
import pages.HomePage;
import pages.LoginPage;
import Utilities.ExcelUtility;

public class TestLogin extends ExcelUtility {
	String TestCaseName = "TestLogin";
	HomePage objHome;
	LoginPage objLogin;
	WebDriver driver;
	
@BeforeTest
public void setup(){
	System.setProperty("webdriver.chrome.driver","C://Users//Nikhil//Downloads//Compressed//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(OR.pathUrl);
	driver.manage().window().maximize();
}
	
  @Test(dataProvider= "TestData")
  public void test_Home_Page_After_Login(String UserID, String Password, String CustomerName, String DOB)  {
	  
	objLogin= new LoginPage(driver);
	String loginPageTitle = objLogin.getLoginTitle();
	Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
    objLogin.loginToApp(UserID, Password);
	
	objHome = new HomePage(driver);
	Assert.assertTrue(objHome.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	driver.close();
  }
}
