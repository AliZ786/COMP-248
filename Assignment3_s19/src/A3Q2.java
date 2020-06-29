// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Assignment 3
// Written by: Mohammad Ali Zahir 40077619
// For COMP 248 Section EC – Summer 2019
// Comments: Make a program which allows me to manipulate the a complex number (get its sum, adding another, multiplying with another number)
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class A3Q2 {
	public static void main (String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.println(String.format("%5s", "") +"--------------------------------------"); // Header of the program
		System.out.println(String.format("%4s", "")+"\t"+"Let's play with complex numbers!");
		System.out.println(String.format("%5s", "") +"--------------------------------------");

		Complex obj1 = new Complex();
		Complex obj2 = new Complex(obj1);

		System.out.println("\nComplex number created with default constructor is: " +obj2.toString()); // Prints the complex number based on your default constructor 


		System.out.print("Enter the real part of the 2nd complex number: "); // Prompts the user to enter the real part of the complex number
		double r = input.nextDouble();
		System.out.print("Enter the imaginary part of the 2nd complex number: "); // Prompts the user to enter the imaginary part of the complex number 
		double i= input.nextDouble();
		System.out.println("Entered complex number is: " +r+" + "+i+"*i"); // Prints the complex number based on user input 
		


		Complex obj3 = new Complex(r,i); // Creates a complex object to see the equality of the 2 previous complex numbers
		boolean obj4 = obj3.equals(obj2);
		String eq ="0";

		if(obj3.equals(obj2)==false) { 
			eq = "not equal";

		}else  
			eq = "equal";


		System.out.println("\nThe complex numbers "+obj2.toString()+ " and " +r+ " + " +i+ "*i " + "are " +eq+"."); // Statement that prints if the two number are equal or not

		double temp = r; // This line of code swaps the imaginary and real parts of the complex number  (Line 1)
		r = i;           // (Line 2)
		i = temp;       // (Line 3)

		System.out.println("\nSwapping the real and imaginary part of "+obj3.toString()+ " results in " +r+" + " +temp+ "*i"); // Prints statements with real and imaginary swapped

		Complex obj5 = new Complex (r,i);
		boolean obj6 = obj5.equals(obj5);

		System.out.println(obj5.toString() + " is equal to " +obj5.toString()+ " is now " +obj6); // Check if the swapped objects are now equal


		System.out.print("\nEnter a number please: "); // Prompts the user for a number to add to the swapped complex number 
		double num = input.nextDouble();
		

		Complex obj7 = new Complex(r,i);
		Complex obj8 = new Complex(num,num);
		Complex sum = new Complex();  // Object sum created to add complex numbers 
		sum = sum.addition(obj7, obj8);
		System.out.println(obj5.toString()+ " has been changed to " +sum.toString()); // Displays the sum of the complex objects
		
		if (obj5.equals(sum)==false) { // Checks equality of complex numbers 
			eq= "not equal";
			
			
		}else 
			eq = "equal";
		
		
		System.out.println("The complex numbers "+sum.toString()+" and " +obj5.toString()+ " are " +eq+"."); // Displays if they are equal or not 
		
		Complex sum1 = new Complex();
		sum1 = sum1.addition(sum, obj5); 
		
		System.out.println("\nAdding "+sum.toString()+ " to "+obj5.toString()+" results in the complex number "+sum1.toString());
		
		Complex product = new Complex(); // Object product created to multiply complex numbers
		product = product.multiplication(sum1, obj5);
		
		System.out.println("Multiplying "+sum1.toString()+" by "+obj5.toString()+" results in the complex number "+product.toString()); // Displays product
		
		System.out.println("\nSo after all this manipulation the original complex have morphed into"+"\n"
		+sum1.toString()+ " and "+product.toString()); // Displays both final sum and product
		
		System.out.println("\nYou should now be comfortable with defining a class and manipulating objects, right?"+"\n"
		+"On to bigger and better things...");  // Closing message 
		
		
		input.close();

	}}




































