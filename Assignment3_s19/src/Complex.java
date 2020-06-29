// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Assignment 3
// Written by: Mohammad Ali Zahir 40077619
// For COMP 248 Section EC – Summer 2019
// Comments: This class is used to make the Complex class, where we create methods that are going to be used in question 2 and 3 of this assignment 
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------



public class Complex {

	private double real;
	private double imaginary;


	public Complex(){ // Default constructor
		this.real = 0.0;
		this.imaginary = 0.0;

	}

	public Complex(double real, double imaginary) { // Constructor sets the instance variables to be the same as the passed Complex object.
		this.real = real;
		this.imaginary = imaginary;

	}
	public Complex(Complex copy) { // Copy constructor
		this.real = copy.getReal();
		this.imaginary = copy.getImaginary();

	}

	public double getReal() {// Returns the real value
		return real;

	} 

	public double getImaginary() { // Returns the imaginary value
		return imaginary;

	}

	public void setReal(double real) { // Sets a value to the variable real
		this.real=real;
	}

	public void setImaginary (double imaginary) { // Sets a value to variable imaginary
		this.imaginary = imaginary;

	}

	public Complex addition(Complex C1, Complex C2) { // Method that returns the sum of complex numbers
		Complex add = new Complex();
		add.real = C1.real + C2.real;
		add.imaginary = C1.imaginary + C2.imaginary;
		return add;

	}

	public static Complex multiplication(Complex a, Complex b) { //Method that returns the product of complex numbers
		Complex c = new Complex(0.0,0.0);
		c.real = (a.real*b.real -a.imaginary*b.imaginary);
		c.imaginary = (a.real*b.imaginary+a.imaginary*b.real);

		return c;
	}
	public String toString() {
		if (imaginary < 0) {
			return "" + String.format("%.2f", real) + " + " + "-" + String.format("%.2f", Math.abs(imaginary)) + "*i";
		} else {
			return "" + String.format("%.2f", real) + " + " + String.format("%.2f", Math.abs(imaginary)) + "*i";
		}
	}

	public boolean equals(Object obj) { // Method to see if two complex numbers are equal
		if (obj != null && obj instanceof Complex) {
			Complex copy = (Complex) obj;
			return real == copy.real  && imaginary == copy.imaginary;
		}
		return false;
	}


}








