import java.util.Stack;

public class Nesting {
	public static int solution(String S) {
		Stack<Character> stack = new Stack<Character>();
		for(char c : S.toCharArray()) {
			if(c == '(') {
				stack.push(c);
			} else {
				if(stack.empty()) {
					return 0;
				}
				stack.pop();
			}
		}
		
		if(stack.empty()) {
			return 1;
		} else {
			return 0;
		}
	}
	public static void main(String[] args) {
		String S = "(()(())())";
		String S1 = "())";
		System.out.println(Nesting.solution(S));
		System.out.println(Nesting.solution(S1));
	}
}
