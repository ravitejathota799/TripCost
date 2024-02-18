package com.TripAdvisor.StepDefinitions;

import java.io.IOException;

import com.TripAdvisor.pageObjects.Locators;
import com.TripAdvisor.utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelSearch {

	static Locators loc;

	@Given("user launches the browser with url")
	public void user_launches_the_browser_with_url() {
		loc = new Locators(Helper.getDriver());
	}

	@When("user click on Trips in trip advisor website")
	public void user_click_on_Trips_in_trip_advisor_website() {
		loc.clickOnTrips();
		System.out.println("-----Clicked on Trip-----");
	}

	@When("user click on holiday homes in the trip advisor website")
	public void user_click_on__in_the_trip_advisor_website() {
		loc.clickOnHolidayHomes();
		System.out.println("-----Clicked on HolidayHomes-----");
	}

	@When("user searches for Nairobi city in the search box of trip advisor webiste {string}")
	public void user_searches_for_nairobi_city_in_the_search_box_of_trip_advisor_webiste(String cityName) {
		loc.searchItems(cityName);
		System.out.println("-----Searched for Nairobi-----");
	}

	@When("user clicks on checkin date in the trip advisor website")
	public void user_clicks_on_checkin_date_in_the_trip_advisor_website() {
		loc.clickOnCheckInIcon();
		System.out.println("-----Clicked on CheckIn Date-----");
	}

	@When("user clicks on checout date in the trip advisor website")
	public void user_clicks_on_checout_date_in_the_trip_advisor_website() {
		loc.clickonCheckOutIcon();
		System.out.println("-----Clicked on CheckOutDate-----");
	}

	@When("user clicks on findRentals button in the trip advisor website")
	public void user_clicks_on_find_rentals_button_in_the_trip_advisor_website() {
		loc.clickOnFindRentals();
		System.out.println("-----Clicked on FindRentals button in the trip advisor website-----");
	}

	@Given("user need to select the no.of members in the trip advisor website")
	public void user_need_to_select_the_no_of_members_in_the_trip_advisor_website() {
		loc.noOfGuests();
		System.out.println("------Guests Entered-----");
	}

	@Then("user should sort the result based on the travller rating")
	public void user_should_sort_the_result_based_on_the_travller_rating() {
		loc.sortBy();
		System.out.println("------Sorted By Done-----");
	}

	@Then("it hould display the results and user need to select elevator\\/list access under amenities dropdown in trip advisor website")
	public void it_hould_display_the_results_and_user_need_to_select_elevator_list_access_under_amenities_dropdown_in_trip_advisor_website() {
		loc.elevatorFilter();
		System.out.println("-----Elevator Filter Done-----");
	}

	@Then("user need to capture the three holiday homes prices and store it in excel sheet")
	public void user_need_to_capture_the_three_holiday_homes_prices_and_store_it_in_excel_sheet() throws IOException {
		loc.setData();
		System.out.println("-----Date Inserted Successfully-----");
	}
	
	@Given("user need to select any of the cruise line randomly from the list of available options")
	public void user_need_to_select_any_of_the_cruise_line_randomly_from_the_list_of_available_options() {
	    loc.cruiseLineClick();
	    System.out.println("-----Cruise Liine Done-----");
	}

	@Then("click on search in the trip advisor website")
	public void click_on_search_in_the_trip_advisor_website() {
	    loc.cruiseSearchClick();
	    System.out.println("-----clicked on search button-----");
	}

	@Then("capture cruise line,cruise name , launche year , passengers , from the trip advisor website")
	public void capture_cruise_line_cruise_name_launche_year_passengers_from_the_trip_advisor_website() {

	    loc.setCruiseData();
	    System.out.println("-----Captured Cruise Data-----");
	}
	
	@Given("user captures all the list of available hotels in the respective area")
	public void user_captures_all_the_list_of_available_hotels_in_the_respective_area() {
	    
	    
	}

	@Then("store it in excel sheet {string}")
	public void store_it_in_excel_sheet(String string) {
	    
	    
	}

	@Given("user clicks on forums tab in the trip advisor website")
	public void user_clicks_on_forums_tab_in_the_trip_advisor_website() {
	    
	    
	}

	@Then("stores all the forums in the trip advisor website in the excel sheet")
	public void stores_all_the_forums_in_the_trip_advisor_website_in_the_excel_sheet() {
	    
	    
	}

	@Given("user clicks on flights tab in the trip advisor website")
	public void user_clicks_on_flights_tab_in_the_trip_advisor_website() {
	    
	    
	}

	@Then("stores all the list of available flights information")
	public void stores_all_the_list_of_available_flights_information() {
	    
	    
	}

}
