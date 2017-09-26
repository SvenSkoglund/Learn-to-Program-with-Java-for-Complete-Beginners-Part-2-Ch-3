/*Starting here we introduce a program that you build a piece at a time, adding capabilities to the
program after each chapter as you learn more techniques of computer programming. You may not
have time to work on the project this week, in which case you can use it as a post-class project to
practice what you've learned after this class is over.

Write a program that displays a menu on the screen:

Read the option number, then display a message:

Put your employee program into an infinite loop. Make sure the exit option works so the user can
end the program.

Change the program such that for each option on the menu (except the exit option), your program
will call a method to do the work. Write the methods and, for now, just move the
System.out.print( ) that prints which option you chose into the corresponding method.
Have the method print the message and*/
 
 package Labs;

public class MethodEmployeeMenu
{
	public static void main (String [] Args)
	{ 
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		

		int op = 0;
		
		while (true)
		{
		System.out.println();
		System.out.println("      Employee File           ");
		System.out.println("      _____________            ");
		System.out.println("Option   Description           ");
		System.out.println("______   ___________           ");
		System.out.println("0        Exit                  ");
		System.out.println("1        Enter a new employee  ");
		System.out.println("2        View existing employee");
		System.out.println("3        Delete an employee    ");
		System.out.println("4        List all employees    ");
		System.out.println();
		System.out.print("Please choose an Option: ");
		
		op = scanner.nextInt();
		System.out.println();
		
		if (op != 0)
		{
		switch (op)
		{

			
			case 1:
			newEmployee();
			break;
			
			case 2:
			existingEmployee();
			break;
			
			case 3:
			deleteEmployee();
			break;

			case 4:
			listEmployees();
			break;
			
			default:
			System.out.println("!! Invalid Entry !! \u0007");
		}
		}else
			break;
		}
	
		scanner.close();
		
	}
	public static void newEmployee ()
	{
		System.out.println("You chose option 1 - Enter a new employee");
	}
	public static void existingEmployee ()
	{
		System.out.println("You chose option 2 - View an existing employee");
	}
	public static void deleteEmployee ()
	{
		System.out.println("You chose option 3 - Delete an employee");
	}
	public static void listEmployees ()
	{
		System.out.println("You chose option 4 - List all employees");
	}
	
	
}