package Uppgifter;

import java.util.Scanner;

public class uppgift2 {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		int talet = input.nextInt();
		
		int tusen = 0; 
		
		int hundra = 0;
		
		int tio = 0;
		
		if(talet > 10000) {
			 tusen = 10;
		}
		else if(talet > 9000) {
			 tusen = 9;
		}
		else if(talet > 8000) {
			 tusen = 8;
		}
		else if(talet > 7000) {
			 tusen = 7;
		}
		else if(talet > 6000) {
			 tusen = 6;
		}
		else if(talet > 5000) {
			 tusen = 5;
		}
		else if(talet > 4000) {
			 tusen = 4;
		}
		else if(talet > 3000) {
			 tusen = 3;
		}
		else if  (talet > 2000) {
			 tusen = 2;
		}
		else if(talet > 1000) {
			 tusen = 1;
		}
			
		
		System.out.println(tusen);
			
		
		int tusensumma = talet-tusen*1000 ; 
		
		
			
			 if(tusensumma > 900) {
				 hundra = 9;
			}
			else if(tusensumma > 800) {
				 hundra = 8;
			}
			else if(tusensumma > 700) {
				 hundra = 7;
			}
			else if(tusensumma > 600) {
				 hundra = 6;
			}
			else if(tusensumma > 500) {
				 hundra = 5;
			}
			else if(tusensumma > 400) {
				 hundra = 4;
			}
			else if(tusensumma > 300) {
				 hundra = 3;
			}
			else if  (tusensumma > 200) {
				 hundra = 2;
			}
			else if(tusensumma > 100) {
				 hundra = 1;
			}
				System.out.println(hundra);
				
				
				int hundrasumma = tusensumma-hundra*100 ; 
				
				
				 if(hundrasumma > 90) {
					 tio = 9;
				}
				else if(hundrasumma > 80) {
					 tio = 8;
				}
				else if(hundrasumma > 70) {
					 tio = 7;
				}
				else if(hundrasumma > 60) {
					 tio = 6;
				}
				else if(hundrasumma > 50) {
					 tio = 5;
				}
				else if(hundrasumma > 40) {
					 tio = 4;
				}
				else if(hundrasumma > 30) {
					 tio = 3;
				}
				else if  (hundrasumma > 20) {
					 tio = 2;
				}
				else if(hundrasumma > 10) {
					 tio = 1;
				}
					System.out.println(tio);
		}

	}
