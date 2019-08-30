package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotations_Sample {

	@Test//Functionality
	public void f() {
		System.out.println("@Test");
	}

	@BeforeClass // pre-conditions
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass // post conditions
	public void afterClass() {
		System.out.println("@AfterClass");
	}

}
