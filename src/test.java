import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// This code should be placed inside the main method of a class
		System.out.println("Make your arithmetic selection from the choices below:\n");
		System.out.println(" A. Addition");
		System.out.println(" S. Subtraction");
		System.out.println(" M. Multiplication");
		System.out.println(" D. Division\n");
		System.out.print(" Your choice?");
		Scanner kbReader = new Scanner(System.in);
		char choice = kbReader.next().charAt(0);
		System.out.print("\nEnter first operand. ");
		double op1 = kbReader.nextDouble();
		System.out.print("\nEnter second operand.");
		double op2 = kbReader.nextDouble();
		System.out.println("");
		switch (choice) {
		case 'a':
		case 'A': // addition
			System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2));
			break;
		case 's':
		case 'S': // subtraction
			System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
			break;
		case 'm':
		case 'M': // multiplication
			System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
			break;
		case 'd':
		case 'D':
			System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2));
			break;
		default:
			System.out.println("Hey you! enter only an a,s,m, or d!");

		}
	}

}
