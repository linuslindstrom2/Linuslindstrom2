
public class Måndag {

	public static void main(String[] args) {

		// % == Modulus

		int tal1 = 47;
		int tal2 = 19;
		int tal3 = 69;
		int tal4 = -137;

		System.out.println(tal1 % 3 + "\n"); // Testar ifall tal1 är delbart med 3.
												// Om det går blir svaret 0.
												// Om inte så anges rest.
		int sum = 0;

		for (int i = 0; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);

				sum += i;
			}
		}

		System.out.println("Totalsumman av alla tal mellan 0 och 100 är" + " " + sum);

		int turn = 0;

		while (true) {

			turn++;

			if (turn % 3 == 0) {
				System.out.println("Davids tur.");
			} else if (turn % 3 == 1) {
				System.out.println("Johans tur.");
			} else if (turn % 3 == 2) {
				System.out.println("Lucas tur.");
			}

			if (turn == 10) {
				break;
			}
		}
	}
}
