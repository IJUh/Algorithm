/*대구 달성공원에 놀러 온 지수는 최근에 새로 만든 타일 장식물을 보게 되었다. 
 * 타일 장식물은 정사각형 타일을 붙여 만든 형태였는데, 한 변이 1인 정사각형 타일부터 시작하여 마치 앵무조개의 나선 모양처럼 점점 큰 타일을 붙인 형태였다. 타일 장식물의 일부를 그리면 다음과 같다.
 * 그림에서 타일에 적힌 수는 각 타일의 한 변의 길이를 나타낸다. 타일 장식물을 구성하는 정사각형 타일 한 변의 길이를 안쪽 타일부터 시작하여 차례로 적으면 다음과 같다.
 * [1, 1, 2, 3, 5, 8, .]
 * 지수는 문득 이러한 타일들로 구성되는 큰 직사각형의 둘레가 궁금해졌다. 예를 들어, 처음 다섯 개의 타일이 구성하는 직사각형(위에서 빨간색으로 표시한 직사각형)의 둘레는 26이다.
 * 타일의 개수 N이 주어질 때, N개의 타일로 구성된 직사각형의 둘레를 return 하도록 solution 함수를 작성하시오.
 * 제한 사항
 * N은 1 이상 80 이하인 자연수이다.
 * 입출력 예
 * N	return
 * 5	26
 * 6	42
*/
public class Tile {

	//시간 복잡도, 테스트 케이스 통과
	//array[0], array[1]등 단순 변수 선언 방식을 없애고 재귀함수에서 처리하도록 추가 및 ++idx연산 재귀함수 호출 시 포함되도록 계산
	//재귀함수 호출 tail recursion 방식으로 구현하여 stack overflow되지 않도록 관리
	//tail recursion방식으로 호출하면 재귀 depth가 길어져도 for문 반복횟수 만큼만 반복
	public static long solution(int N) {
		long[] array = new long[N];
		long answer = 0;

		if (N == 1) {
			return 1;
		} else if (N == 2) {
			return 2;
		} else {
			createTiles(array, N, 0);
			answer = array[N - 1] * 2 + (array[N - 1] + array[N - 2]) * 2;
		}
		return answer;
	}

	public static int createTiles(long[] array, int N, int idx) {
		//종료조건
		if (N == idx) {
			return 0;
		}
		if (idx == 0) {
			array[idx] = 1;
		} else if (idx == 1) {
			array[idx] = 1;
		} else {
			array[idx] = array[idx - 1] + array[idx - 2];
		}
		return createTiles(array, N, ++idx);
	}

	/* for문으로 시간 복잡도 통과하지 못 해 계산하였으나 재귀함수로 시간 복잡도 문제 해결 못 함
	 * public static long solution(int N) {
		int[] array = new int[N];
		long answer = 0;

		if (N == 1) {
			return 1;
		} else if (N == 2) {
			return 2;
		} else {
			// 타일 생성
			array[0] = 1;
			array[1] = 1;
			createTiles(array,N ,2);
			answer = array[N - 1] * 2 + (array[N - 1] + array[N - 2]) * 2;
		}
		return answer;
	}
	
	public static int createTiles(int[] array, int N, int idx) {
		//종료조건
		if(N == idx) {
			return 0;
		} 
		array[idx] = array[idx - 1] + array[idx - 2];
		idx++;
		return createTiles(array, N, idx);
	}
	 */

	// 효율성 시간 복잡도에서 탈락.
	/*
	 * public static void createTiles(int[] array, int N) { array[0] = 1; array[1] =
	 * 1; for (int idx = 2; idx < N; idx++) { array[idx] = array[idx - 1] +
	 * array[idx - 2]; } }
	 */

	public static void main(String[] args) {
		System.out.println(Tile.solution(1));
		System.out.println(Tile.solution(2));
		System.out.println(Tile.solution(5));
		System.out.println(Tile.solution(6));
	}

}
