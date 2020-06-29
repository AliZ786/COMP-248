// -----------------------------------------------------
// Assignment #1 - 

// File name: Military Time.java
// Written by: Nancy Acemian
// Edited by: Mohammad Ali Zahir - 40077619
// Comp 248 - Summer 2019
// -----------------------------------------------------
import java.util.Scanner;
public class MilitaryTime {
	public static void main(String[] args) {

		Scanner keyIn = new Scanner(System.in);
		final int const1 = 60;          // Constant used to get standard time value for the time difference
		final int const2 = 100;         // Constant used to get standard time for the start and end time 
		int Start_time, End_time, Time_diff;
		int Start_hours, End_hours, Start_mins, End_mins, Hour_diff, Min_diff;
		System.out.print("Enter starting time and ending time in military notation: "); //Prompts user to enter value of start and end time 
		Start_time = keyIn.nextInt();
		End_time = keyIn.nextInt();
		
		Start_hours = Start_time/const2;   // Hours for the start time 
		End_hours = End_time/const2;       // Hours for the end time 
		Start_mins = Start_time%const2;    // Minutes for start time 
		End_mins = End_time%const2;        // Minutes for end time
		
		Start_time = Start_hours*const1+Start_mins;  // Transforms Start_time into total minutes
		End_time = End_hours*const1+End_mins;        // Transforms End_time into total minutes 
		Time_diff = End_time-Start_time;
		Hour_diff = Time_diff/const1;          // Divided by 60 which gives us hours 
		Min_diff = Time_diff%const1;           // Modulo by 60 which gives us minutes
		System.out.println( "Results "+ Hour_diff+ '\t' + Min_diff);
		
		keyIn.close();
	}
}