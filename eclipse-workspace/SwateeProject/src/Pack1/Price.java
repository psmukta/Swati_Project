package Pack1;

import java.text.NumberFormat;

public class Price {

	public static void main(String[] args) {
		int sp=10;
		int it=15;
		int pr=100;
		int tp=sp*it;
		int cp=(tp-pr)/15;
		float CP=cp;
		NumberFormat dollar=NumberFormat.getCurrencyInstance();
		System.out.println("Product cost price is  :"+dollar.format(CP));

	}

}
