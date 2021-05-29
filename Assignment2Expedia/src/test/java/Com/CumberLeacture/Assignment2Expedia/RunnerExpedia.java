package Com.CumberLeacture.Assignment2Expedia;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class RunnerExpedia {
	WebDriver driver;
  @SuppressWarnings("deprecation")
@Test(priority=1)
  public void EX001(){
	 FlightTab FlightTab= new FlightTab(driver);
	 FlightTab.FlightButton();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 FlightTab.From();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  FlightTab.FromOrigin();
	 
	 	  
  }
  
 
  @SuppressWarnings("deprecation")
@Test(priority =2)
  public void EX002() {
	  FlightTab FlightTab= new FlightTab(driver);
	  FlightTab.DC();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

@Test (priority=3)
  public void EX003() throws InterruptedException {
	  FlightTab FlightTab= new FlightTab(driver);
	  FlightTab.todestination();
	  Thread.sleep(5000);
  }
  
	 @SuppressWarnings("deprecation")
	@Test(priority=4)
public void EX004() {
		  FlightTab FlightTab= new FlightTab(driver);
		  FlightTab.todestination2();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }

@Test(priority=5)
public void EX005() throws InterruptedException {
		 FlightTab FlightTab= new FlightTab(driver);
		FlightTab.ISL();
		Thread.sleep(5000);
	  }

@Test (priority=6)
public void Ex006() throws InterruptedException {
	FlightTab FlightTab= new FlightTab(driver);
	FlightTab.Departingdate();
	Thread.sleep(5000);
	

}
@Test (priority=7)
public void Ex007() {
FlightTab FlightTab= new FlightTab(driver);
FlightTab.June15();
}
@Test (priority=8)
public void Ex008() {
FlightTab FlightTab= new FlightTab(driver);
FlightTab.June29();
}

@Test(priority=9)
public void EX009() {
FlightTab FlightTab= new FlightTab(driver);
FlightTab.AppydateSearch();
}

@Test (priority=10)
public void Ex010(){
FlightTab FlightTab= new FlightTab(driver);
FlightTab.SearchButton();
}


  @BeforeMethod
public void beforeMethod() {
  }

  @AfterMethod
public void afterMethod() {
  }

  @BeforeClass
public void beforeClass() {
	 browsers("chrome");
	  
	  
  }

  @AfterClass
public void afterClass() throws InterruptedException {
	  driver.close();
		  Thread.sleep(5000);
	}

public void browsers(String browsers) {
	  if(browsers.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahno\\eclipse-workspace\\Cucmber\\Assignment2Expedia\\Driver\\chromedriver.exe");
			  driver= new ChromeDriver();
			  driver.get("https://www.expedia.com");
			  driver.manage().window().maximize();
	  } else if(browsers.equalsIgnoreCase("msedge")) {
		 	  System.setProperty("webdriver.edge.driver", "C:\\Users\\mahno\\eclipse-workspace\\Cucmber\\Assignment2Expedia\\Driver\\msedgedriver.exe");
			  driver= new EdgeDriver();
			  driver.get("https://www.expedia.com");
			  driver.manage().window().maximize();
	  }
  }
}
