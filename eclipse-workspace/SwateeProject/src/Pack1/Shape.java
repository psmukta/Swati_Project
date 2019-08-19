package Pack1;

public class Shape {

	public static void main(String[] args) {
		int length=10;
		int breath=2;
		int area1= length*breath;
		int perimeter=2*(length+breath);
		int radius=3;
		double pi=3.14;
		double area2 =3.14*radius*radius;
		float Area2=(float)area2;
		double circum=2*3.14*radius;
		float Circum=(float) circum;
		System.out.println("Rectangle area is  :" +area1);
		System.out.println("Rectangle perimeter is  :"+perimeter);
		System.out.println("Circle area is  :" +Area2);
		System.out.println("Circle circum is  :" +Circum);
		

	}

}
