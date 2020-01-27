import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class leftOddNumber {
	public static int solution(int[] A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int idx : A) {
			if(!map.containsKey(idx)) {
				map.put(idx, idx);
				continue;
			} 
			map.remove(idx);
		}
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> iterator = set.iterator();
		
		return iterator.next();
	}
	
	public static void main(String[] args) {
		int[] A = {9,3,9,3,9,7,9};
		System.out.println(leftOddNumber.solution(A));
	}
}
