package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertdemo {
	@Test
	public void softassert() {
		System.out.println("Test 1 started");
		SoftAssert asserttion = new SoftAssert();
		asserttion.assertEquals(12, 13);
		System.out.println("Test 1 completed");
	}

	@Test
	public void hardassert() {
		System.out.println("Test 2 started");
		Assert.assertEquals(12, 13);
		System.out.println("Test 2 completed");
	}

}
