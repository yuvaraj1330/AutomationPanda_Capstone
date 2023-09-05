package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Scenario_001 extends TestBase{
	@Test
	public void Scenario1(){
		panda.getContact().click();
		String contact=driver.getTitle();
		Assert.assertEquals("Contact | Automation Panda",contact,"Title is not matched");
		panda.getName().sendKeys("yuvaraja");
		panda.getEmail().sendKeys("yuvarajsadha00@gmail.com");
		panda.getMessage().sendKeys("excellent user experience");
		panda.getSubmitbutton().click();
		boolean sent=driver.getPageSource().contains("Your message has been sent");
		Assert.assertTrue(sent,"System does not sent message");

	}
}