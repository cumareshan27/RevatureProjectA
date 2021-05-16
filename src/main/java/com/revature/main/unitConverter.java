package com.revature.main;

import java.util.Scanner;




public class unitConverter {
	
	public static int cupsToTeaspoon() {
		// there are 48 teaspoon in 1 cup
		
		System.out.println("Please enter number of cups to convert");
		Scanner noofcups = new Scanner(System.in);
		int cup = noofcups.nextInt();
		
		//int cup = 48;
		int  nooftsb = cup * 48;
		System.out.println("There are " + nooftsb + " teaspoons in " + cup +"cups");
		//the .close is not accessbile because it is closed by the one at the main method. 
		//noofcups.close();
		return nooftsb;
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		int choice = 0;
		
		System.out.println("Please seelct an option");
		System.out.println("1. Cups to Teaspooons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Exit");
		
		Scanner selection = new Scanner(System.in);
		choice = selection.nextInt();
		//selection.close();
		
		
		
		while(choice != 4) {
			
			switch(choice) {
			case 1:
				System.out.println("Your selction was " + choice);
				cupsToTeaspoon();
				break;
			case 2:
				System.out.println("Your selction was " + choice);
			case 3:
				System.out.println("Your selction was " + choice);
			case 4:
				System.out.println("Your selction was " + choice + "This app is closed now");
			default:
				System.out.println("Entered an incorrect choice");
				
			}
			// app was running continuously to stop that I added the break
			break;
		}
		selection.close();
	}
	
}
