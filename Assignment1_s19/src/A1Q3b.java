// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Assignment 1
// Written by: Mohammad Ali Zahir 40077619
// For COMP 248 Section EC – Summer 2019
// Comments Make a program (modify) which allows the user to enter a starting and an ending time to calculate the elapsed time between the two and determine what moment of the day they fall into. 
// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



import java.util.Scanner;

public class A1Q3b {
	public static void main (String args[]) {
		Scanner keyIn = new Scanner(System.in);
		final int const1 = 60;          // Constant used to get standard time value for the time difference
		final int const2 = 100;         // Constant used to get standard time for the start and end time 
		int Start_time, End_time, Time_diff;
		int Start_hours, End_hours, Start_mins, End_mins, Hour_diff, Min_diff;
		System.out.println("\\--- Tic--- Toc--- Tic- Toc--- Tic-- Toc---\\"); //Welcoming message
		System.out.println("\\                                          \\");
		System.out.println("\\    Elapsed Time Calculator - Version 2   \\");
		System.out.println("\\                                          \\");
		System.out.println("\\--- Tic--- Toc--- Tic- Toc--- Tic-- Toc--- \\");
		System.out.println();
		System.out.print("Enter starting time and ending time in military notation: "); //Prompts user to enter value of start and end time 
		Start_time = keyIn.nextInt();
		End_time = keyIn.nextInt();

		String moment1 = "0";
		String moment2 = "0";

		if(Start_time < 0600)  //If statement to display moment of the day for the start time 
			moment1 = "in the middle of the night";

		else if (Start_time >= 0600 && Start_time < 1200) 
			moment1 = "in the morning";

		else if(Start_time >=1200 && Start_time < 1800) 
			moment1 ="during the day";

		else 
			moment1 = "in the evening";


		if(End_time <0600) {    // If statement to display the moment of the day for the end time 
			moment2 = "in the middle of the night";

		}else if(End_time >= 0600 && End_time < 1200 ) {
			moment2 ="in the morning";

		}else if(End_time >=1200 && End_time < 1800) {
			moment2 ="during the day";

		}else 
			moment2 = "in the evening";

		if (End_time < Start_time) { // This statement would only occur when end time is less than start time and it would add 2400 to end time for the time difference calculation
			End_time +=2400;
		}



		Start_hours = Start_time/const2;   // Hours for the start time 
		End_hours = End_time/const2;       // Hours for the end time 
		Start_mins = Start_time%const2;    // Minutes for start time 
		End_mins = End_time%const2;        // Minutes for end time

		Start_time = Start_hours*const1+Start_mins;  // Transforms Start_time into total minutes
		End_time = End_hours*const1+End_mins;        // Transforms End_time into total minutes 
		Time_diff = End_time-Start_time;
		Hour_diff = Time_diff/const1;          // Divided by 60 which gives us hours 
		Min_diff = Time_diff%const1;           // Modulo by 60 which gives us minutes
		
		System.out.println();
		System.out.println("Your activity started " + moment1 + " and ended " +moment2+ " and took " +Hour_diff+ " hours and " +Min_diff+ " minutes."); //Statement that prints the required message
		System.out.println();
		System.out.println("All done!"); // Ending message

		keyIn.close();

	}
}
