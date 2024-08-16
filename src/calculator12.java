import java.util.Scanner;

public class calculator12 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		boolean startOverAgain = true;

		String startAgain = "";

		String operation = "";

		boolean WatchingOperation = false;

		double result = 0.0;

		double num1;

		double num;

		String note = "";

		while (!(note.equalsIgnoreCase("Standard") || note.equalsIgnoreCase("Scientific"))) {
			System.out.println("Enter the calculator mode: Standard/Scientific?");
			note = scnr.next();

		}

		if (note.equalsIgnoreCase("Standard")) {

			System.out.println("The calculator will operate in standard mode.");
			System.out
					.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
			operation = scnr.next();

			while (!(operation.equals("+") || operation.equals("-") || operation.equals("*")
					|| operation.equals("/"))) {

				System.out.println("Invalid operator " + operation);
				System.out.println(
						"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
				operation = scnr.next();

			}
    
			if (operation.equals("+")) {
				System.out.println("How many numbers do you want to add: ");
				num1 = scnr.nextDouble();
				System.out.println("Enter " + num1 + "numbers: ");

				for (int i = 1; i <= num1; i++) {
					num = scnr.nextDouble();
					result += num;
				}
				System.out.println("The result will be " + result);

			}

			if (operation.equals("-")) {
				System.out.println("How many numbers do you want to add: ");
				num1 = scnr.nextDouble();
				System.out.println("Enter " + num1 + "numbers: ");

				for (int i = 1; i <= num1; i++) {
					num = scnr.nextDouble();
					result -= num;
				}
				System.out.println("The result will be " + result);
			}

			if (operation.equals("/")) {
				result = 1;
				System.out.println("subtract?: ");
				System.out.println("How many numbers do you want to add: ");
				num1 = scnr.nextDouble();
				System.out.println("Enter " + num1 + "numbers: ");

				for (int i = 1; i <= num1 - 1; i++) {
					num = scnr.nextDouble();
					result /= num;
				}

				System.out.println("The result will be " + result);
			}

			if (operation.equals("*")) {
				result = 1;
				System.out.println("How many numbers do you want to add: ");
				num1 = scnr.nextDouble();
				System.out.println("Enter " + num1 + "numbers: ");
				for (int i = 1; i <= num1; i++) {
					num = scnr.nextDouble();
					result *= num;
				}

				System.out.println("The result will be " + result);
			}

		}

		if (note.equalsIgnoreCase("Scientific")) {
			System.out.println("The calculator will operate in scientific mode.");
			System.out.println(
					"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, "
							+ "'cos' for cos x, 'tan' for tan x");
			operation = scnr.next();

			while (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")
					|| operation.equals("sin") || operation.equals("cos") || operation.equals("tan"))) {

				System.out.print("Invalid operator" + operation);
				System.out.print(
						"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, "
								+ "'cos' for cos x, 'tan' for tan x");
				operation = scnr.next();

			}

			if (operation.equals("+")) {
				System.out.println("How many numbers do you want to add: ");
				num1 = scnr.nextDouble();
				System.out.println("Enter " + num1 + "numbers: ");

				for (int i = 1; i <= num1; i++) {
					num = scnr.nextDouble();
					result += num;

				}

				System.out.println("The result will be " + result);
			}

			if (operation.equals("-")) {
				System.out.println("How many numbers do you want to add: ");
				num1 = scnr.nextDouble();
				System.out.println("Enter " + num1 + "numbers: ");

				for (int i = 1; i <= num1; i++) {
					num = scnr.nextDouble();
					result -= num;
				}

				System.out.println("The result will be " + result);
			}

			if (operation.equals("/")) {

				result = 1;
				System.out.println("subtract?: ");
				System.out.println("How many numbers do you want to add: ");
				num1 = scnr.nextDouble();
				System.out.println("Enter " + num1 + "numbers: ");

				for (int i = 1; i <= num1 - 1; i++) {
					num = scnr.nextDouble();
					result /= num;
				}

				System.out.println("The result will be " + result);
			}

			if (operation.equals("*")) {
				result = 1;
				System.out.println("How many numbers do you want to add: ");
				num1 = scnr.nextDouble();
				System.out.println("Enter " + num1 + "numbers: ");

				for (int i = 1; i <= num1; i++) {
					num = scnr.nextDouble();
					result *= num;
				}

				System.out.println("The result will be " + result);
			}

			if (operation.equals("sin")) {
				System.out.println("Enter the number in radians to find sin: ");
				num = scnr.nextDouble();
				System.out.println("Result:" + Math.sin(num));

			}

			if (operation.equals("cos")) {

				System.out.println("Enter the number in radians to find cos: ");
				num = scnr.nextDouble();
				System.out.println("Result:" + Math.cos(num));

			}

			if (operation.equals("tan")) {

				System.out.println("Enter the number in radians to find tan: ");
				num = scnr.nextDouble();
				System.out.println("Result:" + Math.tan(num));

			}

		}

	}
}
