package vecka37;

import java.util.Scanner;

public class läxa1 {

public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
		System.out.println("Vad heter du?");
		
		String namn = 	input.nextLine();
		
		System.out.println("Hur gammal är du?");
		
		String ålder = 	input.nextLine();
		
		System.out.println("Vilken adress har du?");
		
		String adress = input.nextLine();
		
		System.out.println("Vad har du för postnummer?");
		
		String postnummer =  input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		
		String stad =  input.nextLine();
		
		System.out.println("Vad har du för telefonnummer?");
		
		String nummer = input.nextLine();
		
		System.out.println("\nInformation:");
		System.out.println("Namn:" + "\t" + namn + "\n" + "Ålder:" + "\t"  + ålder +"\n" + "Adress:" + "\t" + adress + "\n" + "\t" + postnummer + " " + stad + "\n" + "Nummer:" + "\t" + nummer );

		}

}
