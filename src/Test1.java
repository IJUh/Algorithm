
class Solution1 {
    public int[] solution(int[] array, int[][] commands) {
        //commands �迭 ũ�� �Ҵ�
    	int[] answer = new int[commands.length];

        for(int commandI = 0; commandI < commands.length; commandI++) {
    		//
    		int startIdx = commands[commandI][0];	//���ۿ�
    		int endIdx = commands[commandI][1];     //����
    		int orderIdx = commands[commandI][2];	//����
    		int temp[] = new int[endIdx - startIdx + 1];	//startIdx���� endIdx������ �迭�� ���� ��
			int z = 0;
    		System.out.println(commands[0][0]);
    		for(int commandJ = startIdx-1; commandJ < endIdx; commandJ++) {
    			temp[z] = array[commandJ];
    			z++;
    		}
    		//temp����
			for(int i = 0; i < temp.length; i++) 
				for(int j = i+1; j < temp.length; j++) {
					if(temp[i] > temp[j]) {
						int repo = temp[i];
						temp[i] = temp[j];
						temp[j] = repo;
					} else {
						continue;
					}
				}
			answer[commandI] = temp[orderIdx-1];
    	}
        return answer;
        // [5, 6, 3]
    }
}		

public class Test1 {
	 public static void main(String args[]) {
	    Solution1 ss = new Solution1();
	    
		int[] arg1 = {1, 5, 2, 6, 3, 7, 4};
		int[][] arg2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] result = ss.solution(arg1,arg2);
		
		for(int i = 0; i < result.length; i++) {
    		System.out.print(result[i]);
    	}
	 }
}
