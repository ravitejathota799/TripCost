@tag
Feature: Calculate Trip Cost in the trip advisor website Smoke TestSuite

  @smoke
  Scenario: searching for any holiday home in the trip advisor website
    Given user launches the browser with url
    When user click on Trips in trip advisor website
    And user click on holiday homes in the trip advisor website
    And user searches for Nairobi city in the search box of trip advisor webiste "<cityName>"

    Examples: 
      | cityName |
      | Chennai  |

  @smoke
  Scenario: giving the dates from today to 5 days
    When user clicks on checkin date in the trip advisor website
    And user clicks on checout date in the trip advisor website
    And user clicks on findRentals button in the trip advisor website

  @smoke
  Scenario: Entering No.of persons wants to stay and applying some filters and retrieving data based on the filters added
    Given user need to select the no.of members in the trip advisor website
    Then it hould display the results and user need to select elevator/list access under amenities dropdown in trip advisor website
    And user should sort the result based on the travller rating
    And user need to capture the three holiday homes prices and store it in excel sheet

  @smoke
  Scenario: Selecting cruise line and retrieving data like launched year , passengers
    Given user need to select any of the cruise line randomly from the list of available options
    Then click on search in the trip advisor website
    And capture cruise line,cruise name , launche year , passengers , from the trip advisor website

  #@smoke
  #Scenario: user enter any special characters
  #  Given user enters any special characters or junk characters
  #  Then user should validate the result displayed

  #@smoke
  #Scenario: checkin date greater than checkout date
  #  Given user gives checkout date greater than checkin date
  #  Then validate the error message displayed
