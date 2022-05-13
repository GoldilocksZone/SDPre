import java.util.Scanner;

public class Objective9Lab5 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double num1, num2, answer = 0.0;
		boolean keepGoing = true;
		int choice = 0;

		System.out.print("\nHello friend! Please provide a number: ");
		num1 = kb.nextDouble();

		System.out.print("Please provide another number: ");
		num2 = kb.nextDouble();

		while (keepGoing) {
			printMenu();

			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
				case 1:
					answer = findSum(num1, num2);
					System.out.print("The sum of " + num1 + " and " + num2 +
						" is: " + answer + ".\n");
					break;
				case 2:
					answer = findAverage(num1, num2);
					System.out.print("The average of " + num1 + " and " +
						num2 + " is: " + answer + ".\n");
					break;
				case 3:
					answer = calcTax(num1, num2);
					System.out.print("The amount in tax to be collected" + 
						" from a purchase of " + num1 + " and " + num2 +
						" is: " + answer + ".\n");
					break;
				case 4:
					System.out.print("Sayonara!\n");
					keepGoing = false;
					break;
				default:
					System.out.print("Invalid selection. Please try again.\n");
					break;
			}
		}

		kb.close();
	}
	
	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double dub1, double dub2) {
		return dub1 + dub2;
	}

	public static double findAverage(double dub1, double dub2) {
		return findSum(dub1, dub2) / 2;
	}

	public static double calcTax(double dub1, double dub2) {
		return 0.0831 * findSum(dub1, dub2);
	}
}
