package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC001_PO {
public WebDriver driver;
	
	@FindBy(css="span[class='header-icon-link user-profile-icon']")
	WebElement icon;
	@FindBy(css="a[class='login-link authentication_popup']")
	WebElement popup;
	@FindBy(css="input[placeholder='Email Address']")
	WebElement email;
	@FindBy(css="input[placeholder='Password']")
	WebElement password;
	@FindBy(css="input[value='Log In']")
	WebElement login;
	
	
	public TC001_PO(WebDriver driver) {
			this.driver = driver ;
			PageFactory.initElements(driver,this);
		}

		public WebElement icon() {
			 return icon;
		 }
		
		public WebElement popup(){
			return popup;
		}
		
		public WebElement email(){
			return email;
		}
		
		public WebElement password(){
			return password;
		}
		
		public WebElement login(){
			return login;
		}
		
}
