package vecka48;

import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in Fahrenheit f�r att omvandla till Kelvin");
		double fahrenheit = input.nextDouble();		
		System.out.printf("%.2f", fahrenheitToKelvin(fahrenheit));
		System.out.println(" Grader Fahrenheit.");
		
		
		System.out.println("Skriv in Kelvin f�r att omvandla till Celsius");
		double kelvin = input.nextDouble();
		System.out.printf("%.2f", kelvinToCelsius(kelvin));
		System.out.println(" Grader Celsius.");
		
		System.out.println("Skriv in Kilometer/Timme f�r att omvandla till Meter/Sekund");
		double velocityKmH = input.nextDouble();
		System.out.printf("%.2f", velocityConversion(velocityKmH));
		System.out.println(" m/s.");
		
		System.out.println("Skriv in massa och hastighet s� skriver programmet ut den kinetiska energin.");
		System.out.println("F�rst massa.");
		double mass = input.nextDouble();
		System.out.println("Sen hastighet.");
		double velocity = input.nextDouble();
		System.out.printf("%.2f", kineticEnergy(mass , velocity));
		System.out.println(" Joule.");
	
		System.out.println("Skriv in massa och h�jd f�r att r�kna ut potensiell energi.");
		System.out.println("F�rst massa.");
		double mass2= input.nextDouble();
		System.out.println("Sen h�jd.");
		double height = input.nextDouble();
		System.out.printf("%.2f", potentialEnergy(mass2, height));
		System.out.println(" Joule.");
		
		System.out.println("Skriv in 3 olika tal f�r att r�kna ut medelv�rdet.");
		System.out.println("Tal 1.");
		double tal1 = input.nextDouble();
		System.out.println("Tal 2.");
		double tal2 = input.nextDouble();
		System.out.println("Tal 3.");
		double tal3 = input.nextDouble();
		System.out.print("Medelv�rdet �r ");
		System.out.printf("%.2f", delta(tal1, tal2, tal3));
		System.out.println(".");
		
		String word = "PaParaZZi";
		System.out.println( smallLetters(word));
	
		String sentence = "Jag vill bli godk�nd i programering";
		System.out.println( pr0gramering(sentence));
		
		System.out.println("Skriv in hastighet och str�cka f�r att r�kna ut tiden det tog.");
		System.out.println("F�rst str�ckan.");
		double distance = input.nextDouble();
		System.out.println("Sen hastigheten.");
		double velocity2= input.nextDouble();
		System.out.printf("%.2f",svtTime(distance, velocity2));
		System.out.println(" Sekunder");
		
		System.out.println("Skriv in hastighet f�r att r�kna ut h�jden.");
		double velocity3 = input.nextDouble();
		System.out.printf("%.2f", velocityToHeight(velocity3));
	}
	
	
	/**
	 * Omvandlar fahrenheit till kelvin.
 	 * @param fahrenheit
 	 * @return kelvin
 	 */
	public static double fahrenheitToKelvin(double fahrenheit) {
		
		double kelvin = (fahrenheit+459.67)*5/9;
		
		return kelvin;
		
	}

	/**
	 * Omvandlar kelvin till celsius.
	 * @param kelvin
	 * @return celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		
		double celsius = (kelvin-273.15);
		
		return celsius;
	}

	/**
	 * Omvandlas km/h till m/s.
	 * @param velocityKmH
	 * @return velocityms
	 */
	public static double velocityConversion(double velocityKmH) {
		
		double velocityms = (velocityKmH/3.6);
		
		return velocityms;
	}

	/**
	 * Omvandlar massa och hastighet till kinetisk energi. 
	 * @param mass
	 * @param velocity
	 * @return kineticEnergy
	 */
	public static double kineticEnergy(double mass, double velocity) {
		
		double kineticEnergy = (mass*velocity*velocity)/2;
		
		return kineticEnergy;
	}

	/**
	 * Omvandlar massa och h�jd till potentiell energi. 
	 * @param mass
	 * @param velocity
	 * @return potentielEnergy
	 */
	public static double potentialEnergy(double mass2, double height) {
		
		double potentialEnergy = mass2*9.82*height;
		
		return potentialEnergy;
	}

	/**
	 * R�knar ut medelv�rdet p� 3 tal. 
	 * @param tal1
	 * @param tal2
	 * @param tal3
	 * @return medelv�rde
	 */
	public static double delta(double tal1, double tal2,double tal3) {
		
		double medelv�rde = (tal1 + tal2 + tal3) / 3;
		
		return medelv�rde;
	}

	/**
	 * Skriver om till sm� bokst�ver
	 * @param word
	 * @return word
	 */
	public static String smallLetters(String word) {	
		
		return word.toLowerCase();
	}
	
	/**
	 * Skriver om till stora bokst�ver.
	 * @param sentence
	 * @return sentence
	 */
	public static String pr0gramering(String sentence) {	
	
		return sentence.toUpperCase();
}

	/**
	 * Omvandlar hastighet och distans till tid. 
	 * @param distance
	 * @param velocity2
	 * @return time
	 */
	public static double svtTime(double distance, double velocity2) {
		
		double time = distance/ velocity2;
		
		return time;
	}
		
	/**
	 * Omvandlar kraft och distans till arbete. 
	 * @param force
	 * @param distance2
	 * @return work
	 */
	public static double work(double force, double distance2) {
		
		double work=force*distance2;
		
		return work;
	}
	
	/**
	 * Omvandlar Hastighet till h�jd.
	 * @param velocity3
	 * @return height2
	 */
	public static double velocityToHeight(double velocity3) {
	
	double gravity = 9.82;
	
	double height2= (velocity3*velocity3)/(2*gravity);
	
	return height2;
	}
	}
