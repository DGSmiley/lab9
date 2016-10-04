package lab9;

import java.util.Scanner;

public class circleApp {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Welcome to the circle tester! ");
	 int radius = 0;
	 Circle c1 = new Circle(radius);
	 
	 System.out.println("Please enter radius: ");
	 radius = input.nextInt();
	 
	 System.out.println(c1.getArea());
	 System.out.println(c1.getCircumference());
	 
	}

}
