package vecka38;

import java.util.Scanner;

public class Läxa2 {

	private static Scanner input;

	public static void main(String[] args) {

		double heltal1 = 0;
		double heltal2 = 0;
		double heltal3 = 0;
		double heltal4 = 0;
		double heltal5 = 0;

		input = new Scanner(System.in);

		System.out.println("Skriv in 5 valfria heltal.");

		heltal1 = input.nextDouble();
		heltal2 = input.nextDouble();
		heltal3 = input.nextDouble();
		heltal4 = input.nextDouble();
		heltal5 = input.nextDouble();

		if (heltal1 >= heltal2 && heltal1 >= heltal3 && heltal1 >= heltal4 && heltal1 >= heltal5) {
			System.out.println("Största heltal:" + "\t" + heltal1);
		} else if (heltal2 >= heltal1 && heltal2 >= heltal3 && heltal2 >= heltal4 && heltal2 >= heltal5) {
			System.out.println("Största heltal:" + "\t" + heltal2);
		} else if (heltal3 >= heltal1 && heltal3 >= heltal2 && heltal3 >= heltal4 && heltal3 >= heltal5) {
			System.out.println("Största heltal:" + "\t" + heltal3);
		} else if (heltal4 >= heltal1 && heltal4 >= heltal2 && heltal4 >= heltal3 && heltal4 >= heltal5) {
			System.out.println("Största heltal:" + "\t" + heltal4);
		} else if (heltal5 >= heltal1 && heltal5 >= heltal2 && heltal5 >= heltal3 && heltal5 >= heltal4) {
			System.out.println("Största heltal:" + "\t" + heltal5);
		}

		if (heltal1 <= heltal2 && heltal1 <= heltal3 && heltal1 <= heltal4 && heltal1 <= heltal5) {
			System.out.println("Minsta heltal:" + "\t" + heltal1);
		} else if (heltal2 <= heltal1 && heltal2 <= heltal3 && heltal2 <= heltal4 && heltal2 <= heltal5) {
			System.out.println("Minsta heltal:" + "\t" + heltal2);
		} else if (heltal3 <= heltal1 && heltal3 <= heltal2 && heltal3 <= heltal4 && heltal3 <= heltal5) {
			System.out.println("Minsta heltal:" + "\t" + heltal3);
		} else if (heltal4 <= heltal1 && heltal4 <= heltal2 && heltal4 <= heltal3 && heltal4 <= heltal5) {

			System.out.println("Minsta heltal:" + "\t" + heltal4);
		} else if (heltal5 <= heltal1 && heltal5 <= heltal2 && heltal5 <= heltal3 && heltal5 <= heltal4) {
			System.out.println("Minsta heltal:" + "\t" + heltal5);
		}

		System.out.println("Medelvärdet:" + "\t" + (heltal1 + heltal2 + heltal3 + heltal4 + heltal5) / 5);

	}
}
