public class Objective3Lab2 {
	public static void main (String[] args) {
		double side1, side2, hypotenuse;

		side1 = 2;
		side2 = 3;
		hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

		System.out.println("A right triange with sides of length " + side1 + " and " + side2 + " has a hypotenuse of " + hypotenuse + ".");
	}
}
