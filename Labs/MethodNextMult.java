/* Find your "next largest multiple" program from a previous chapter and put the calculation in a
method. In your main() method, prompt for the numbers to be used in the calculation and pass
them to the method. Return the result back to main(), where the result will be printed out. */

package Labs;

public class MethodNextMult {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int i = 0;
        int j = 0;

        System.out.print("Enter a number: ");
        i = scanner.nextInt();

        System.out.print("Enter the multiple value: ");
        j = scanner.nextInt();
		
		
        System.out.println("The next even largest multiple of " + i);
        System.out.println(" divided by " + j + " is "
                + multMeth(i,j));

        scanner.close();
    }
	public static int multMeth (int num1, int num2)
	{
		int ans = (num1 + num2 - (num1 % num2));
		return ans;
	}
		
}
