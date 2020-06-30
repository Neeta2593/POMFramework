package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

//import org.testng.annotations.Test;

public class TestLogin {
	HomePage objHome;
	LoginPage objLogin;
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
	System.setProperty("webdriver.chrome.driver","C://Users//Nikhil//Downloads//Compressed//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/V4/");
	driver.manage().window().maximize();
	}
	
  @Test(priority = 0)
  public void test_Home_Page_After_Login() {
	  
	objLogin= new LoginPage(driver);
	String loginPageTitle = objLogin.getLoginTitle();
	Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
    objLogin.loginToApp("mgr123", "mgr!23");
	
	objHome = new HomePage(driver);
	Assert.assertTrue(objHome.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	
  }
}
