package fi.softwarlab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App 
{
	WebDriver driver;
	public void launchBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\SoftWareEngineering\\msedgedriver.exe");

		driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		Thread.sleep(1000);
		System.out.println("user name entered successfully");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("submit");
		
		Thread.sleep(2000);
		System.out.println("password entered successfully");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		System.out.println("login successfully");
		driver.close();
		System.out.println("close successfull");
	}
    public static void main( String[] args ) throws InterruptedException
    {
        App ob=new App();
        ob.launchBrowser();
    }
}

