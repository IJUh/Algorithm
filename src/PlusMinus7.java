import java.util.Scanner;

public class PlusMinus7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int x, z;
		for(int i = 0; i < T; i++) {
			x = s.nextInt();
			z = s.nextInt();
			System.out.println("Case #"+(i+1) + ": "+(x+z));
		}
		s.close();
	}
}
