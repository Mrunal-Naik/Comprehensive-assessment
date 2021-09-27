package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidBookShelfPO {
public WebDriver driver;
	@FindBy(css="li[class='topnav_item kidsroomunit']")
	WebElement kids;
	@FindBy(xpath="//li[@class='subnav_item 14422']")
	WebElement bookshelf;
	@FindBy(css="div[data-group='sorting']")
	WebElement sorting;
	@FindBy(css="li[data-key='new_arrival']")
	WebElement newarrival;
	@FindBy(css="a[data-id='125816']")
	WebElement product;
	@FindBy(css="h1[itemprop='name']")
	WebElement name;
	@FindBy(css="meta[content='16499.0']")
	WebElement price;
	
	
	 public KidBookShelfPO(WebDriver driver) {
			this.driver = driver ;
			PageFactory.initElements(driver,this);
		}

		public WebElement kids() {
			 return kids;
		 }
		
		public WebElement bookshelf(){
			return bookshelf;
		}
		
		public WebElement sorting(){
			return sorting;
		}
		
		public WebElement newarrival(){
			return newarrival;
		}
		
		public WebElement product(){
			return product;
		}
		
		public WebElement name(){
			return name;
		}
		
		public WebElement price(){
			return price;
		}
		
}
