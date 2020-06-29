// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Assignment 3
// Written by: Mohammad Ali Zahir 40077619
// For COMP 248 Section EC – Summer 2019
// Comments: Make a program which allows me to print a random array of complex numbers , while being able to get sum, product, the minimum and the maximum of the array. It also allows to change the sign.
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class A3Q3 {

	static double randomDouble() {  // Method used to generate a random number 
		double randomDouble = Math.random();
		randomDouble = randomDouble * 100;
		double randomDoubleSign = Math.random();
		if (randomDoubleSign <= 0.5)
		{
			randomDouble = randomDouble * (-1);
		}
		return randomDouble;
	}
	public static void main(String args[]) {
		
		randomDouble();
		System.out.println(randomDouble());

		System.out.println(String.format("%5s", "") +"------------------------------------------------------"); // Header of the program
		System.out.println(String.format("%4s", "")+"\t"+"Let's play with arrays of complex number objects!");
		System.out.println(String.format("%5s", "") +"------------------------------------------------------");

		Scanner input = new Scanner(System.in);
		int num;


		do
		{ // This would prompts the user to enter a number for the size of the array until it meets the condition of the loop
			System.out.print("How many complex numbers do you want (max of 12 at least 4): ");
			num = input.nextInt();
		}
		while (num > 12 || num < 4);

		System.out.println("Here are the complex numbers generated:");


		Complex [] arr = new Complex[num]; // Array of random complex object created here 
		double randReal = 0.0;
		double randImag = 0.0;
		for (int i = 0; i < arr.length -2; i++ ) {
			randReal = randomDouble();
			randImag = randomDouble();
			arr[i] = new Complex (randReal,randImag);

		}


		int randomInt =0;

		while(true) { // This loop returns the second last index of the complex array
			randomInt = (int) (Math.random()*num);
			if (randomInt <= num-3) {
				arr [arr.length-2] = arr[randomInt];
				int y = randomInt; // Deep copy for the second last index
				arr [y] = new Complex (arr[randomInt]);
				break;

			}
		}
		while(true) { //// This loop returns the last index of the complex array
			randomInt = (int) (Math.random()*num-1);
			if(randomInt <= num-2) {
				arr[arr.length-1] = arr[randomInt];
				int y = randomInt; // Deep copy for the last index
				arr [y] = new Complex (arr[randomInt]);
				break;
			}
			System.out.println(arr[num]); // This prints the array 
		}

		Complex sum = new Complex(0,0);// This creates a new Complex object called sum which stores the sum of all values in the array
		Complex product = new Complex (1,1); // This creates a new Complex object called product which stores the product of all values in the array


		for(int i =0; i < arr.length;i++) {// This prints out the array with every index location
			sum = sum.addition(sum, arr[i]); // Add all objects in the array
			product = product.multiplication(product, arr[i]); //Multiplies all objects in the array
			System.out.println("In index location "+i+ " is complex number " +arr[i] );

		}


		int smallest = 0;

		for (int i =1; i < arr.length; i++) { // This loop allows us to find the smallest number by using our method findSmaller
			boolean small = A3Q3.findSmaller(arr[i], arr[smallest]);
			if(small==true) {
				smallest = i;
			}

		}

		System.out.println("\nThe smallest complex number is in index location "+smallest+" and is " + arr[smallest]);


		int largest = 0;

		for (int j =1; j < arr.length; j++) { // This loop allows us to find the largest number by using our method findLarger
			boolean large = A3Q3.findLarger(arr[j],arr[largest]);
			if(large==true) {
				largest = j;
			}
		}
		System.out.println("\nThe largest complex number is in index location "+largest+" and is "+arr[largest]); //Displays smallest number 

		System.out.println("\nThe sum of all complex numbers is "+sum); // Displays sum 

		System.out.println("\nThe product of all complex numbers is "+product.toString()); // Displays product 

		System.out.println("\nHere are the complex numbers with real numbers changed:"); 

		for (int i = 0; i < arr.length; i++) { // This loop changes the sign of the real part of the number when index is even
			if (i %2 ==0) {
				arr[i].setReal(arr[i].getReal()*-1);
			}
			System.out.println("In index location "+i+ " is complex number " +arr[i] );		

		}

		System.out.println("\nHere are the complex numbers with imaginary numbers changed:");


		for (int i = 0; i < arr.length; i++) { // This loop changes the sign of the imaginary part of the number when index is odd
			if (i %2 !=0) {
				arr[i].setImaginary(arr[i].getImaginary()*-1);
			}
			System.out.println("In index location "+i+ " is complex number " +arr[i] );		

		}
		System.out.println("\nYou should now be comfortable with creating arrays of objects, right?" +"\n" + // Closing message 
				"And static methods in a driver, right ?" +"\n"+
				"OKAY, you are now ready for the final exam."); 
	}


	public static boolean findSmaller(Complex C1,Complex C2) { // Method used to determine the smaller Complex object between the two 
		if (C1.getReal() == C2.getReal() && C1.getImaginary() < C2.getImaginary()) {
			return true;

		}else if (C1.getReal() < C2.getReal()) {
			return true;
		}
		return false;

	}
	public static boolean findLarger(Complex C1, Complex C2) { // Method used to determine the larger Complex object between the two
		if (C1.getReal()==C2.getReal() && C1.getImaginary() > C2.getImaginary()) {
			return true;

		}else if (C1.getReal() > C2.getReal()) {
			return true;
		}
		return false;


	}









}	











