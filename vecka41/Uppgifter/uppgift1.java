package Uppgifter;

import java.util.Scanner;

public class uppgift1 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		
	
        input = new Scanner(System.in);
        
        System.out.println("Skriv in ditt f�rsta heltal.");
        
        int tal1 = input.nextInt();
        
        System.out.println("Skriv in ditt andra heltal.");
        
        int tal2 = input.nextInt();
        
        if(tal1<tal2) {
        	System.out.println(tal1 + " �r minst.");
        	}
        
        	else if(tal2<tal1) {
        		System.out.println(tal2 + " �r minst.");
        		
        	}
        	else if (tal1 == tal2){
        		System.out.println("Talen �r lika stora.");
        	}
	}
}
