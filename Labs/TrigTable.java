/* Look up the trigonometric methods for sine, cosine, and tangent in the java.lang.Math class
(sin(), cos(), tan()). Write a program that prints the values of the three trigonometric
methods for angles between 0 and 3.5 radians in 0.1 radian increments.*/

package Labs;
import java.text.DecimalFormat;

public class TrigTable {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("#.00");
        double x1 = 0;
        double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		
        System.out.println("Radian\tSin\tCos\tTan");
		System.out.println("******************************");	
		double i;
		for (i = 0 ; i <=3.5 ; i = i + .1)
		{
			double s = Math.sin(i);
			double c = Math.cos(i);
			double t = Math.tan(i);
			System.out.println(numberFormat.format(i) + "\t" + numberFormat.format(s) + "\t" + numberFormat.format(c) + "\t" + numberFormat.format(t));
		}
    }
		
}