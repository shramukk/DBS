package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;

public class Sample {

	@Given("^User is on MakeMyTrip Home Page$")
	public void user_is_on_MakeMyTrip_Home_Page() {
		Hooks.driver.navigate().to("https://www.google.com/flights");
	}

	@When("^User Searches for flight from \"([^\"]*)\" to \"([^\"]*)\"$")
	public void user_Searches_for_flight_from_to(String from, String to) {
		new HomePage().searchFLight(from, to);
	}

	@When("^Selects best itinerary$")
	public void selects_best_itinerary() {
		new HomePage().selectItinerary();
	}

	@Then("^User should be on Review your Booking Page$")
	public void user_should_be_on_Review_your_Booking_Page() {

	}
}
