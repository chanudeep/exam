package Webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Firefoxdriver
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.bin",
				"C:/Users/achowtap/AppData/Local/Mozilla Firefox/firefox.exe");
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("network.proxy.type", 1);
        profile.setPreference("network.proxy.http", "10.219.96.26");
        profile.setPreference("network.proxy.http_port", 8080);
        profile.setPreference("network.proxy.ssl", "10.219.96.26");
        profile.setPreference("network.proxy.ssl_port", 8080);
        
        FirefoxDriver driver = new FirefoxDriver(profile); //creating an object for firefoxdriver
        driver.get("http://demo.opencart.com"); // Opening the Website
        String actTitle = driver.getTitle();
		System.out.println("Title is: " + actTitle);
		if (actTitle.equals("Your Store")) {  //Verifying the title of the page
			System.out.println("Verifying Title is Passed");
		} else {
			System.out.println("Verifying Title is not Passed");
		}
		driver.manage().window().maximize(); //maximizing the browser window
		Thread.sleep(2000);
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		System.out.println(links.size());
		int Expectedlinks = 73;
		if(Expectedlinks == links.size())
		{
			System.out.println("Verifying no of linkstest case is passed");
		}
		else
		{
			System.out.println("Verifying no of linkstest case is Failed");
		}
 
		//waiting for page to load completely
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("input-firstname")).sendKeys("Anudeep");
		driver.findElement(By.name("lastname")).sendKeys("Chowtapalli");
		
		driver.findElement(By.cssSelector("#input-password")).sendKeys("anu123/");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("anu123/");
		driver.findElement(By.xpath("//*[@id='content']/form/fieldset[3]/div/div/label[2]/input")).click();
        

		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		boolean b=driver.getPageSource().contains("E-Mail Address does not appear to be valid!");
        if(b){
        	System.out.println("Email address error message is passed"); 
        }
        else{
        	System.out.println("Email address error message is Failed");
        	
        }
        boolean l=driver.getPageSource().contains("Telephone must be between 3 and 32 characters!");
        if(l){
        	System.out.println("Telephone number error message test case is passed"); 
        }
        else{
        	System.out.println("Telephone number error message test case is Failed");
        	
        }
        driver.findElement(By.id("input-email")).sendKeys("ijghdsafwsawsdddackig@gmail.com");
        WebElement mail = driver.findElement(By.cssSelector("#input-email"));
        String ee = mail.getAttribute("value");
        if(Validation.Email(ee))
        {
        	System.out.println("Email id validation is passed");
        driver.findElement(By.xpath("//*[@id='input-telephone']")).sendKeys("1124567891");
        WebElement phone = driver.findElement(By.id("input-telephone"));
		String number = phone.getAttribute("value");
		if(Validation.Telephone(number))
		{
			System.out.println("Telephone number is valid");
		
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(1500);// waiting for the page to load
        boolean p=driver.getPageSource().contains("Your Account Has Been Created!");
        if(p){
        	System.out.println("Title has been verified"); 
        }
        else{
        	System.out.println("Title verification is failed");
        	
        }
        driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[6]/a")).click();
        Thread.sleep(1500);
        driver.findElement(By.linkText("HTC Touch HD")).click();
       
        boolean k=driver.getPageSource().contains("HTC Touch HD");
        if(k){
        	System.out.println("Title Verification passed"); 
        }
        else{
        	System.out.println("Title verification is Failed");
        	
        }
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[1]")).click();
        /*String str= driver.switchTo().alert().getText();
        String s1="Success: You have added HTC Touch HD to your shopping cart!";

        if(str.equalsIgnoreCase(s1))
        {
        	System.out.println(" present");
        }
        else
        {
        	System.out.println("not present");
        }*/ 
        driver.findElement(By.xpath("html/body/footer/div/div/div[3]/ul/li[1]/a")).click();
        boolean kk=driver.getPageSource().contains("Find Your Favorite Brand");
        if(kk){
        	System.out.println("Title Verification passed"); 
        }
        else{
        	System.out.println("Title verification is Failed");
        	
        }
        driver.findElement(By.linkText("canon")).click();
        boolean pp=driver.getPageSource().contains("Canon");
        if(pp){
        	System.out.println("Heading Verification passed"); 
        }
        else{
        	System.out.println("Heading verification is Failed");
        	
        }
        driver.findElement(By.cssSelector("button-group>button")).click();
        driver.findElement(By.cssSelector("list-unstyled>li>a")).click();
        boolean lp=driver.getPageSource().contains("My Wish List");
        if(lp){
        	System.out.println("Title Verification passed"); 
        }
        else{
        	System.out.println("Title verification is Failed");
        	
        }
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("btn.btn-primary")).click();
        
        driver.quit();
		System.out.println("Closing the browser"); 
        
        
        
        
        
        
        
        
	    }
		else
		{
			System.out.println("Telephone number is not valid ");
		}
        }
        else
        {
        	System.out.println("Error");
        }
}
}	