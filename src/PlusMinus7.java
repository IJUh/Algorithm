import java.util.Scanner;

public class PlusMinus7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int x, z;
		for(int i = 0; i < T; i++) {
			x = s.nextInt();
			z = s.nextInt();
			int num = i+1;
			int sum = x + z;
			System.out.println("Case #"+num + ": " + x + " + " + z + " = " + sum);
		}
		s.close();
	}
}
