
public class arrayLektion2 {
	
	public static void main(String[]args) {
		
		
		int antalA = 0;
		
		String[] namn =	{"Billskog Gabriel", "Bratland Petter", "Dahlqvist Ida", "Erlandsson Malte", "Favoryt Kalle"}; //Vi namngav en array namn och sedan la vi in 5 namn i var sin l�da. 
		
		for(int i=0; i<namn.length;i++ ) { //kollar str�ngen och kollar f�rst igenom f�rsta namnet. 
			
			for(int j=0; j<namn[i].length(); j++) { //kollar bokstav f�r bokstav vad det �r f�r bokstav. 
				
				if(namn[i].contains("a")) { //Kollar om bokstaven �r ett a
					antalA++; // is�fall d� �kar antalA med 1. 
					
				}
			}				
		
			System.out.println(antalA);
		
		}
	}
}
