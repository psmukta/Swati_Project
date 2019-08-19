package Pack1;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double cels,fer;
		System.out.println("Temperature is in celcius  :");
		cels=scan.nextDouble();
		fer=1.8*cels+32;
		System.out.println("Farenheit temp is  :" +fer);
			
				

	}

}
