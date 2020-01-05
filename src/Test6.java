import java.util.Arrays;
import java.util.PriorityQueue;

public class Test6 {

	public int solution8(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i : scoville)
			pq.add(i);

		while(true) {
			if (pq.peek() >= K)
				break;
			if (pq.size() == 1)
				return -1;
			int s1 = pq.poll();
			int s2 = pq.poll();
			pq.add(s1 + (s2 * 2));
			answer++;
		}
		return answer;

	}

	public static int[] mergeSort(int[] arr) {
		if (arr.length < 2)
			return arr;

		int mid = arr.length / 2;
		int[] low_arr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] high_arr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		int[] mergedArr = new int[arr.length];
		int m = 0, l = 0, h = 0;
		while (l < low_arr.length && h < high_arr.length) {
			if (low_arr[l] < high_arr[h])
				mergedArr[m++] = low_arr[l++];
			else
				mergedArr[m++] = high_arr[h++];
		}
		while (l < low_arr.length) {
			mergedArr[m++] = low_arr[l++];
		}
		while (h < high_arr.length) {
			mergedArr[m++] = high_arr[h++];
		}
		return mergedArr;
	}

	public static void main(String arsg[]) {
		int[] test = { 1, 2, 3, 9, 10, 12 };
		int result = new Test6().solution8(test, 7);

		System.out.println(result);
	}
}
