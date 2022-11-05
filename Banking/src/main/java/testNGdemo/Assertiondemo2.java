package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertiondemo2 {
	@Test
	public void test1() {
		String name = "mekala";
		Assert.assertTrue(name.contains("mekala"));
	}

	@Test
	public void test2() {
		Assert.assertTrue(false);
	}

}
