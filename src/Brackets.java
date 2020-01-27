import java.util.Stack;

public class Brackets {
	public static int solution(String S) {
		// (", "{", "[", "]", "}" and/or ")".
		char look;
		Stack<Character> stack = new Stack<Character>();
		for (char c : S.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.empty()) {
					return 0;
				}
				look = stack.peek();
				if ((look == '(' && c == ')') || (look == '{' && c == '}') || (look == '[' && c == ']')) {
					stack.pop();
				}
			}
		}

		if (stack.empty()) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		String S = "{[()()]}";
		String S1 = "([)()]";
		System.out.println(Brackets.solution(S));
		System.out.println(Brackets.solution(S1));
	}
}
