package vecka38;

import java.util.Scanner;

public class lektion1 {

	public static void main(String[] args) {

		// villkor
		boolean again = true;
		boolean svar = true;
		int age = 0; // initierat variabel

		Scanner input = new Scanner(System.in); // g�r det m�jligt att f� input fr�n konsollen

		if (again) {

			System.out.println("Hur gammal �r du?");
			age = input.nextInt();

			if (age >= 18) {
				System.out.println("Du �r gammal nog att k�ra bil! Grattis din j�vel!");
				System.out.println("Bara s� du vet s� f�r du �ka moppe ocks�");
			} else if (age > 14 && age < 18) {
				System.out.println("Du �r f�rung f�r att k�ra bil, men du f�r �ka moppe.");

			} else {
				System.out.println("Tyv�rr, du f�r v�nta ett tag till.");
			}

		}
	}
}
