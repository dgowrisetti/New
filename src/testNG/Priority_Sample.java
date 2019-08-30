package testNG;

import org.testng.annotations.Test;

public class Priority_Sample {
	

	@Test(priority=1)
	public void f() {
		System.out.println("@Test f");
	}

	@Test(priority=0)
	public void test() {
		System.out.println("@Test test");
	}

	@Test(priority=2)
	public void a() {
		System.out.println("@Test a");
	}
	
	
}
