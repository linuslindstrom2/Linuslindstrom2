import java.util.Scanner;

public class oddities {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int tal1 = input.nextInt();

		int tal2 = input.nextInt();

		int tal3 = input.nextInt();

		int tal4 = input.nextInt();

		if (tal1 % 2 == 0) {
			System.out.println(tal1 + " �r j�mnt.");
		} else if (tal1 % 2 == 1) {
			System.out.println(tal1 + " �r oj�mnt.");
		}

		if (tal2 % 2 == 0) {
			System.out.println(tal2 + " �r j�mnt.");
		} else if (tal2 % 2 == 1) {
			System.out.println(tal2 + " �r oj�mnt.");
		}

		if (tal3 % 2 == 0) {
			System.out.println(tal3 + " �r j�mnt.");
		} else if (tal3 % 2 == 1) {
			System.out.println(tal3 + " �r oj�mnt.");
		}

		if (tal4 % 2 == 0) {
			System.out.println(tal4 + " �r j�mnt.");
		} else if (tal4 % 2 == 1) {
			System.out.println(tal4 + " �r oj�mnt.");
		}
	}
}
