package lab9;
import java.lang.Math;



public class Circle {
		public int radius = 0;
		public double circumference;
		public double area;
		public String formattedCircumference;
		public String formattedArea;
		private double formatNumber;
		public static int getObjectCount;
		

		public  Circle (int rad) {
			
					}
		
		public String getFormattedCircumference() {
			return formattedCircumference;
		}

		public String getFormattedArea() {
			return formattedArea;
		}
		public double getCircumference() {
			circumference = Math.PI*2*radius;
			return circumference;
		}

		public double getArea() {
			area = Math.PI*(radius * radius);
			return area;
		}

		private double formatNumber(double x){
			   x = Math.PI;
			return formatNumber;
		}
		
		
		}

	


