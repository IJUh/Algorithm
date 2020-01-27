import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permute {
	public static int solution(int[] A) {
		Set<Integer> set = new HashSet<Integer>();
		Arrays.sort(A);
		int lastNumber = A[A.length-1];
		int idx = 0;
		for(int numberLoop = 1; numberLoop <= lastNumber || idx < A.length; numberLoop++) {
			if(A[idx] == numberLoop && !set.contains(A[idx])) {
				set.add(A[idx]);
				idx++;
				continue;
			} else {
				return 0;
			}
		}
		return 1;
    }
	
	public static void main(String[] args) {
		int[] A = {4,1,3,2};
		int[] A1 = {4,1,3};
		int[] A2 = {5,1,3};
		int[] A3 = {1,1,3};
		int[] A4 = {1,1,1,1};
		int[] A5 = {1,2};
		int[] A6 = {1,1,1};
		System.out.println(Permute.solution(A));
		System.out.println(Permute.solution(A1));
		System.out.println(Permute.solution(A2));
		System.out.println(Permute.solution(A3));
		System.out.println(Permute.solution(A4));
		System.out.println(Permute.solution(A5));
		System.out.println(Permute.solution(A6));
	}
}
