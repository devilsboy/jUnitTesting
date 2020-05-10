package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class testNumbers {

	@Test
	public void test() {
		jUnitFunction jTest = new jUnitFunction();
		int result = jTest.numbers(50, 40);
		assertEquals (90,result);
	}

}
