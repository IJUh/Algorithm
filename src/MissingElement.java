import java.util.Arrays;

public class MissingElement {
	public static int solution(int[] A) {
		Arrays.sort(A);
		int[] temp = new int[A.length];
		
		for(int idx = 0; idx < A.length; idx++) {
			if(idx+1 == A[idx]) {
				temp[idx] = idx+1;
			} else {
				return idx;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] A = { 2, 3, 1, 5 };
		int[] A1 = { 1 };
		int[] A2 = { 0, 3, 1, 2 };
		int[] A3 = { 0, 2, 1, 4 };
		System.out.println(MissingElement.solution(A));
		System.out.println(MissingElement.solution(A1));
		System.out.println(MissingElement.solution(A2));
		System.out.println(MissingElement.solution(A3));

	}
}
