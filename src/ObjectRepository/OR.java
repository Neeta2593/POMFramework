package ObjectRepository;

import org.openqa.selenium.By;

public class OR {	
	public static String pathUrl= "http://demo.guru99.com/V4/";
	public static By objhomePageUserName= By.xpath("//table//tr[@class='heading3']");
	public static By objbyuid=By.name("uid");
	public static By objbypassword = By.name("password");
	public static By objbylogin = By.name("btnLogin");
	public static By objtitleText = By.className("barone");
	public static By objNewCustomer= By.xpath("//a[contains(text(),'New Customer')]");
	public static By objbyCustomerName= By.name("name");
	public static By objbyGender= By.xpath("//input[@value='f']");
	public static By objbyDate= By.id("dob");
	public static By objCAddress= By.name("addr");
	public static By objCCity= By.name("city");
	public static By objCState= By.name("state");
	public static By objCPIN= By.name("pinno");
	public static By objCMobileNo= By.name("telephoneno");
	public static By objCEmailID= By.name("emailid");
	public static By objCPassword= By.name("password");
	public static By objCSubmit= By.name("sub");
	public static By objCReset= By.name("res");
	}
