package testfeature;

import org.testng.Assert;
import org.testng.annotations.Test;

import feature.Login;

public class LoginTest
{
	public Login l1 = new Login();
	
	@Test
	public void logintest_tc01()
	{
		boolean actual_result = l1.login("admin", "admin");
		Assert.assertEquals(actual_result, true);
		System.out.println("--logintest_tc01 exeucted successfully--");
	}
}
