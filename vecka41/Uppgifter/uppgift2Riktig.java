
package Uppgifter;

import java.util.Scanner;

public class uppgift2Riktig {

	public static void main(String[] args) {

		int digit;
		int number;
		int sum = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in ett heltal.");

		number = input.nextInt();

		while (number != 0) {

			digit = number % 10;
			sum += digit; // sum += digit är samma som sum = sum + digit
			number /= 10; // number /= 10 är samma som number = number / 10

		}
		System.out.println(sum);
		input.close();
	}
	
}
