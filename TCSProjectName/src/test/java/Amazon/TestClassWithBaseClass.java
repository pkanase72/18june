package Amazon;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePackage.BaseClass;


public class TestClassWithBaseClass extends BaseClass  {
	
	@BeforeClass
	public void browserLaunch() {
		launchBrowser("chrome");
	}
	@Test
	public void TC01() {
		System.out.println("TC01");
	}

	
}
