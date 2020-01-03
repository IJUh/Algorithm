
class Solution1 {
    public int[] solution(int[] array, int[][] commands) {
        //commands 배열 크기 할당
    	int[] answer = new int[commands.length];

        for(int commandI = 0; commandI < commands.length; commandI++) {
    		//
    		int startIdx = commands[commandI][0];	//시작열
    		int endIdx = commands[commandI][1];     //끝열
    		int orderIdx = commands[commandI][2];	//순서
    		int temp[] = new int[endIdx - startIdx + 1];	//startIdx부터 endIdx까지의 배열을 담을 값
			int z = 0;
    		System.out.println(commands[0][0]);
    		for(int commandJ = startIdx-1; commandJ < endIdx; commandJ++) {
    			temp[z] = array[commandJ];
    			z++;
    		}
    		//temp정렬
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
