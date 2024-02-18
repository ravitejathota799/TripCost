@tag
Feature: Calculating Trip Cost

  Scenario: E2E testing suite
    Given user launches the browser with url
    When user click on Trips in trip advisor website
    And user click on holiday homes in the trip advisor website
    And user searches for Nairobi city in the search box of trip advisor webiste "<cityName>"
    When user clicks on checkin date in the trip advisor website
    And user clicks on checout date in the trip advisor website
    And user clicks on findRentals button in the trip advisor website
    Given user need to select the no.of members in the trip advisor website
    Then it hould display the results and user need to select elevator/list access under amenities dropdown in trip advisor website
    And user should sort the result based on the travller rating
    And user need to capture the three holiday homes prices and store it in excel sheet
    Given user need to select any of the cruise line randomly from the list of available options
    Then click on search in the trip advisor website
    And capture cruise line,cruise name , launche year , passengers , from the trip advisor website

    Examples: 
      | cityName |
      | Chennai  |
