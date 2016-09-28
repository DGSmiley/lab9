package lab9;

import java.util.Scanner;

public class circleApp {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Welcome to the circle tester! ");
	 
	 Circle c1 = new Circle(null, null, 0, 0);
	 int radius;
	 System.out.println("Please enter radius: ");
	 radius = input.nextInt();
	 
	 System.out.println(c1.getCircumference());

	}

}
