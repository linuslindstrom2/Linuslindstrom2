package vecka38;

import java.util.Scanner;

public class lektion1 {

	public static void main(String[] args) {

		// villkor
		boolean again = true;
		boolean svar = true;
		int age = 0; // initierat variabel

		Scanner input = new Scanner(System.in); // gör det möjligt att få input från konsollen

		if (again) {

			System.out.println("Hur gammal är du?");
			age = input.nextInt();

			if (age >= 18) {
				System.out.println("Du är gammal nog att köra bil! Grattis din jävel!");
				System.out.println("Bara så du vet så får du åka moppe också");
			} else if (age > 14 && age < 18) {
				System.out.println("Du är förung för att köra bil, men du får åka moppe.");

			} else {
				System.out.println("Tyvärr, du får vänta ett tag till.");
			}

		}
	}
}
