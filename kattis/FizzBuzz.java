import java.util.Scanner;

public class FizzBuzz {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		int fizz = input.nextInt();
		int buzz = input.nextInt();
		int ggr = input.nextInt();

		for (int i = 0; i <= ggr; i++) {
			if (i % fizz == 0 && i % buzz == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i % fizz == 0) {
				System.out.println("Fizz");
			} 
			else if (i % buzz == 0) {
				System.out.println("Buzz");
			} 
			else if(i % fizz != 0 || i % buzz != 0){
				System.out.println(i);
			}
		}

	}

}
