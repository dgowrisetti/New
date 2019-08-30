package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderSample {
	
	@Test(dataProvider = "deepak")
	public void f(String userName, String password) {
		System.out.println(userName);
		System.out.println(password);

	}

	@DataProvider
	public Object[][] deepak() {
		return new Object[][] {
			new Object[] { "test@gmail.com", "Hi32432" },
			new Object[] { "Test1@gmail.com","Hellosdf45435" }, 
			};
	}
}

