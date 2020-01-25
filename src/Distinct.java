import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Distinct {
	 public static int solution(int[] A) {
		 Arrays.sort(A);
		 
		 Map<Integer,Integer> resultMap = new HashMap<Integer,Integer>();
		 for(int index = 0; index < A.length; index++) {
			 resultMap.put(A[index], A[index]);
		 }
		 
		 int answer = resultMap.size();
		 return answer;
		 
	 }
	 
	 public static void main(String[] args) {
		 int[] A = {2,1,1,2,3,1};
		 System.out.println(Distinct.solution(A));
	 }
	 
	 
}
