public class Rotation {
	public static int[] solution(int[] A, int K) {
		int length = A.length;
		if(length == 0) {
			return A;
		}
		if(K%length == 0) {
			return A;
		}
		int firstElementLoc = K%length;
		int[] answer = new int[length];
		//set the firstElementLoc
		answer[firstElementLoc] = A[0];
		int answerIndex = firstElementLoc;
		
		for(int index = 1; index < length; index++) {
			if(answerIndex == length -1) {
				answerIndex = 0;
			} else {
				++answerIndex;
			}
			answer[answerIndex] = A[index];
		}
		
		return answer;
    }
	
	public static void main(String args[]) {
		int[] input = {3,8,9,7,6};
		int[] answer = Rotation.solution(input, 3);
		for(int index = 0; index < answer.length; index++) {
			System.out.print(answer[index]);
		}

		System.out.println();
		int[] input2 = {0,0,0};
		int[] answer2 = Rotation.solution(input2, 1);
		for(int index = 0; index < answer2.length; index++) {
			System.out.print(answer2[index]);
		}
		System.out.println();
		int[] input3 = {1,2,3,4};
		int[] answer3 = Rotation.solution(input3, 4);
		for(int index = 0; index < answer3.length; index++) {
			System.out.print(answer3[index]);
		}
		System.out.println();
	}
}
