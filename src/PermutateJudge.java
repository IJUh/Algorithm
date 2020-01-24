import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*문자열 두개를 입력 받아 그 중 하나가 순열에 속하는 지 구함.*/
public class PermutateJudge {
	
	
	public static boolean judge(String originStr, String compareString) {
		//Stack<char> originChar = new Stack<char>;
		Map<Character,Character> originMap = new HashMap<Character,Character>();
		Stack<Character> compareChar = new Stack<Character>();
		for(int i = 0; i < originStr.length(); i++) {
			originMap.put(originStr.charAt(i),originStr.charAt(i));
		}
		for(int j = 0; j < compareString.length(); j++) {
			compareChar.push(compareString.charAt(j));
		}
		
		for(int idx = 0; idx < compareChar.size(); idx++) {
			if(originMap.containsKey(compareChar.pop())) {
				continue;
			} else {
				return false;
			}
		}
		
		return true;		
	} 
	
	public static void main(String[] args) {
		System.out.println(PermutateJudge.judge("abc","bcd"));
		System.out.println(PermutateJudge.judge("abc","ab"));
		System.out.println(PermutateJudge.judge("defg","hij12"));
		System.out.println(PermutateJudge.judge("12345","1"));
		System.out.println(PermutateJudge.judge("8910","89"));
	}
}
