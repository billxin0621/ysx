package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test4 {
	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal(-5.563);
		BigDecimal a = bd.setScale(2, RoundingMode.HALF_UP);
		BigDecimal b = bd.setScale(2, RoundingMode.HALF_DOWN);
		BigDecimal c = bd.setScale(2, RoundingMode.UP);
		BigDecimal d = bd.setScale(2, RoundingMode.DOWN);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		long long1 = 10;
		long long2 = 5;
		System.out.println(long1-long2);
	}
}
