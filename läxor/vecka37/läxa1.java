package vecka37;

import java.util.Scanner;

public class l�xa1 {

public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
		System.out.println("Vad heter du?");
		
		String namn = 	input.nextLine();
		
		System.out.println("Hur gammal �r du?");
		
		String �lder = 	input.nextLine();
		
		System.out.println("Vilken adress har du?");
		
		String adress = input.nextLine();
		
		System.out.println("Vad har du f�r postnummer?");
		
		String postnummer =  input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		
		String stad =  input.nextLine();
		
		System.out.println("Vad har du f�r telefonnummer?");
		
		String nummer = input.nextLine();
		
		System.out.println("\nInformation:");
		System.out.println("Namn:" + "\t" + namn + "\n" + "�lder:" + "\t"  + �lder +"\n" + "Adress:" + "\t" + adress + "\n" + "\t" + postnummer + " " + stad + "\n" + "Nummer:" + "\t" + nummer );

		}

}
