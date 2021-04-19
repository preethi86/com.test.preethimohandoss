package pages.actions;




import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;





import pages.locators.OrderTShirtLocators;
import utils.SeleniumDriver;

public class OrderTshirtActions {
	
	//WebDriver driver=null;
	
	OrderTShirtLocators orderTShirtLocators=null;
	public  OrderTshirtActions()
	{
		//this.driver=driver;
		this.orderTShirtLocators= new OrderTShirtLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), orderTShirtLocators);
	}

	public void addToaArt()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		System.out.println("noe0");
		js.executeScript("window.scrollBy(0,800)");
		System.out.println("noe10");
		//Actions action = new Actions(SeleniumDriver.getDriver());
		//action.moveToElement(orderTShirtLocators.Tshirtimage).build().perform();
		System.out.println("noe1");
		//orderTShirtLocators.Tshirtimage.click();
		System.out.println("noe2");
		String parent=SeleniumDriver.getDriver().getWindowHandle();
		Set<String> allWindowHandles = SeleniumDriver.getDriver().getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        System.out.println(iterator);
        while(iterator.hasNext())
        {

        String child_window=iterator.next();


        if(!parent.equals(child_window))
        {
        SeleniumDriver.getDriver().switchTo().window(child_window);

        System.out.println(SeleniumDriver.getDriver().switchTo().window(child_window).getTitle());

		
	   }
  }
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        orderTShirtLocators.addBox.click();
        System.out.println("fdfdvd");
		orderTShirtLocators.addToCartButton.click();
		
		System.out.println("noe3");  
	
	}
	
	
	
	
}
