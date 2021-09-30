package pageObjects;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC005_PO {
public WebDriver driver;
	
	@FindBy(css="li[class='topnav_item bedroomunit']")
	WebElement bedroomunit;
	@FindBy(css="li[class='subnav_item 376']")
	WebElement DoubleBed;
	@FindBy(css="li[data-group='features']")
	WebElement feature;
	@FindBy(id="filters_storage_type_Box")
	WebElement type;
	@FindBy(css="li[data-group='material']")
	WebElement material;
	@FindBy(id="filters_material_Engineered_Wood")
	WebElement wood;
	@FindBy(css="li[data-group='finish']")
	WebElement finish;
	@FindBy(id="filters_primary_finishes_californian_walnut")
	WebElement walnut;
	@FindBy(css="li[data-group='size']")
	WebElement size;
	@FindBy(id="filters_bed_size_King")
	WebElement king;
	@FindBy(css="div[class='results-count']")
	WebElement count;
	@FindBy(css="span[class='name']")
	List<WebElement> name;
	
	
	 public TC005_PO(WebDriver driver) {
			this.driver = driver ;
			PageFactory.initElements(driver,this);
		}

		public WebElement bedroomunit() {
			 return bedroomunit;
		 }
		
		public WebElement DoubleBed(){
			return DoubleBed;
		}
		
		public WebElement feature(){
			return feature;
		}
		
		public WebElement type(){
			return type;
		}
		
		public WebElement material(){
			return material;
		}
		
		public WebElement wood(){
			return wood;
		}
		
		public WebElement finish(){
			return finish;
		}
		
		public WebElement size(){
			return size;
		}
		
		
		public WebElement king(){
			return king;
		}
		
	
		public WebElement count(){
			return count;
		}
		
		public WebElement walnut(){
			return walnut;
		}
		
		public List<WebElement> name(){
			return name;
		}
}
