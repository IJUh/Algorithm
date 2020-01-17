/*
 * a, ab, abc, abcd 등 입력된 문자열의 순열(부분집합)을 구하시오. 현재 문제 풀이 중
 * */
public class permutation {
		static String[][] answer = null;
		//String 이차원 배열이 아니라 charAt으로 뽑아내는 것이 어떨까?
		public static void permutateCall(String originStr, int idx) {
			if(idx == 0) {
				answer[0][0] = originStr;
			} else if(originStr.length() == idx) {
				return;
			} else {
				String concanateString = originStr.substring(0, idx+1);
				for(int i = 0; i < originStr.length(); i++) {
					for(int j = 0; j < idx  ; j++) {
						answer[i][j] += concanateString;
					}
				}
				permutateCall(originStr, ++idx);
			}
		}
	
		public static String[][] permutate(String originStr) {
			int size = originStr.length();
			answer = new String[1024][1024];
			if(originStr.length() == 1) {
				answer[0][0] = originStr;
				return answer;
			} else {
				permutateCall(originStr,0);
			}
			return answer;
		}
	
		public static void main(String[] args) {
			System.out.println(permutation.permutate("a"));
			System.out.println(permutation.permutate("ab"));
			System.out.println(permutation.permutate("abc")); 
		}
}
