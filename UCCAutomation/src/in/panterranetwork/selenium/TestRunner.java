package in.panterranetwork.selenium;

import in.panterranetworks.selenium.pom.GlobalConstants;
import in.panterranetworks.selenium.pom.LoginUser;
import in.panterranetworks.selenium.pom.StatusChange;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRunner {

	public static void main(String[] args) {
		
		GlobalConstants.driver = new FirefoxDriver();
		
		
		LoginUser lp = new LoginUser();
		
		StatusChange sc = lp.login("monika@account","abc@1234");
		sc.userStatus();
	}
}