package com.TripAdvisor.pageObjects;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TripAdvisor.utils.DataReader;

public class Locators extends BasePage {

	public Locators(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	static By tripClick = By.xpath("//div[@class='biGQs _P ttuOS']");
	static By holidayHomesClick = By.xpath("//span[normalize-space()='Holiday homes']");
	static By searchItem = By.xpath("//input[@placeholder='Where do you want to go?']");
	static By checkInDateIcon = By.xpath("//span[@data-datetype=\"CHECKIN\"]");
	static By dates = By.xpath("//span[@class='rsdc-cell rsdc-day']");
	static By checkOutDateIcon = By.xpath("//span[@data-datetype='CHECKOUT']");
	static By findRentalsButton = By.xpath("//button[@id='SUBMIT_VACATION_RENTALS']");
	static By guests = By.xpath("//div[normalize-space()='Guests']");
	static By incrementBtn = By.xpath("//button[@aria-label='increase']");
	static By sortBtn = By.xpath("//span[@class='biGQs _P vvmrG'][normalize-space()='Tripadvisor Sort']");
	static By travellerRatingBtn = By.xpath("//span[contains(text(),'Traveller Rating')]");
	static By showAll = By.xpath("(//span[@class='biGQs _P XWJSj Wb'][normalize-space()='Show all'])[1]");
	static By elevatorFilter = By.xpath("//label[@for='amenities.27']//span[@class='PMWyE _W I j u R2 _S']");
	static By hotelClick = By.xpath("//div[@class='zxMUq f']//a[@class='ToVyw b S7 W o q']");
	static By totalPrice = By.xpath("//*[@id=\"component_1\"]/div[2]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div[2]");
	static By chargesPerNight = By.xpath("//div[@class='WJFGa']//div[1]//div[2]");
	static By hotelName = By.xpath("//h1[@class='biGQs _P fiohW uuBRH']");
	static By cruiseClick = By.xpath("//span[normalize-space()='Cruises']");
	static By cruiseLine = By.xpath("//span[normalize-space()='Cruise line']");
	static By cruiseLineList = By.xpath("//div[@class='iDcAX']//li");
	static By cruiseSearch = By.xpath("//button[contains(text(),'Search')]");

	String file = System.getProperty("user.dir") + "/src/test/resources/Trip.xlsx"; // storing the file path
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void clickOnTrips() {
		driver.findElement(tripClick).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
	}

	public void clickOnHolidayHomes() {
		driver.findElement(holidayHomesClick).click();
	}

	public void searchItems(String cityName) {
		driver.findElement(searchItem).sendKeys(cityName);
		driver.findElement(searchItem).sendKeys(Keys.TAB);
	}

	public void clickOnCheckInIcon() {
		driver.findElement(checkInDateIcon).click();
		Date checkin = new Date();
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(checkin);
		calendar1.add(Calendar.DAY_OF_YEAR, 1);
		checkin = calendar1.getTime();
		SimpleDateFormat dateformat1 = new SimpleDateFormat("dd");
		String formatted_date1 = dateformat1.format(checkin);
		System.out.println(formatted_date1);
		List<WebElement> list1 = driver.findElements(By.xpath("//span[@class='rsdc-cell rsdc-day']"));
		System.out.println(list1.size());
		for (WebElement d1 : list1) {
			if (d1.getText().equals(formatted_date1)) {
				d1.click();
				break;
			}
		}

	}

	public void clickonCheckOutIcon() {
		driver.findElement(checkOutDateIcon).click();
		Date checkout = new Date();
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(checkout);
		calendar2.add(Calendar.DAY_OF_YEAR, 6);
		checkout = calendar2.getTime();
		SimpleDateFormat dateformat2 = new SimpleDateFormat("dd");
		String formatted_date2 = dateformat2.format(checkout);
		System.out.println(formatted_date2);
		List<WebElement> list2 = driver.findElements(By.xpath("//span[@class='rsdc-cell rsdc-day']"));
		System.out.println(list2.size());
		for (WebElement d2 : list2) {
			if (d2.getText().equals(formatted_date2)) {
				d2.click();
				break;
			}
		}

	}

	public void clickOnFindRentals() {
		driver.findElement(findRentalsButton).click();
	}

	public void noOfGuests() {
		js.executeScript("arguments[0].click()", driver.findElement(guests));
		driver.findElement(incrementBtn).click();
		driver.findElement(incrementBtn).click();
		driver.findElement(incrementBtn).click();
		driver.findElement(By.xpath("//button[@data-automation='applyGuests']")).click();
	}

	public void sortBy() {
		driver.findElement(sortBtn).click();
		driver.findElement(travellerRatingBtn).click();
	}

	public void elevatorFilter() {
		new WebDriverWait(driver, Duration.ofMinutes(2)).ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.visibilityOfElementLocated(showAll));
		js.executeScript("arguments[0].click()", driver.findElement(showAll));
		driver.findElement(elevatorFilter).click();
		driver.findElement(By.xpath("//div[@data-button-type='primary']//button[@type='button']")).click();
	}

	public void setData() throws IOException {
		List<List<String>> values = new ArrayList<>();
		// Add rows to the 2D list
		values.add(List.of(driver.findElement(By.xpath("//a[normalize-space()='Your Home in Chennai city']")).getText().toString(), driver.findElement(By.xpath("(//div[@class='MvXmI'])['" + 1 + "']")).getText().toString(), driver.findElement(By.xpath("(//div[contains(text(),'₹19,425')])[1]")).getText()
				.toString()));
		values.add(List.of(driver.findElement(By.xpath("//a[@class='ToVyw b S7 W o q'][normalize-space()='Thirumalaiyan Service Apartment 1']")).getText().toString(), driver.findElement(By.xpath("(//div[@class='MvXmI'])['" + 2 + "']")).getText().toString(), driver.findElement(By.xpath("(//div[contains(text(),'₹5,250')])[1]")).getText()
				.toString()));
		values.add(List.of(driver.findElement(By.xpath("//a[normalize-space()='Oxygen Homes']")).getText().toString(), driver.findElement(By.xpath("(//div[@class='MvXmI'])['" + 3 + "']")).getText().toString(), driver.findElement(By.xpath("(//div[contains(text(),'₹14,257')])[1]")).getText()
				.toString()));

		// Print the 2D list without using foreach loop
		for (int i = 0; i < values.size(); i++) {
			List<String> row = values.get(i);
			for (int j = 0; j < row.size(); j++) {
				DataReader.setCellData(file, "Prices", i, j, row.get(j));
				System.out.print(row.get(j) + "\t");
			}
			System.out.println();
		}
	}

	public void cruiseLineClick() {
		driver.findElement(cruiseClick).click();
		driver.findElement(cruiseLine).click();
		List<WebElement> li = driver.findElements(cruiseLineList);
		Random random = new Random();
		// Generate a random number between 0 and 139
		int randomNumber = random.nextInt(139); // Generates a random integer between 0 (inclusive) and 140 (exclusive)
		System.out.println(randomNumber);
		String s=Integer.toString(randomNumber);
		li.get(randomNumber).click();
	}

	public void cruiseSearchClick() {
		driver.findElement(cruiseSearch).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); // handling multiple windows
		driver.switchTo().window(tabs.get(1)); // switching the tab
	}
	
	public void setCruiseData() {
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'szsLm')]//div[1]")).getText().toString());
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'ui_column is-6-desktop is-12-mobile is-12-tablet XIXdG')]//div[3]")).getText().toString());
	}

}
