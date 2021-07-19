package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		int option = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("This is a unit converter.");
		
		do {			
			System.out.println("Please select an option:");
			System.out.println("1. Meters to centimeters");
			System.out.println("2. Kilometers to meters");
			System.out.println("3. Kilograms to grams");
			System.out.println("4. Quit");
			
			option = input.nextInt();
			
			switch (option) {
				case 1: mToCm();
				break;
				case 2: kmToM();
				break;
				case 3: kgToG();
				break;
				case 4: System.out.println("Have a nice day.");
				break;
				default: System.out.println("Invalid input.  Please try again.");
			}
		} while(option != 4);
	}
	
	public static void mToCm() {
		long m, cm;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input quantity of meters to convert to centimeters.");
		m = input.nextLong();
		
		cm = 100 * m;
		
		System.out.println(m + " meter(s) is " + cm + " centimeter(s).");
		}
	
	public static void kmToM() {
		long km, m;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input quantity of kilometers to convert to meters.");
		km = input.nextLong();
		
		m = 1000 * km;
		
		System.out.println(km + " kilometer(s) is " + m + " meter(s).");
	}

	public static void kgToG() {
		long kg, g;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input quantity of kilograms to convert to grams.");
		kg = input.nextLong();
		
		g = 1000 * kg;
		
		System.out.println(kg + " kilogram(s) is " + g + " gram(s).");
	}

}
