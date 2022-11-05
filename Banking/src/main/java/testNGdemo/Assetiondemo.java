package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assetiondemo {
	@Test
	public void Assetiondemo1() {
		Assert.assertEquals(12, 13);

	}

	@Test
	public void test1() {
		System.out.println("Test case 2 started");
		Assert.assertEquals(12, 13, "Dropdown count doesnot match please check with developer"); // Hard assertion
		System.out.println("Test case 2 completed");

	}

	@Test
	public void test3() {
		System.out.println("Test case 3 started");
		Assert.assertEquals("Hello", "Hello", "words does not match raise a bug");
		System.out.println("Test case 3 completed");
	}

}
