package in.panterranetworks.selenium.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUser extends PageBase{
    //WebDriver driver;
    
	public LoginUser()
	{	GlobalConstants.driver.manage().window().maximize();
		GlobalConstants.driver.get(GlobalConstants.loginPageUrl);
	}
	
	public StatusChange login(String username, String pwd) {
		
		//Login user
				GlobalConstants.driver.findElement(By.name("xusername")).sendKeys(username);
				GlobalConstants.driver.findElement(By.name("password")).sendKeys(pwd);
				
				WebElement display = GlobalConstants.driver.findElement(By.name("keepmesignin"));
				//System.out.println("IsChecked: "+display.isSelected());
				display.click();
				
				//Click Login
				GlobalConstants.driver.findElement(By.className("normalButton")).click();
				GlobalConstants.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				return new StatusChange();
	}
}
