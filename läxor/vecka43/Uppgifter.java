package vecka43;

import java.util.Scanner;

public class Uppgifter {

	public static void main(String[] args) {

		lol();
		max();
		count();
		kelvinToCelsius();
		farenteitToCelcius();
		ageControl();
		stair();
	}

	public static void lol() {

		System.out.println("HAHAHAHAHAHAHA");

	}

	public static int max() {

		int tal1;
		int tal2;

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in 2 heltal.");
		tal1 = input.nextInt();
		tal2 = input.nextInt();

		int st�rstatal;
		if (tal1 >= tal2) {
			System.out.println("St�rsta talet �r " + tal1);
			st�rstatal = tal1;
		} else {
			System.out.println("St�rsta talet �r " + tal2);
			st�rstatal = tal2;
		}

		return st�rstatal;
	}

	public static int count() {

		System.out.println("Skriv in ett nummer.");
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int start = 1;

		while (start <= n) {

			System.out.println(start);
			start += 1;
		}
		return start;
	}

	public static double kelvinToCelsius() {

		Scanner input = new Scanner(System.in);
		double kelvin = input.nextDouble();
		double celsius;

		celsius = kelvin + 273.15;
		System.out.println(celsius);

		return celsius;

	}

	public static double farenteitToCelcius() {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in farenheight");
		double f = input.nextDouble();
		double c = (f - 32) / 1.8;
		System.out.println(c);
		return c;
	}

	public static int ageControl() {

		Scanner input = new Scanner(System.in);
		System.out.println("Skriv ut din �lder.");
		int age = input.nextInt();

		if (age <= 5) {
			System.out.println("Sm�barn f�r inte g�ra n�got.");
		} else if (age <= 12) {
			System.out.println("Du f�r spela Fortnite.");
		} else if (age <= 14) {
			System.out.println("Du �r ton�ring.");
		} else if (age <= 17) {
			System.out.println("Du f�r k�ra moppe.");
		} else if (age <= 20) {
			System.out.println("Du f�r k�ra bil.");
		} else if (age <= 64) {
			System.out.println("Du f�r vuxenstraff om du g�r n�got dumt.");
		} else if (age <= 99) {
			System.out.println("Du �r pension�r.");
		} else {
			System.out.println("R.I.P?");
		}

		return 0;
	}

	public static int stair() {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in antal trappsteg.");
		
		int antalstairs = input.nextInt();
		
		for (int startv�rde = 0; startv�rde< antalstairs; startv�rde++) {
			
			for(int antalmellanrum = 1; antalmellanrum<antalstairs-startv�rde;antalmellanrum++) {
				System.out.print(" ");
			}
			for(int antalx=0; startv�rde>=antalx; antalx++) {
				System.out.print("X");
			}
		System.out.println();
		}
	return 0;
	}
}