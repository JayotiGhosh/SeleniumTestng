package TestngPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;*/

public class windows {

		@Test (priority=0)
		public void playwWindows() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://google.com");
				System.out.println(driver.getTitle());
				String url = driver.getCurrentUrl();
			//	System.out.println(driver.getLocalStorage());
				System.out.println(url);
				if (url.startsWith("https"))
				{
					System.out.println("seccurred");
				}
				
				String title = driver.getTitle();
				if (title.equals("Google"))
				{
					System.out.println("As per expectation");
				}
				
				driver.get("http://magento.com");
				
				System.out.println(driver.getTitle());
					System.out.println("On Magento");
				
				driver.navigate().back();
			
				System.out.println(driver.getTitle());
				System.out.println("On Google");
				
				driver.navigate().forward();
				
				System.out.println(driver.getTitle());
				System.out.println("On Magento");
				
				driver.navigate().refresh();
				System.out.println(driver.getTitle());
				System.out.println("Still Magento");
				
				System.out.println("Enough playin w the browers...bye!!!!!!");
				
				driver.quit();
					}
			
		@Test (priority=1)
		public void playwAlerts() throws InterruptedException {
				// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("http://www.echoecho.com/javascript4.htm");
				driver.findElement(By.name("B1")).click();
			//	Thread.sleep(1000);
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				
				Thread.sleep(1000);
				driver.findElement(By.name("B2")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().dismiss();
				
				
				driver.findElement(By.name("B3")).click();
				driver.switchTo().alert().sendKeys("Hi There");
				System.out.println(driver.switchTo().alert().getText());;
				driver.switchTo().alert().accept();
				driver.close();
			}
		}
			

			

