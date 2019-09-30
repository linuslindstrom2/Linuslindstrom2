package vecka38;

import java.util.Scanner;

public class VetEj {

	private static Scanner input;

	public static void main(String[] args) {

		String svar1 = "0";
		String svar2 = "0";

		input = new Scanner(System.in);

		System.out.println("Hej");

		svar1 = input.nextLine();

		if (svar1.equals("Hej") || svar1.equals("hej") || svar1.equals("Sho") || svar1.equals("sho")
				|| svar1.equals("hej")) {
			System.out.println("Hur mår du?");
		} else if (svar1.equals("hej, hur mår du?") || (svar1.equals("Hej, hur mår du?"))) {
			System.out.println("Jag mår bra. Hur mår du?");
		}

		svar2 = input.nextLine();

		if (svar2.equals("Bra") || (svar2.equals("bra")))
		{
			System.out.println("Vad bra");}
			
		else if (svar2.equals("Dåligt") || (svar2.equals("dåligt"))) {
			System.out.println("Det var inte så bra");
		}

	}
	}

