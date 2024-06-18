package com.day3;

public class GCD {
	public int gcd(int a, int b) {
		return a%b == 0 ? b :
			   		b%a == 0 ?  a:
						a>b? gcd(a%b,b): gcd(a, b%a);
	}
}
