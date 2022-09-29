package com.sony.utils;

public class MathUtils {
	
	public Long factorial(Integer num) {
		long f=1;
		
		while (num > 1) {
			f*=num--;
		}
		
		return f;
	}

}
