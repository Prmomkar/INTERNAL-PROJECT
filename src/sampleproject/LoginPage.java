package sampleproject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hiiiii");
		
		
		  System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://indianexpress.com/");
	}

}
