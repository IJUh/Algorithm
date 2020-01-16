
public class Solve {
	int answer = -1;

	public int solution67(int N, int number) {
		dfs(N, 0, 0, number, "");
		return answer;
	}

	public void dfs(int n, int pos, int num, int number, String s) {
		if (pos > 8)
			return;
		if (num == number) {
			if (pos < answer || answer == -1) {
				System.out.println(s);
				answer = pos;
			}
			return;
		}
		int nn = 0;
		for (int i = 0; i < 8; i++) {
			nn = nn * 10 + n;
			dfs(n, pos + 1 + i, num + nn, number, s + "+");
			dfs(n, pos + 1 + i, num - nn, number, s + "-");
			dfs(n, pos + 1 + i, num * nn, number, s + "*");
			dfs(n, pos + 1 + i, num / nn, number, s + "/");
		}
		// dfs(n,pos+1,num*10+n,number,s+"5");
	}

	public static void main(String args[]) {
		Solve ss = new Solve();
		int result1 = ss.solution67(5, 12);
		int result2 = ss.solution67(2, 11);
		System.out.println(result1);
		System.out.println(result2);
	}
}
