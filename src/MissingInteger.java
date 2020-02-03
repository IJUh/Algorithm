import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
	public static int solution(int[] A) {
		Arrays.sort(A);
		Set<Integer> set = new HashSet<Integer>();
		int maxNumber = A[A.length - 1];

		if (A[0] < 0) {
			return 1;
		}

		for (int i = 0; i < A.length; i++) {
			if (!set.contains(A[i])) {
				set.add(A[i]);
			} else {
				continue;
			}
		}
		int index = 1;
		for(; index <= maxNumber; index++) {
			if (!set.contains(index)) {
				return index;
			} else {
				continue;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 6, 4, 1, 2 };
		int[] A1 = { 1, 2, 3 };
		int[] A2 = { -1, -3 };
		System.out.println(MissingInteger.solution(A));
		System.out.println(MissingInteger.solution(A1));
		System.out.println(MissingInteger.solution(A2));

	}
}