import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// This code should be placed inside the main method of a class
		System.out.println("Make your arithmetic selection from the choices below:\n");
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multiplication");
		System.out.println("Division/n");
		System.out.print(" Your choice?");
		Scanner kbReader = new Scanner(System.in);
		String choice = kbReader.next();
		System.out.print("\nEnter first operand. ");
		double op1 = kbReader.nextDouble();
		System.out.print("\nEnter second operand.");
		double op2 = kbReader.nextDouble();
		System.out.println("");
		switch (choice) {
		case "Addition": // addition
			System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2));
			break;
		case "Subtraction": // subtraction
			System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
			break;
		case "Multiplication": // multiplication
			System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
			break;
		case "Division":
			System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2));
			break;
		default:
			System.out.println("Hey you! enter only a choice!");

		}
	}

}
