package com.sony.utils.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sony.utils.MathUtils;

class MathUtilsTests {
	@Test
	void shouldReturnFactorial() {
		MathUtils mu;
		mu = new MathUtils();
		
		Long f = mu.factorial(5);
		
		assertEquals(120, f);
	}

}
