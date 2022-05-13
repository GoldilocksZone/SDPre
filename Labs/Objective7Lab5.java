import java.util.Scanner;

public class Objective7Lab5 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection;

		while (true) {
			System.out.println("_____Menu_____");
			System.out.println("1: Say Hello");
			System.out.println("2: List my favorite foods");
			System.out.println("3: Exit");
			System.out.println();
			System.out.println("Please select an option from the menu:");

			selection = scanner.nextInt();

			if (selection == 1) {
				System.out.println("Hello :)\n");
			}
			else if (selection == 2) {
				System.out.println("My favorite foods are apple, banana, and coconut.\n");
			}
			else if (selection == 3) {
				System.out.println("Ahalrighty then...");
				break;
			}
			else {
				System.out.println("Invalid selection. Please try again.");
			}
		}
	}
}
