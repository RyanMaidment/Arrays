/*
Name: Ryan Maidment
Course & Section: CST8132 310
Assignment: Lab 2
Date: Jan 24, 2018
*/
import java.text.DecimalFormat;

public class ExerciseOne {

	int[] myArray;
	int i;
	DecimalFormat df = new DecimalFormat();

	public static void main(String[] args) {

		ExerciseOne one = new ExerciseOne();

		one.printArrayValues();
		one.displayArrayProduct();

	}

	public ExerciseOne() {

		myArray = new int[10];

	}

	public void printArrayValues() {

		for (i = 0; i <= myArray.length +1; i++) {

			if (i <=0) {
				System.out.print("myArray = {");
			}
			else if ( i <= myArray.length) {		//formatting array values.
				System.out.print( i + ",");
			}
			else if (i == myArray.length +1) {
				System.out.print("};");
			}
		}

	}

	public void displayArrayProduct() {

		int product = 1;

		for (i = 1; i <= myArray.length; i++) {
			product *= i;	//multiplies the elements of the array.
		
		}
		System.out.println("\nThe product of all elements of my Array is " +df.format(product) + ".");
	}
}
