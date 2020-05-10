package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class testStrings {

	@Test
	public void test() {
		jUnitFunction jTest = new jUnitFunction();
		String result = jTest.strings("hello", "world");
		assertEquals ("helloworld",result);
	}

}
