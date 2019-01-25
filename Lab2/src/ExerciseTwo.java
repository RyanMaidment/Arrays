/*
Name: Ryan Maidment
Course & Section: CST8132 310
Assignment: Lab 2
Date: Jan 24, 2018
*/
import java.util.Arrays;

public class ExerciseTwo {

	int row = 10;		 //row size
	int column = 6;		//column size
	int[][] myArray = new int[column][row];

	public static void main(String[] args) {

		ExerciseTwo exerciseTwo = new ExerciseTwo();

		exerciseTwo.printArrayValues();
		exerciseTwo.printArrayTotal();
	}

	public ExerciseTwo() {
		int counter = 1;
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[0].length; j++) {
				myArray[i][j] = counter;	//counts up to 6*10.
				counter++;
			}
		}
	}

	public void printArrayValues() {
		System.out.println("myArray = { ");
		System.out.print(Arrays.deepToString(myArray).replace("], ","]\n").replace("[[","[").replace("]]","]"));
		System.out.println("\n};");
		/*
		 * https://stackoverflow.com/questions/19648240/java-best-way-to-print-2d-array
		 * .replace is much easier then using if statments.
		 */
	}

	public void printArrayTotal() {
		int sum = 0;
		for (int row = 0; row < myArray.length; row++) {
			for (int column = 0; column < myArray[row].length; column++) {
				sum = sum + myArray[row][column];	//adds array elements together. 
			}
		}
		System.out.println("The sum of all elements of myArray is " + sum+".");
	}
}
