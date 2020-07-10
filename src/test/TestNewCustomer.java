package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ObjectRepository.OR;
import Utilities.ExcelUtility;
import pages.CustomerPage;
import pages.HomePage;
import pages.LoginPage;

public class TestNewCustomer extends ExcelUtility {
	public static String TestCaseName = "TestNewCustomer";
	HomePage objHome;
	LoginPage objLogin;
	CustomerPage objCustomer;
	WebDriver driver;
	
@BeforeTest
public void setup(){
	System.setProperty("webdriver.chrome.driver","C://Users//Nikhil//Downloads//Compressed//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(OR.pathUrl);
	driver.manage().window().maximize();
}
	
  @Test(priority = 0, dataProvider= "TestData")
  public void test_Home_Page_After_Login(String UserID, String Password, String CustomerName, String DOB) throws InterruptedException {
	objLogin= new LoginPage(driver);
	String loginPageTitle = objLogin.getLoginTitle();
	Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
    objLogin.loginToApp(UserID, Password);
	
	objHome = new HomePage(driver);
	Assert.assertTrue(objHome.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	
  }
  @Test(priority = 1, dataProvider= "TestData")
	  public void fillNewCustomer(String UserID, String Password, String CustomerName, String DOB) throws InterruptedException{
		  objHome.clickNewCustomer();
		  Thread.sleep(1000);
		  objCustomer= new CustomerPage(driver);
		  objCustomer.fillCustomerForm(CustomerName, DOB);
		  driver.close();
	  }
  
}
