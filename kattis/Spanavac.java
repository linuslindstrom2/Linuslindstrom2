import java.util.Scanner;

public class Spanavac {
	
	private static Scanner input;
	
	public static void main(String[] args) {


        input = new Scanner(System.in);

        int tim = input.nextInt();  //H�r skriver du in antal timmar.
        int min = input.nextInt();  //H�r skriver du in antal minuter.

        min -= 45; //Larmet skulle g� 45 inuter tidigare

        if (tim < 0) {
            tim = 23;
        }
        if (min < 0)
            {
            tim -= 1;
            min += 60;
            }
       
        System.out.println(tim + ":" + min);


            }





    }

