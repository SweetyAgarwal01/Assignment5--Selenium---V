package com.ibm.seleniumconcepts;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBrowser
{

	public static void main(String[] args) throws InterruptedException 
	{

		
		
		/*System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		
		//WebDriver driver= new FirefoxDriver();
		//WebDriver driver1= new ChromeDriver();
		WebDriver driver2= new InternetExplorerDriver();
		driver2.get("https://magento.com/");
        
		
		
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='Account']/ancestor::a"));
		myAccount.click();
		
		WebElement register = driver.findElement(By.xpath("//button[@type=� button�]"));
		register.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id=�firstname�]"));
		firstName.sendKeys("Sweety");
		WebElement lasttName = driver.findElement(By.xpath("//input[@id=�lastname�]"));
		lasttName.sendKeys("Agarwal");        		
		WebElement emailAddress = driver.findElement(By.xpath("//input[@id=�email_address�]"));
		emailAddress.sendKeys("sweetaga@in.ibm.com");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id=�password�]"));
		passWord.sendKeys("autocorrect123");
		WebElement passWordconf = driver.findElement(By.xpath("//input[@id=�confirmation�]"));
		passWordconf.sendKeys("autocorrect123");
		
		WebElement tickBox = driver.findElement(By.id("agree_terms"));
		tickBox.click();*/
		
		
	/*	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		WebDriver driver= new FirefoxDriver();
				
		driver.get("https://spicejet.com");
		
        WebElement roundTrip= driver.findElement(By.xpath("//input[@value='RoundTrip']"));
		
		if(!roundTrip.isSelected())
		{
			roundTrip.click();
			
		}
		
        WebElement goingcity= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		
        goingcity.click();
		
		
		WebElement origincity = driver.findElement(By.linkText("Chennai (MAA)"));
		origincity.click();
		Thread.sleep(5000);
		WebElement destinationcity = driver.findElement(By.linkText("Bengaluru (BLR)"));
		destinationcity.click();
		Thread.sleep(5000);
		
		List<WebElement> row1= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));
		int noOfRows=row1.size();
		WebElement goingDate= driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[4]"));
		goingDate.click();
		
		Thread.sleep(5000);
		
		WebElement returnDatewin= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']"));
		returnDatewin.click();
		List<WebElement> row2= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));
		WebElement returnDate= driver.findElement(By.xpath("//table[@id='ui-datepicker-calendar']/tbody/tr[2]/td[6]"));
		returnDate.click();
		Thread.sleep(5000);
		
		
		WebElement passenger = driver.findElement(By.id("divpaxinfo"));
		passenger.click();
		WebElement passengeradd = driver.findElement(By.id("hrefIncAdt"));
		passengeradd.click();
		
		WebElement done= driver.findElement(By.xpath("//input[@id='btnclosepaxoption']"));
		done.click();
		Thread.sleep(5000);
    
		WebElement currencyadd = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		Select select=new Select(currencyadd);
		select.selectByValue("USD");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']"));
		search.click();
		Thread.sleep(5000);
		WebElement searchresult = driver.findElement(By.id("divsearchdisplay"));
		searchresult.click();
		String searchverify = searchresult.getText();
		System.out.println(searchverify);
		*/
      /* String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
		
		if(pageSource.contains(" Chennai  to  Bangkok "))
			
			System.out.println("Search is correct");
		{
			if(pageSource.contains(" 5 Dec, Wed "))
		
			{
				if(pageSource.contains(" 7 Dec, Fri "))
					
				{
					if(pageSource.contains(" 2 Adult"))
					{
						if(pageSource.contains(" USD"))
							
							System.out.println("Search is correct");	
					}
			    }
			}
		}
		else
		{
			System.out.println("Search is not correct");
		}*/
		
	

		
		
		
		/*System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		WebDriver driver= new FirefoxDriver();
				
		driver.get("https://datatables.net/");
		
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		int noOfRows=rows.size();
		
		
		System.out.println(noOfRows);
		
		int tot_sal=0 ;
		{
		for (int i=1; i<=noOfRows; i++)
			
		{
			
			WebElement expand= driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]"));
			expand.click();
			Thread.sleep(5000);
			WebElement Sal= driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+(i+1)+"]/td/descendant::span[2]"));
			String sal1= Sal.getText();
			System.out.println("Original salary of the employee " + sal1);
			String salary= sal1.trim().replace("$", "").replace(",", "");
		    tot_sal= tot_sal + Integer.parseInt(salary);
			 
		    System.out.println("toatal salary on each addition "+ tot_sal);
			
		    WebElement expand1= driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]"));
			expand1.click();
			}
		System.out.println("total salary on 1st page "+ tot_sal);
		
		}*/	
		
		/*System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait=new 	WebDriverWait(driver,60);
		driver.get("https://www.amazon.in/");
		
		WebElement shopBylink= driver.findElement(By.xpath("//span[text()='Shop by']"));
		WebElement computersMobileslinks=driver.findElement(By.xpath("(//span[text()='Mobiles, Computers'])[1]"));
		WebElement Laptopslink= driver.findElement(By.xpath("//span[text()='Laptops']"));
		
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(shopBylink).pause(2000).moveToElement(computersMobileslinks)
			.pause(2000).moveToElement(Laptopslink).pause(1000).click().build().perform();
		
		actions.moveToElement(shopBylink).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(computersMobileslinks).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(Laptopslink).build().perform();	
		Thread.sleep(2000);
		
		actions.moveToElement(shopBylink).build().perform();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOf(computersMobileslinks));
		actions.moveToElement(computersMobileslinks).build().perform();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(Laptopslink));
		actions.moveToElement(Laptopslink).build().perform();	
		Thread.sleep(2000);
		actions.click().build().perform();*/
		
		
		
	/*	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 System.out.println(links.size());
		 
		 for (int i = 1; i<=links.size(); i=i+1)
		 
		 {
		 
		 System.out.println(links.get(i).getText());
		 
		 }*/
		 /*
		    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			
			WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
			firstName.sendKeys("Sweety");
			WebElement lasttName = driver.findElement(By.xpath("//input[@name='lastname']"));
			lasttName.sendKeys("Agarwal");        		
			WebElement emailAddress = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			emailAddress.sendKeys("sweetaga@in.ibm.com");
			WebElement paswrdnew = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			paswrdnew.sendKeys("sweetaga@in.ibm.com");
			WebElement submit= driver.findElement(By.xpath("//button[@name='websubmit']"));
			submit.click();
			*/
			/*System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			WebElement emailname = driver.findElement(By.xpath("//input[@id='email']"));
			emailname.sendKeys("sweetaga@in.ibm.com");
			WebElement paswrd = driver.findElement(By.xpath("//input[@id='pass']"));
			paswrd.sendKeys("pasword123"); 
			WebElement loginbuton = driver.findElement(By.xpath("//input[@type='submit']"));
			loginbuton.click(); */
			
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.jcpenney.com/");
		WebElement popuplink= driver.findElement(By.xpath("//button[@onclick=�javascript:contShop();�]"));
		popuplink.click();
		/*WebElement shopBylink= driver.findElement(By.xpath("//span[text()='Shop by']"));
		WebElement computersMobileslinks=driver.findElement(By.xpath("(//span[text()='Mobiles, Computers'])[1]"));
		WebElement Laptopslink= driver.findElement(By.xpath("//span[text()='Laptops']"));
		
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(shopBylink).pause(2000).moveToElement(computersMobileslinks)
			.pause(2000).moveToElement(Laptopslink).pause(1000).click().build().perform();*/
	}
}


