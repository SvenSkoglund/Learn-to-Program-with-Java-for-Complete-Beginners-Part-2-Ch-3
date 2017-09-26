/* Write a program with a method that calculates a power — a base number raised to the power of an
exponent. The method should take two parameters: a double (the base) and an int (the
exponent). The method should return a double: the base raised to the power of the exponent. In
the main() method, prompt the user to enter the base and the exponent; use the method to
perform the calculation; then print the result returned by the method. */

package Labs;
import java.util.*;

public class PowerMethod
{
	public static void main (String [] Args)
	{
		Scanner scanner = new Scanner(System.in);
		double base = 0;
		int power = 0;
		
		
		System.out.print("\nPlease enter the base number: ");
		base = scanner.nextDouble();
		
		System.out.print("\nPlease enter the number to raise the base number "
		+ "to the power of: ");
		power = scanner.nextInt();
		
		System.out.println("\n" + base + " ^ "+ power + " = " + powerMethod(base,power));
	}
	
	public static double powerMethod (double base, int power)
	{
		double answer = Math.pow(base,power);

		return answer;
	}
}