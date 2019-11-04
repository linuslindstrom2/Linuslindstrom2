package Uppgifter;

import java.util.Scanner;

public class uppgift3 {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		boolean repeat = true;
		int sum = 0;
		double mede = 0;
		double antal = 0;

		while (repeat) {
			System.out.println("Skriv in ett heltal.");
			double tal = input.nextInt();

			if (tal == 0) {
				repeat = false;
			} else {
				antal++;
				sum += tal;
			}
		}
		mede = sum / antal;
		System.out.println(sum);
		System.out.println(mede);
	}
}
