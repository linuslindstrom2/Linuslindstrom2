
public class arrayLektion2 {
	
	public static void main(String[]args) {
		
		
		int antalA = 0;
		
		String[] namn =	{"Billskog Gabriel", "Bratland Petter", "Dahlqvist Ida", "Erlandsson Malte", "Favoryt Kalle"}; //Vi namngav en array namn och sedan la vi in 5 namn i var sin låda. 
		
		for(int i=0; i<namn.length;i++ ) { //kollar strängen och kollar först igenom första namnet. 
			
			for(int j=0; j<namn[i].length(); j++) { //kollar bokstav för bokstav vad det är för bokstav. 
				
				if(namn[i].contains("a")) { //Kollar om bokstaven är ett a
					antalA++; // isåfall då ökar antalA med 1. 
					
				}
			}				
		
			System.out.println(antalA);
		
		}
	}
}
