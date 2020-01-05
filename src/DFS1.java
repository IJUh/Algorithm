public class DFS1 {
	static int answer = 0;

	public int solution(int[] numbers, int target) {
		DFS(numbers, target, 0);
		return answer;
	}

	public static void DFS(int[] numbers, int target, int node) {
		if (node == numbers.length) {
			int sum = 0;
			for (int num : numbers) {
				sum += num;
			}
			if (sum == target) {
				answer++;
			}
		} else {
			numbers[node] *= 1;
			DFS(numbers, target, node + 1);

			numbers[node] *= -1;
			DFS(numbers, target, node + 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1;
		}
		int target = 3;

		System.out.println(new DFS1().solution(arr, target));
	}
}