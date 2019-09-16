package vecka37;

import java.util.Scanner;

public class lektion2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
;	
		String namn1 = "Linus Lindström";
		String namn2 = "Emil Gutavsson";
		String namn3 = "Fredrik Nilsson";
		
		System.out.println("skriv ett namn");
		
		String namn4 = 	input.nextLine();
		
		System.out.println("skriv ett namn");
		
		String namn5 =  input.nextLine();
		
		System.out.println("\nNAMN:");
		System.out.println(namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4 + "/n" + namn5);

		}
}
