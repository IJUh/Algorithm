import java.util.Stack;

public class BinaryGap {
	public static int solution(int N) {
    	int answer = 0;
    	Stack<Integer> binaryStack = new Stack<Integer>();
    	int mock = 0;
    	int namuji = 0;
    	int first = -1;
    	int second = -1;
    	int gap = 0;
    	int count = 0;
    	do {
    		mock = N/2;
    		namuji = N%2;
    		binaryStack.push(namuji);
    		N = mock;
    	} while(N != 0);

    	int size = binaryStack.size();
    	int[] binary = new int[size];
    	int index = 0;
    	
    	while(!binaryStack.empty()) {
    		binary[index] = binaryStack.pop();
    		size = binaryStack.size();
    		index++;
    	}
    	
    	for(index = 0; index < binary.length ; index++) {
    		if(binary[index] == 1) {
    			count++;
    			if(first == -1) { 
    				first = index;
    			} else {
    				second = index;
    				if(gap < second - first - 1) {
    					gap = second - first - 1;
    				}
					first = index;
					second = -1;
    			}
    		}
    	}
    	if(count == binary.length) {
    		return 0;
    	}
    	return answer = gap;
    }
	
	public static void main(String[] args) {
		//System.out.println(BinaryGap.solution(1041));
		System.out.println(BinaryGap.solution(1162));
		//System.out.println(BinaryGap.solution(7));
		//System.out.println(BinaryGap.solution(529));
		//System.out.println(BinaryGap.solution(1));
		//System.out.println(BinaryGap.solution(5));
		
	}
}
