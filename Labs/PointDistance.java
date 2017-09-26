/* Write a program that prompts the user to enter the X and Y coordinates of two points. The
program should define and use a method that will then calculate the distance between the two
points. 

Have main() get the points from the user, and print the result. You can use the power method you
created in the earlier exercise to do the squaring. Use the standard java.lang.Math method
sqrt() to take the square root.*/

package Labs;

public class PointDistance {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double x1 = 0;
        double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		
        System.out.print("Enter the X coordinate of the 1st point: ");
        x1 = scanner.nextInt();

        System.out.print("Enter the Y coordinate of the 1st point: ");
        y1 = scanner.nextInt();
		
        System.out.print("Enter the X coordinate of the 2nd point: ");
        x2 = scanner.nextInt();
		
        System.out.print("Enter the Y coordinate of the 2nd point: ");
        y2 = scanner.nextInt();
		
		System.out.println("The distance between the two points is: " + distance(x1,y1,x2,y2));
    }
	public static double distance (double x1, double y1, double x2, double y2)
	{
		double dist = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
		return dist;
	}
		
}
