import java.util.Scanner;

public class Lektion1 {

	public static void main(String[] args) {

		// For-loopar anv�nds n�r man vet exakt hur m�nga g�nger man vill repetera n�got

		// Skriver ut 0-4
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// Skriver ut 5-1
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

		// Skriver ut alla j�mna tal under 100
		for (int i = 0; i < 100; i += 2) {
			System.out.println(i);
		}

		// Skriver ut alla udda tal under 100
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}

		// Skriver ut alla g�nger-tabeller f�r talen 1-10
		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();

		}
	}
        {
		
		Scanner input = new Scanner(System.in);
		
		// Anv�nds n�r man inte vet hur m�nga g�nger man vill repetera n�got
		
		boolean exit = false;
		
		while(!exit){
			String line = input.nextLine();	
			if(line.equals("exit")){
				exit = true;
			}
		}
		
	}
        
       {

    		Scanner input = new Scanner(System.in);

    		// Anv�nds n�r man inte vet hur m�nga g�nger man vill repetera n�got
    		// men vet att det �tminstone �r en g�ng.
    		
    		boolean exit = false;
    		do {
    			String line = input.nextLine();
    			if (line.equals("exit")) {
    				exit = true;
    			}
    		}
    		while (!exit); 

    	}
        
        
        
        
        
        
}
