package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderTShirtLocators {
		
	@FindBy(how=How.XPATH,using=".//img[@title='Faded Short Sleeve T-shirts']")
	public WebElement Tshirtimage;
	
//	@FindBy(how=How.XPATH,using=".//a[contains(text(),'Faded Short Sleeve T-shirts')]/parent::h5/following-sibling::div/a/span[text()='Add to cart']")
//	public WebElement addToCartButton;
	
	@FindBy(how=How.XPATH,using=".//span[text()='Add to cart']/parent::a")
	public WebElement addBox;
	
	
	
	@FindBy(how=How.XPATH,using=".//p[@id='add_to_cart']/button")
	public WebElement addToCartButton;
	
	@FindBy(how=How.XPATH,using=".//div[@class='layer_cart_product col-xs-12 col-md-6']/h2")
	public WebElement successMessageWindow;
	
	@FindBy(how=How.XPATH,using=".//*[contains(text(),'Proceed to checkout')]")
	public WebElement proceedToCheckoutButton;
	
	@FindBy(how=How.XPATH,using=".//*[@id='price-max']")
	public WebElement priceList;
	
	@FindBy(how=How.XPATH,using=".//*[@id='search-submit']")
	public WebElement findMyNextCarButton;
		
}



