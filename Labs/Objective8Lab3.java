public class Objective8Lab3 {
	public static void main (String[] args) {
		int counter = 1; // This line isn't necessary since we are using a for loop.

		for (int i = 1; i <= 20; i++) {
			String oddOrEven = "unknown";
			
			if (i % 2 == 0) {
				oddOrEven = "even";
			}
			else {
				oddOrEven = "odd";
			}

			System.out.println(i + " is " + oddOrEven + ".");
		}
	}
}
