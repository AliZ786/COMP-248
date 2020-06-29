// ------------------------------------------------------------------------------------------------------------------------------------
// Assignment 2
// Written by: Mohammad Ali Zahir 40077619
// For COMP 248 Section EC – Summer 2019
// Comments: Make a program which allows to translate a sentence into Ubbi Dubbi language, while following the rules of said language 
// -----------------------------------------------------------------------------------------------------------------------------------



import java.util.Scanner;

public class A2Q2 {
	public static void main (String args []) {

		System.out.println("\\\\--------------------------------------------------------"); // Header message 
		System.out.println("\\\\      Nancy's English to Ubbi Dubbi Translator Program   ");
		System.out.println("\\\\--------------------------------------------------------------");
		System.out.println();

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the English sentence you want translated into Ubbi Dubbi"); // Prompting the user for the sentence 
		System.out.println("(Be sure to have 1 space between words and to not have any spaces at the front and end of sentence):"); // Instruction on how to enter the message
		String sentence = input.nextLine();
		sentence = sentence.trim(); // Removes the space at the beginning and at the end 

		System.out.println("Translated sentence:"); // This prints out the translated string to Ubbi Dubbi language 


		String word="";
		for (int i = 0; i < sentence.length(); i++) { // This loop checks if each character contains a space and then translate if it does 
			if(sentence.charAt(i)==' '){
				System.out.print(translateToUbbi(word)+" ");
				word="";
			}else{ // If not, it would change current character to word 
				word+=sentence.charAt(i);
			}
			if(i==sentence.length()-1){ //If we get to the last character, then it would be print the translation  
				System.out.println(translateToUbbi(word));
				System.out.println("Have fun speaking it!!!!"); // Ending message 



			}
		}
		System.out.println();
	}

	static String translateToUbbi(String word) { // This method would add a ub in front of the word, since there are only a max of 2 characters 
		String ubbi = "";
		if (word.length() <= 2) {
			ubbi += "ub" + word.charAt(0);
			if (word.length() == 2) {
				ubbi += "ub" + word.charAt(1);
			}
			return ubbi;
		}

		boolean prevVowel = false;
		for (int i = 0; i < word.length(); i++) {
			if (isVowel(word.charAt(i)) && !prevVowel) {// This statement would not add ub to the string if the last character is ub 

				if (i == word.length() - 1 && word.charAt(i) == 'e') { // This statement would add ub to the character and append it 
					ubbi += word.charAt(i);
				} else {

					ubbi += "ub" + word.charAt(i); 
				}

				prevVowel = true;
			} else { // If the character contains a vowel , else this is false 

				ubbi += word.charAt(i);

				if (!isVowel(word.charAt(i)))
					prevVowel = false;
			}
		}
		return ubbi;
	}

	static boolean isVowel(char c) { // This method checks if a character is a vowel 
		String vowels = "aeiou";
		String chr = "" + c;
		if (vowels.contains(chr.toLowerCase())) { // Would occur if c is a vowel
			return true; 
		}
		return false; // Would occur if c is not a vowel 
	}
}




