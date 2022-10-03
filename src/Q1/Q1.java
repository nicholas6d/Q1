package Q1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Q1Report.html");

		ExtentReports extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	    
	    ExtentTest testQ1 = extent.createTest("Bank Manager - Add & Delete Customer", "Add & Delete Customer");
	     
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nicong\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		testQ1.log(Status.INFO, "Testing start");
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/");
		driver.manage().window().maximize();
		testQ1.pass("Navigated to XYZ Bank Homepage");
		
		NgWebDriver ngDriver = new NgWebDriver((JavascriptExecutor)driver );
		ngDriver.waitForAngularRequestsToFinish();
		
				
		driver.findElement(ByAngular.buttonText("Bank Manager Login")).click();
		Thread.sleep(1000);
		testQ1.pass("Click on Bank Manager Login button");
		
		//Add Customer -- start
		driver.findElement(By.cssSelector("button.btn-lg:nth-child(1)")).click();
		Thread.sleep(1000);
		testQ1.pass("Click on Add Customer button");
		
		//Christopher Connely
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(new String[]{"Christopher"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(new String[]{"Connely"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(new String[]{"L789C349"});
		driver.findElement(By.cssSelector("button.btn:nth-child(4)")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(1000);
		testQ1.pass("Successfully added Christopher Connely");
		
		//Frank Christopher
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(new String[]{"Frank"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(new String[]{"Christopher"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(new String[]{"A897N450"});
		driver.findElement(By.cssSelector("button.btn:nth-child(4)")).click();
		System.out.println(alert.getText());
		alert.accept();		
		Thread.sleep(1000);
		testQ1.pass("Successfully added Frank Christopher");
		
		//Christopher Minka
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(new String[]{"Christopher"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(new String[]{"Minka"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(new String[]{"M098Q585"});
		driver.findElement(By.cssSelector("button.btn:nth-child(4)")).click();
		System.out.println(alert.getText());
		alert.accept();	
		Thread.sleep(1000);
		testQ1.pass("Successfully added Christopher Minka");
		
		//Connely Jackson
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(new String[]{"Connely"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(new String[]{"Jackson"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(new String[]{"L789C349"});
		driver.findElement(By.cssSelector("button.btn:nth-child(4)")).click();
		System.out.println(alert.getText());
		alert.accept();	
		Thread.sleep(1000);
		testQ1.pass("Successfully added Connely Jackson");
		
		//Jackson Frank
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(new String[]{"Jackson"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(new String[]{"Frank"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(new String[]{"L789C349"});
		driver.findElement(By.cssSelector("button.btn:nth-child(4)")).click();
		System.out.println(alert.getText());
		alert.accept();	
		Thread.sleep(1000);
		testQ1.pass("Successfully added Jackson Frank");
		
		//Minka Jackson
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(new String[]{"Minka"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(new String[]{"Jackson"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(new String[]{"A897N450"});
		driver.findElement(By.cssSelector("button.btn:nth-child(4)")).click();
		System.out.println(alert.getText());
		alert.accept();	
		Thread.sleep(1000);
		testQ1.pass("Successfully added Minka Jackson");
		
		//Jackson Connely
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(new String[]{"Jackson"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(new String[]{"Connely"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(new String[]{"L789C349"});
		driver.findElement(By.cssSelector("button.btn:nth-child(4)")).click();
		System.out.println(alert.getText());
		alert.accept();	
		Thread.sleep(1000);
		testQ1.pass("Successfully added ackson Connely");
		
		//Lawrence Zimmerman
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(new String[]{"Lawrence"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(new String[]{"Zimmerman"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(new String[]{"L789C349"});
		driver.findElement(By.cssSelector("button.btn:nth-child(4)")).click();
		System.out.println(alert.getText());
		alert.accept();	
		Thread.sleep(1000);
		testQ1.pass("Successfully added Lawrence Zimmerman");
		
		//Mariotte Tova
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys(new String[]{"Mariotte"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys(new String[]{"Tova"});
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys(new String[]{"L789C349"});
		driver.findElement(By.cssSelector("button.btn:nth-child(4)")).click();
		System.out.println(alert.getText());
		alert.accept();		
		Thread.sleep(1000);
		testQ1.pass("Successfully added Mariotte Tova");
		
		//Add Customer -- end
		
		//Delete Customer -- start
		driver.findElement(By.cssSelector("button.btn-lg:nth-child(3)")).click();
		Thread.sleep(1000);
		testQ1.pass("Click on Customer button");
		
		driver.findElement(By.cssSelector("tr.ng-scope:nth-child(10) > td:nth-child(5) > button:nth-child(1)")).click();
		System.out.println("Successfully delete record Jackson Frank");
		Thread.sleep(1000);
		testQ1.pass("Successfully deleted Jackson Frank");
		
		driver.findElement(By.cssSelector("tr.ng-scope:nth-child(6) > td:nth-child(5) > button:nth-child(1)")).click();
		System.out.println("Successfully delete record Christopher Connely");
		Thread.sleep(1000);
		testQ1.pass("Successfully deleted Christopher Connely");
		//Delete Customer -- end
		
		testQ1.info("Test Completed");
		extent.flush();
		
		//Home
		driver.findElement(By.cssSelector(".home")).click();		
		driver.close();
	}

}
