package JavaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			Actions act = new Actions(driver);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("http://spicejet.com");
			
			wait.until(ExpectedConditions.elementToBeSelected(By.id("ctl00_mainContent_rbtnl_Trip_0")));
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear();
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[12]/a")).click();
		
			Thread.sleep(1000);
		//	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).clear();
		//	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR")).sendKeys("CCU");
			driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[3]/li[3]/a")).click();
			
					
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
			
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[4]/a")).click();
			
			driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
				
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[1]/a")).click();
			
			driver.findElement(By.id("divpaxinfo")).click();
				
			Select passengers = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			
			passengers.selectByValue("3");
			
			Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
			
			child.selectByIndex(3);
			
			Select infant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
			infant.selectByVisibleText("1");
			
			Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			currency.selectByVisibleText("USD");
			
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
			
			
			driver.findElement(By.id("ControlGroupSelectView_AvailabilityInputSelectView_RadioButtonMkt1Fare5_0")).click();
			
			//if (!driver.findElement(By.id("ControlGroupSelectView_AvailabilityInputSelectView_RadioButtonMkt2Fare1_0")).isSelected());
			//{
				driver.findElement(By.id("ControlGroupSelectView_AvailabilityInputSelectView_RadioButtonMkt2Fare1_0")).click();
			//}
			
			/*if (!driver.findElement(By.id("ControlGroupSelectView_ContactInputGSTViewSelectView_CheckBoxGST")).isSelected());
			{
				driver.findElement(By.id("ControlGroupSelectView_ContactInputGSTViewSelectView_CheckBoxGST")).click();
			}*/
			Thread.sleep(1000);
			driver.findElement(By.id("continue-to-contact-page")).click();
		
				
				
				
				
		}
}
	


