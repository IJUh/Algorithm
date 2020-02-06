import java.util.Scanner;

public class PrintStart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int loc = number;
		for (int i = 1; i <= number - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int z = 1; z <= (loc - 1) * 2; z++) {
				System.out.print(" ");
			}
			for (int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
			loc--;
		}
		for (int i = 1; i <= 2 * number; i++) {
			System.out.print("*");
		}
		loc++;
		System.out.println();
		for (int i = number - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int z = 1; z <= (loc - 1) * 2; z++) {
				System.out.print(" ");
			}
			for (int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			loc++;
			if (i != 1) {
				System.out.println();
			}
		}
	}
}
