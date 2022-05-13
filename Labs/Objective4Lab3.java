import java.util.Scanner;

public class Objective4Lab3 {
	public static void main (String[] args) {
		int birthYear, age, currentYear;

		birthYear = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("How old are you?");
		age = keyboard.nextInt();

		java.time.LocalDate currentDate = java.time.LocalDate.now();
		java.time.format.DateTimeFormatter dateFormat =
			java.time.format.DateTimeFormatter.ofPattern("yyyy");
		currentYear = Integer.parseInt(currentDate.format(dateFormat));
		birthYear = currentYear - age;
		
		System.out.println("You were born in " + birthYear + ".");
		keyboard.close();
	}
}
