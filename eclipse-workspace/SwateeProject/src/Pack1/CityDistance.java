package Pack1;

import java.util.Scanner;

public class CityDistance {

	public static void main(String[] args) {
		float km,m,cm;
		double ft,inch ;
		Scanner scan= new Scanner(System.in);
		System.out.println("Distance in Km ");
	    km=scan.nextFloat();
		m=km*1000;
		cm=m*100;
		inch=cm/2.45;
		ft=inch/12;
		
		System.out.println("The distance between two city is  "+m +"  m");
		System.out.println("The distance between two city is  "+cm + "  cm");
		System.out.println("The distance between two city is  "+ft+"  ft");

	}

}
