import java.util.Scanner;

public class Metoder {

	public static void main(String[] args) {

		twoNumbers();
	}
	
	/**
	 * Skriver 2 heltal och skickar de vidare. 
	 */
	public static void twoNumbers() {
		
		int tal1;
		int tal2;

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in 2 heltal.");
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		
		System.out.println(dinMamma(tal1,tal2));
	}
	
	/**
	 * 
	 * @param tal1
	 * @param tal2
	 * @return
	 */
	
	static String dinMamma(int tal1 , int tal2) {

		if (tal1 <= tal2) {
			System.out.println("Minsta talet är " + tal1);
		} else {
			System.out.println("Minsta talet är " + tal2);
		}
	
		String hej = "Programmet är färdigt";
		
		return hej; 
	}
}
