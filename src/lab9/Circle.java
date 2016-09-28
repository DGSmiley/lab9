package lab9;
import java.lang.Math;


public class Circle {
	
		public double Circle ;
		public double circumference;
		public double area;
		public String formattedCircumference;
		public String formattedArea;
		private String formatNumber;
		public static int getObjectCount;
		public static final double PI;

		public  Circle (String fc, String fa, double cir, double a) {
			formattedCircumference = fc;
			formattedArea = fa;
			//formatNumber = fn;
			circumference = cir;
			area = a;
		}
		public String getFormattedCircumference() {
			return formattedCircumference;
		}

		public void setformattedCircumference(String fc) {
			formattedCircumference = fc;
		}

		public String getFormattedArea() {
			return formattedArea;
		}

		public void setformattedArea(String fa) {
			formattedArea = fa;
		}

		public double getCircumference() {
			PI*(radius*radius);
			return circumference;
		}

		public void setcircumference(double cir) {
			circumference = cir;
		}

		public double getArea() {
			return area;
		}

		public void setArea(double a) {
			area = a;
		}

	}


