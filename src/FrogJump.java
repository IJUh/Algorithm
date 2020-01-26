import java.util.HashMap;
import java.util.Map;

public class FrogJump {
	public static int solution(int X, int[] A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int index = 0; index < A.length; index++) {
			if(A[index] <= X) {
				map.put(A[index], A[index]);
			}
			if(map.size() == X) {
				return index;
			}
		}
		return -1;
    }
	
	public static void main(String[] args) {
		int X = 5;
		int[] A = {1,3,1,4,2,3,5,4};
		int X1 = 4;
		int[] A1 = {1,1,1,1};
		int X2 = 3;
		int[] A2 = {1,3,3,2,3,4,5,6,7};
		System.out.println(FrogJump.solution(X, A));
		System.out.println(FrogJump.solution(X1, A1));
		System.out.println(FrogJump.solution(X2, A2));
	}
}
