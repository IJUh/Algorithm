public class Jump {
	public static int solution(int X, int Y, int D) {
		int answer = 0;
		int requiredMove = Y - X;
		int mock = requiredMove / D;
		int namuji = requiredMove % D;
		
		if(namuji == 0) {
			return mock;
		} else {
			answer = mock + 1;
		}
		return answer;
    }
	public static void main(String[] args) {
		System.out.println(Jump.solution(10,85,30));
	}
}
