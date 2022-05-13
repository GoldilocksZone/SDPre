public class Objective3Lab3 {
	public static void main (String[] args) {
		int first, second, third;

		first = (int)(Math.random() * 6) + 1;
		second = (int)(Math.random() * 6) + 1;
		third = (int)(Math.random() * 6) + 1;

		System.out.println(first + " + " + second + " + " + third + " = " + 
			(first + second + third));
	}
}
