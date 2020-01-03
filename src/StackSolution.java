import java.util.Stack;

class Solution {
    public int[] solution(int[] heights) {
    	int[] answer = new int[heights.length];
    	Stack<Integer> stack = new Stack<Integer>();
    	int[] temp = new int[heights.length];
    	
    	//stack¿¡ insert
    	for(int i = 0; i < heights.length; i++) {
    		stack.push(heights[i]);
    	}
    	
    	for(int i = heights.length-1; i >= 0; i--) {
    		for(int j = i-1; j >= 0; j--) {
    			if(heights[i] < heights[j]) {
    				answer[i] = j+1;
    				break;
    			}
    		}
    	}
    	 /*while(!stack.empty()) {
    	        final int SENDER = stack.size() - 1;
    	        int top = stack.pop();
    	        for(int i=SENDER; i>=0; i--) {
    	            if(top < heights[i]) {
    	                answer[SENDER] = i+1;
    	                break;
    	            }
    	        }
    	    }*/

    	    return answer;
    	}
}

public class StackSolution {
    public static void main(String args[]) {
    	Solution ss = new Solution();
    	int[] testCase1 = {6,9,5,7,4};
    	int[] result1 = ss.solution(testCase1);
    	int[] testCase2 = {3,9,9,3,5,7,2};
    	int[] result2 = ss.solution(testCase2);
    	int[] testCase3 = {1,5,3,6,7,6,5};
    	int[] result3 = ss.solution(testCase3);    	
    	
    	for(int i = 0; i < testCase1.length; i++) {
    		System.out.print(result1[i] + " ");
    	}

    	System.out.println("");
    	
    	for(int i = 0; i < testCase2.length; i++) {
    		System.out.print(result2[i] + " ");
    	}
    	
    	System.out.println("");
    	
    	for(int i = 0; i < testCase3.length; i++) {
    		System.out.print(result3[i]);
    	}
    }
}