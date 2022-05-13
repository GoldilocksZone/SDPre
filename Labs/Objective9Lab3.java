import java.util.Scanner;

public class Objective9Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection;

		while (true) {
			printMenu();

			System.out.println("Please make a selection:");
			selection = scanner.nextInt();

			if (selection == 1) {
				System.out.println("Hello :)\n");
			}
			else if (selection == 2) {
				System.out.println("My favorite foods are apple, banana, and coconut.\n");
			}
			else if (selection == 3) {
				System.out.println("Catch ya later!\n");
				break;
			}
			else {
				System.out.println("Invalid selection. Please try again.\n");
			}
		}
		scanner.close();
	}

	public static void printMenu() {
		System.out.println("_____Menu_____");
		System.out.println("1: Say Hello");
		System.out.println("2: List my favorite foods");
		System.out.println("3: Exit");
		System.out.println();
	}
}
