public class Test4 {
	public long solution6(long n) {
		String longString = String.valueOf(n);
		int size = longString.length();
		int[] array = new int[size];
		long answer = 0;
		for (int i = 0; i < size; i++) {
			array[i] = longString.charAt(i);
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			System.out.println((char)array[i]);
			sb.append((char)array[i]);
		}
		answer = Long.parseLong(sb.toString());
		return answer;
	}

	public static void main(String arsg[]) {
		long result = new Test4().solution6(118372);

		System.out.println(result);
	}
}
