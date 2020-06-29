// ---------------------------------------------------------------------------------------------------------------------
// Assignment 1
// Written by: Mohammad Ali Zahir 40077619
// For COMP 248 Section EC – Summer 2019
// Comments: Make a program which allows reverse the order of three user string inputs while changing their letter case
// ---------------------------------------------------------------------------------------------------------------------


import java.util.Scanner;

public class A1Q2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\\\\-------------------------------------"); // Welcoming message
		System.out.println("\\\\ String Splitter Program");
		System.out.println("\\\\-------------------------------------");
		System.out.println();
		
		System.out.println("Enter 3 words seperated by a blank: "); //Prompts the user the string's input (s1,s2,s3 are said inputs)
		String s1 = input.next();
		String s2 = input.next();
		String s3 = input.next();
		String s4 = s3.substring(0, 1).toUpperCase() + s3.substring(1).toLowerCase(); // This statement changes the first letter of the last input to a capital and the rest of the letters as lower case 
		String s5 = s2.toLowerCase();		// For both s5 and s6, it changes the whole string s1 and s2 to lower-case											
		String s6= s1.toLowerCase();
		System.out.println();
		System.out.println("Words in reverse order:");
		System.out.println(s4 +" "+ s5 +" "+ s6); // The " " is to indicate the space between each input 
		System.out.println();
		System.out.println("All done!"); // Ending message 
		
		input.close();
		
	
		
		
		
	}

}
