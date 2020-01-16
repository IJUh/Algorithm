/*�뱸 �޼������� � �� ������ �ֱٿ� ���� ���� Ÿ�� ��Ĺ��� ���� �Ǿ���. 
 * Ÿ�� ��Ĺ��� ���簢�� Ÿ���� �ٿ� ���� ���¿��µ�, �� ���� 1�� ���簢�� Ÿ�Ϻ��� �����Ͽ� ��ġ �޹������� ���� ���ó�� ���� ū Ÿ���� ���� ���¿���. Ÿ�� ��Ĺ��� �Ϻθ� �׸��� ������ ����.
 * �׸����� Ÿ�Ͽ� ���� ���� �� Ÿ���� �� ���� ���̸� ��Ÿ����. Ÿ�� ��Ĺ��� �����ϴ� ���簢�� Ÿ�� �� ���� ���̸� ���� Ÿ�Ϻ��� �����Ͽ� ���ʷ� ������ ������ ����.
 * [1, 1, 2, 3, 5, 8, .]
 * ������ ���� �̷��� Ÿ�ϵ�� �����Ǵ� ū ���簢���� �ѷ��� �ñ�������. ���� ���, ó�� �ټ� ���� Ÿ���� �����ϴ� ���簢��(������ ���������� ǥ���� ���簢��)�� �ѷ��� 26�̴�.
 * Ÿ���� ���� N�� �־��� ��, N���� Ÿ�Ϸ� ������ ���簢���� �ѷ��� return �ϵ��� solution �Լ��� �ۼ��Ͻÿ�.
 * ���� ����
 * N�� 1 �̻� 80 ������ �ڿ����̴�.
 * ����� ��
 * N	return
 * 5	26
 * 6	42
*/
public class Tile {

	//�ð� ���⵵, �׽�Ʈ ���̽� ���
	//array[0], array[1]�� �ܼ� ���� ���� ����� ���ְ� ����Լ����� ó���ϵ��� �߰� �� ++idx���� ����Լ� ȣ�� �� ���Եǵ��� ���
	//����Լ� ȣ�� tail recursion ������� �����Ͽ� stack overflow���� �ʵ��� ����
	//tail recursion������� ȣ���ϸ� ��� depth�� ������� for�� �ݺ�Ƚ�� ��ŭ�� �ݺ�
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
		//��������
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

	/* for������ �ð� ���⵵ ������� �� �� ����Ͽ����� ����Լ��� �ð� ���⵵ ���� �ذ� �� ��
	 * public static long solution(int N) {
		int[] array = new int[N];
		long answer = 0;

		if (N == 1) {
			return 1;
		} else if (N == 2) {
			return 2;
		} else {
			// Ÿ�� ����
			array[0] = 1;
			array[1] = 1;
			createTiles(array,N ,2);
			answer = array[N - 1] * 2 + (array[N - 1] + array[N - 2]) * 2;
		}
		return answer;
	}
	
	public static int createTiles(int[] array, int N, int idx) {
		//��������
		if(N == idx) {
			return 0;
		} 
		array[idx] = array[idx - 1] + array[idx - 2];
		idx++;
		return createTiles(array, N, idx);
	}
	 */

	// ȿ���� �ð� ���⵵���� Ż��.
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
