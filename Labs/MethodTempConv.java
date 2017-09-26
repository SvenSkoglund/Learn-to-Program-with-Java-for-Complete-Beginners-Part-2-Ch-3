/*Find your temperature conversion program from a previous chapter and put the temperature
calculations in a method. In your main() method, prompt for a number to be converted and pass
the number to the method. Let the method print the results of the conversion. */
 
 package Labs;

public class MethodTempConv 
{
	public static void main (String [] Args)
	{ 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		
		//Declares and prompts user for temperature and scale, calls the converter method
		float temp = 0;
		float conv = 0;
		char fc = 'f';
	
		System.out.println();
		System.out.print("Please enter temperature : ");
		temp = scanner.nextFloat();

		
		System.out.println();
		System.out.print("Please enter C for Celsius or F for Fahrenheit: ");
		fc = scanner.next().charAt(0);
		System.out.println();
		
		
		scanner.close();
		converter(temp,conv,fc);
	}
	public static void converter(float temp, float conv, char fc)
	{
		// Converts from f to c and prints result
		if ((fc == 'F') || (fc == 'f'))
		{
			conv = ((temp - 32) / ( 1.8f ));
			System.out.println( temp + " degrees Farenheit equals " 
			+ conv + " degrees Celcius");
			System.out.println();		
		}
		
		
		// Converts from c to f and prints result
		else if (( fc == 'C') || ( fc == 'c'))
		{
			conv = (temp * ( 1.8f ) + 32);
			System.out.println( temp + " degrees Celsius equals " 
			+ conv + " degrees Farenheit");
			System.out.println();
		}
		
		
		else
			System.out.print("**Invalid Entry** \u0007");
	}
}