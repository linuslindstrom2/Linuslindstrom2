import java.util.Scanner;

public class Lektion1 {

	public static void main(String[] args) {

		// For-loopar används när man vet exakt hur många gånger man vill repetera något

		// Skriver ut 0-4
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// Skriver ut 5-1
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

		// Skriver ut alla jämna tal under 100
		for (int i = 0; i < 100; i += 2) {
			System.out.println(i);
		}

		// Skriver ut alla udda tal under 100
		for (int i = 1; i < 100; i += 2) {
			System.out.println(i);
		}

		// Skriver ut alla gånger-tabeller för talen 1-10
		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();

		}
	}
        {
		
		Scanner input = new Scanner(System.in);
		
		// Används när man inte vet hur många gånger man vill repetera något
		
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

    		// Används när man inte vet hur många gånger man vill repetera något
    		// men vet att det åtminstone är en gång.
    		
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
