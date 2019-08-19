package Pack1;

import java.text.NumberFormat;

public class Salary {

	public static void main(String[] args) {
		float Basic_salary=5500;
		double Dearness_allowence=(5500*.40);
		double House_rent=5500*0.2;
		double Allowence=Dearness_allowence+House_rent;
		float allowence=(float)Allowence;
		float Gross_salary=Basic_salary+allowence;
		NumberFormat dollar=NumberFormat.getCurrencyInstance();
		System.out.println("Gross Salary is  :  "+ dollar.format(Gross_salary) +"\n"+"Total allowence is  :"+dollar.format(allowence) );
		
		
		

	}

}
