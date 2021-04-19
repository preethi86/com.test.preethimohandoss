package steps;

import cucumber.api.java.en.And;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;
import pages.actions.OrderTshirtActions;

public class OrderTshirtSteps {
	
	OrderTshirtActions otactions = new OrderTshirtActions();
	
	@Given("^I am on the Home Page \"([^\"]*)\" of a E-Commerce Website$")
	public void i_am_on_the_Home_Page_of_a_E_Commerce_Website(String webSiteURL) throws Throwable {
	    SeleniumDriver.openPage(webSiteURL);
	    
	}

	@When("^I clicked Add to cart button of Faded Short Sleeve T-shirts$")
	public void i_clicked_Add_to_cart_button_of_Faded_Short_Sleeve_T_shirts() throws Throwable {
		
		otactions.addToaArt();
	    
	}

	@Then("^I get a pop-up saying \"([^\"]*)\"$")
	public void i_get_a_pop_up_saying(String arg1) throws Throwable {
	    
	    
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
	    
	    
	}

	@Then("^I see the product Faded Short Sleeve T-shirts on shopping cart summary$")
	public void i_see_the_product_Faded_Short_Sleeve_T_shirts_on_shopping_cart_summary() throws Throwable {
	    
	    
	}

	@When("^I Choose ny delivery address$")
	public void i_Choose_ny_delivery_address() throws Throwable {
	    
	    
	}

	@When("^I agree Terms of service$")
	public void i_agree_Terms_of_service() throws Throwable {
	    
	    
	}

	@When("^I choose Payment type asbank wire payment$")
	public void i_choose_Payment_type_asbank_wire_payment() throws Throwable {
	    
	    
	}

	@When("^I click on confirm my order$")
	public void i_click_on_confirm_my_order() throws Throwable {
	    
	    
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1) throws Throwable {
	    
	    
	}



}
