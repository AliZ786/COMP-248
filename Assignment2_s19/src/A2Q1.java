// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Assignment 2
// Written by: Mohammad Ali Zahir 40077619
// For COMP 248 Section EC – Summer 2019
// Comments: Make a program which allows me to determine which UNO card i have drawn based on type and color. and determine if the valid and entered in the correct format 
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
public class A2Q1 {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.println("     ----------------------------"); //Header message
		System.out.println("      UNO Playing Card Describer");
		System.out.println("     ----------------------------");

		System.out.println(); // Extra system out statement to create space 


		System.out.println("Enter your playing card using the following notation:"); // Message explaining rule of how to enter card data
		System.out.println("First character should be 0 to 9, W (for Wild), D (for Draw 2), S(for Skip), or V (for Reverse)");
		System.out.println("Second character should be R for red, G for green, B for blue or y for yellow");
		System.out.println();
		System.out.println("What is your card?");

		String word = input.next(); // Declaration of the scanner variable 
		String upperWord = word.toUpperCase(); // Make sure it checks both lower and upper case 




		if (word.length() > 2) { // Special case 1 : If more than 3 characters, it will print this
			System.out.println();
			System.out.println("You entered " + word + " which is not entered in the required format");
			System.exit(0);
		}

		if (word.length() ==1 && upperWord.charAt(0) != 'W') { // Special case 2 : If the first character is not W, then it will print this
			System.out.println();
			System.out.println("You entered " + word + " which is not a valid Uno card");
			System.exit(0);

		}else if (word.length() ==1 && upperWord.charAt(0) == 'W') {// Special case 3 : If the first character is 'W', then print this
			System.out.println();
			System.out.println("You entered " + word + " which is " + "Wild");
			System.exit(0);

		}
		if (upperWord.equals("W4") ) { // Special case 4 : If the word is "W4", then print this
			System.out.println();
			System.out.println("You entered " + word + " which is" + " Wild Draw 4");
			System.exit(0);

		}
		String selec1 = "" + upperWord.charAt(0);
		String selec2 = "" + upperWord.charAt(1);


		switch(selec1) { // Switch statement for the first character (the type of card)

		case "0" : // Case 0 to 9 is for the numbers
			selec1 = "Zero";
			break;

		case "1":
			selec1 = "One";
			break;

		case "2" :
			selec1 ="Two";
			break;

		case "3" :
			selec1 = "Three";
			break;

		case "4" :
			selec1 = "Four";
			break;

		case "5" :
			selec1 ="Five";
			break;

		case "6" :
			selec1 = "Six";
			break;

		case "7" : 
			selec1 = "Seven";
			break;

		case "8" :
			selec1 ="Eight";
			break;

		case "9" :
			selec1 = "Nine";
			break;

		case "D" :  // Case D is to change to Draw 2 
			selec1 = "Draw 2" ;
			break;

		case "S": // Case S is to change to Skip 
			selec1 = "Skip";
			break;

		case "V" :  // Case V is to change to Reverse 
			selec1 = "Reverse";
			break;

		default: // This case would only occur when it goes through to none of the cases in the switch statement, hence the card was written in an improper way
			System.out.println(); 
			System.out.println("You entered " + word + " which is not a valid Uno card");
			System.exit(0);
			break;

		}


		switch(selec2) { // Switch statement for the second character (card color)

		case "R" : 
			selec2 = "Red";
			break;

		case "G" : 
			selec2 = "Green";
			break;

		case "B" : 
			selec2 = "Blue";
			break;

		case "Y" : 
			selec2 = "Yellow";
			break;

		default:
			System.out.println(); // Would print if it goes through none of the case, hence written in an improper way
			System.out.println("You entered " + word + " which is not a valid Uno card");
			System.exit(0);
			break;
		}
		System.out.println();
		System.out.println("You entered " + word + " which is " + selec1 + " " + selec2); // This would print when the program goes through both switch statements and not to the special cases




	}
}
