public class Test3 {
	/*class Solution555 {
		  public long[] solution(int x, int n) {
			  long[] answer = new long[n];
			  for(int i = 0; i < n ; i++) {
				 if(x == x*1) {
					 answer[i] = x + (i*x);
				 } else if(x == x*-1) {
					 answer[i] = x + (-i*x);
				 }
		      }
			  return answer;
		  }
		}*/
	
		  public long[] solution5(int x, int n) {
			  long[] answer = new long[n];
			  for(int i = 0; i < n ; i++) {
				 if(x == x*1) {
					 answer[i] = x + (i*x);
				 } else if(x == x*-1) {
					 answer[i] = x + (-i*x);
				 }
		      }
			  return answer;
		  }
	
	
	public static void main(String arsg[]) {
		long[] result = new Test3().solution5(-4,2);
		
		for(int i = 0; i < result.length; i++) {
    		System.out.println(result[i]);
    	}
		
		long[] result1 = new Test3().solution5(4,3);
		
		for(int i = 0; i < result1.length; i++) {
    		System.out.println(result1[i]);
    	}
	}
}
