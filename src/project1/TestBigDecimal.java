package project1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class TestBigDecimal {
	
	public static void main(String[] args) {
//		BigDecimal m = new BigDecimal("0");
//		m = new BigDecimal("1").divide(new BigDecimal("3"),15 , BigDecimal.ROUND_HALF_UP);
////		BigDecimal a = new BigDecimal();
//		System.out.println(m.toPlainString());
//		m = m.multiply(new BigDecimal("3"));
//		m.setScale(9, RoundingMode.HALF_UP);
//		System.out.println(m.toPlainString());
		
		Double d = new Double(0);
		System.out.println(d);
		d = 1.0/3.0;
		System.out.println(d);
		d *= 3.0;
		System.out.println(d);
		
		double a = 0;
		a = 1.0/10.0;
		System.out.println(a);
		a *=10.0;
		round(a,10);
		System.out.println(a);
		
//		for(int i = 0 ; i < 100 ; i++) {
//			a += 0.01;
//			System.out.println(round(a,10));
//		}

	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}

}
