package generic;



import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class Demo {
	
	@Test
	public void testA()
	{
		Reporter.log("Executing testA",true);
	}
	@Test
	public void testB()
	{
		Reporter.log("Executing test B",true);
		Assert.fail();
	}
	@AfterMethod
	public void am(ITestResult res)
	{
		String n = res.getName();
		int s=res.getStatus();
		Reporter.log(n+"status is"+s,true);
	}
}
