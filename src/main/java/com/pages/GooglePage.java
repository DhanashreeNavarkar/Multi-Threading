package com.pages;

import org.openqa.selenium.By;

public class GooglePage extends BasePage{
	
	//page actions
	public void googleSearchTest() {
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Sanskrit");
		driver.findElement(By.name("q")).submit();
		driver.findElements(By.xpath("//h3")).stream().forEach(ele -> System.out.println(ele.getText()));
	
	}
	
	public void tearDown() {
		driver.quit();
	}

}
