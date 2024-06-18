package com.day3;

public class PowerOfANumber {
	public double power(double base, int exponent) {
		return exponent == 1? base: base * power(base, exponent -1);
	}
}
