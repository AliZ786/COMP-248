// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Assignment 3
// Written by: Mohammad Ali Zahir 40077619
// For COMP 248 Section EC – Summer 2019
// Comments: Make a program which allows me to print an array based on instructions for different indexes, then get the sum for different parts of the array
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
public class A3Q1 {
	public static void main (String args[]) {

		System.out.println(String.format("%5s", "")+"--------------------------------------------------"); // Header of the question 
		System.out.println(String.format("%4s", "")+"\t"+"Let's practice manipulating a 2D array");
		System.out.println(String.format("%5s", "")+"--------------------------------------------------");

		A3Q1 mat = new A3Q1(); // Mat is an instance of A3Q3
		Scanner input = new Scanner(System.in);
		int size;

		do {  // This loop would continue running until the input we give is bigger than 3 
			System.out.print("What size square array do you want? (must be >= 3) ");
			size = input.nextInt();

		}while (size <3);



		int[][] sqArr =  mat.createArray(size); // Creates an array based on the method createArray
		System.out.println();
		System.out.println("The array looks like the following:");
		mat.printArray(sqArr); // Prints the array based on the method printArray

		System.out.println("\nSum of all the elements of the " +size+ "x" +size+ " array is "+mat.getSum(sqArr)); // Statement that returns sum of all elements in an array

		System.out.println("\nDiagonal from top left to bottom right contains:");
		int[] leftDiagArr = mat.getTopLefttoBottomRight(sqArr);  //  This statement generates the 1D - Array to get the diagonal from top left to bottom right
		System.out.println(mat.arrayToString(leftDiagArr)+"\t Sum is "+mat.getSum(leftDiagArr));

		System.out.println("\nDiagonal from top right to bottom left contains:");
		int[] rightDiagArr = mat.getTopRightToBottomLeft(sqArr); //This statement generates the 1D-Array to get the diagonal from top right to bottom left
		System.out.println(mat.arrayToString(rightDiagArr)+"\t Sum is "+mat.getSum(rightDiagArr));

		System.out.println("\nTop row contains:");
		int[] topRow = sqArr[0]; //This statement generates the 1D-Array for the top row sqArr[0], where 0 is the number of the row 
		System.out.println(mat.arrayToString(topRow)+"\t Sum is "+mat.getSum(topRow));

		System.out.println("\nBottom row contains:");
		int[] bottomRow = sqArr[size-1]; //This statement generates the 1D-Array for the bottom row sqArr[size-1], where size is the number that we input -1 so that we the last row 
		System.out.println(mat.arrayToString(bottomRow)+"\t Sum is "+mat.getSum(bottomRow));

		System.out.println("\nFirst column contains:");
		int[] firstColumn = mat.getColumn(sqArr, 0); // Statement that prints the first vertical row of your array
		System.out.println(mat.arrayToString(firstColumn)+"\t Sum is "+mat.getSum(firstColumn));

		System.out.println("\nLast column contains:");
		int[] lastColumn = mat.getColumn(sqArr, size-1); // Statement that prints the last vertical row of your array 
		System.out.println(mat.arrayToString(lastColumn)+"\t Sum is "+mat.getSum(lastColumn));


		System.out.println("\nThat was a good exercise in manipulating a 2D-Array!"); // Closing message 
		
		input.close();
	}


	private int [][] createArray (int size){ // Method that is used to create the array 
		int sqArr [][] = new int[size][size];

		for (int i =0 ; i <size; i++) {
			for (int j = 0 ; j < size; j++)
				if (i==j) {
					sqArr [i][j] =0;

				}else if ((i+j) % 2 !=0) {
					sqArr [i][j] = i+j;

				}else if ((i+j) % 2 ==0) {
					sqArr [i][j] = 2*i -j;
				}
		}
		return sqArr;
	}

	public static void printArray(int [] [] sqArr) {// Method that is used to print the array 
		int length = sqArr.length;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(sqArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static String arrayToString(int[] leftDiagArr){ // Method that convert the leftDiagArr to a string 

		String s = "";
		for(int i = 0; i < leftDiagArr.length; i++){
			s += leftDiagArr[i] +"\t";
		}
		return s;


	}
	private int getSum(int[][] sqArr) { // Method that returns the sum for a 2D-Array
		int sum =0;
		for (int i =0 ; i < sqArr.length; i++) {
			for(int j =0 ; j < sqArr[0].length; j++) {
				sum += sqArr[i][j];  
			}

		}
		return sum;

	}
	private int getSum(int[] sqArr){ // Method that returns the sum for a 1D-Array
		int sum = 0;
		for(int i = 0; i < sqArr.length; i++){
			sum = sum+ sqArr[i];
		}
		return sum;
	}
	private int[] getTopLefttoBottomRight(int [][] sqArr) { // Method that returns the 2D-Array for the top left to bottom right diagonal
		int[] leftDiag = new int[sqArr.length];

		for (int i =0 ; i < sqArr.length; i++) {
			leftDiag[i] = sqArr[i][i];
		}

		return leftDiag;
	}

	private int[] getTopRightToBottomLeft(int [][] sqArr) { //Method that returns the 2D-Array for the top right to bottom left diagonal
		int[] rightDiag = new int[sqArr.length];
		int index = 0;

		for (int i =sqArr.length-1 ; i >=0; i--) {
			rightDiag[i] = sqArr[i][index];
			index++;
		}
		return rightDiag;
	}
	private int[] getColumn(int[][] arr, int columnIndex){ // This method returns the 2D-Array of the column of your matrix
		int columnArr[] = new int[arr.length];

		for(int i = 0; i < arr.length ; i++){
			columnArr[i] = arr[i][columnIndex];
		}

		return columnArr;
	}



}




