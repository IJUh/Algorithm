public class Test5 {

	public String solution7(int n) {
		String answer = "";
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				//¦
				answer += "��";
			} else if(i % 2 == 1) {
				//Ȧ
				answer += "��";
			}
		}
		return answer;
	}

	public static void main(String arsg[]) {
		String result = new Test5().solution7(3);
		String result1 = new Test5().solution7(4);

		System.out.println(result);
		System.out.println(result1);
	}
}
