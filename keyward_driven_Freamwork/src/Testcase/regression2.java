package Testcase;

import org.testng.annotations.Test;

import keyward.Baseclass;

public class regression2 extends Baseclass {
	@Test
	public static void main(String[] args) throws InterruptedException {
		Baseclass.m1("Chrome");
		Thread.sleep(5000);
		Baseclass.OpenUrl("https://eagercrow.com/Home");
		Thread.sleep(5000);
		Baseclass.Click("XPATH", "/html/body/app-root/app-header/header/div[1]/div[2]/div[2]/a");
		Thread.sleep(5000);
		Baseclass.Click("XPATH", "//*[@id=\"firebaseui-auth-container\"]/div/div/form/ul/li[1]/button/span[2]");
	}

}
