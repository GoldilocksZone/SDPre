public class Objective7Lab3 {
	public static void main (String[] args) {
		int counter = 1;

		while (counter <= 20) {
			String oddOrEven;

			if (counter % 2 == 0) {
				oddOrEven = "even";
			}
			else {
				oddOrEven = "odd";
			}

			System.out.println(counter + " is " + oddOrEven + ".");

			counter++;
		}
	}
}
