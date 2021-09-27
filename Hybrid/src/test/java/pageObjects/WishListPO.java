package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPO {
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
	@FindBy(css="li[class='topnav_item studyunit']")
	WebElement studyunit;
	@FindBy(css="li[class='subnav_item 1781']")
	WebElement computertable;
	@FindBy(xpath="//span[@data-sku='FNTBST41CM30081']")
	WebElement wishlist;
	@FindBy(css="span[class='wishtext']")
	WebElement click;
	@FindBy(id="shortlist-badge")
	WebElement shortlist;
	@FindBy(css="span[class='name']")
	WebElement name;
	@FindBy(xpath="//div[@class='wishproduct wishblock']")
	WebElement hover;
	@FindBy(css="span[class='wishtext']")
	WebElement removewishlist;
	
	
	 public WishListPO(WebDriver driver) {
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
		
		public WebElement studyunit(){
			return studyunit;
		}
		
		public WebElement computertable(){
			return computertable;
		}
		
		public WebElement wishlist(){
			return wishlist;
		}
		
		public WebElement click(){
			return click;
		}
		
		public WebElement shortlist(){
			return shortlist;
		}
		
		public WebElement name(){
			return name;
		}
		
		public WebElement hover(){
			return hover;
		}
		
		public WebElement removewishlist(){
			return removewishlist;
		}
		
		
}
