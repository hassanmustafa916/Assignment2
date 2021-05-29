package Com.CumberLeacture.Assignment2Expedia;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightTab {
WebDriver driver;

@FindBy(xpath= "//*[@id=\"uitk-tabs-button-container\"]/li[2]/a/span") 
WebElement FlightButton;
public void FlightButton()	{
	Actions FB= new Actions(driver);
	FB.moveToElement(FlightButton).click().build().perform();
}

@FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button") 
WebElement From;
public void From() {
	Actions ob=new Actions(driver);
	ob.moveToElement(From).click().build().perform();
}

@FindBy(xpath = "//*[@id='location-field-leg1-origin']") 
WebElement Fromorigin;
public void FromOrigin() {
	Actions ob=new Actions(driver);
	ob.moveToElement(Fromorigin).click().sendKeys("DC").build().perform();
}

@FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/ul/li[1]/button/div/div[1]/span/strong") 
WebElement DC;
public void DC() {
	Actions ob= new Actions(driver);
	ob.moveToElement(DC).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
}


@FindBy(xpath="//*[text()='Going to']")
WebElement todestination	;
public void todestination() {
Actions ob = new Actions(driver);
ob.moveToElement(todestination).click().build().perform();
}

@FindBy(xpath = "//*[@id='location-field-leg1-destination']") 
WebElement todestination2;
public void todestination2() {
Actions ob = new Actions(driver);
ob.moveToElement(todestination2).click().sendKeys("Islamabad").build().perform();
}


@FindBy(xpath = "//*[@id=\"location-field-leg1-destination-menu\"]/div[2]/ul/li[5]/button") 
WebElement ISL;
public void ISL() {
Actions ob = new Actions(driver);
ob.moveToElement(ISL).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
}


@FindBy(xpath="//*[@aria-label='Jun 15, 2021']")
WebElement June15;
public void June15() {
Actions ob= new Actions(driver);
ob.moveToElement(June15).click().build().perform();
}

@FindBy(xpath="//*[@id='d1-btn']") 
WebElement Departingdate;
public void Departingdate() {
	Actions ob= new Actions(driver);
	ob.moveToElement(Departingdate).click().build().perform();
}

@FindBy(xpath="//*[@aria-label='Jun 29, 2021']")
WebElement June29;
public void June29() {
	Actions ob= new Actions(driver);
	ob.moveToElement(June29).click().build().perform();
}

@FindBy(xpath="//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")
WebElement Searchbutton;
public void SearchButton() {
	Actions ob= new Actions(driver);
	ob.moveToElement(Searchbutton).click().build().perform();
}

@FindBy(xpath="//*[@id=\"app-layer-datepicker-flights-departure-arrival-end\"]/div[2]/div/div/div[3]/button/span")
WebElement Appydatesearch;
public void AppydateSearch()	{
	Actions ob = new Actions(driver);
	ob.moveToElement(Appydatesearch).click().build().perform();
}

public FlightTab(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
}
