
public class Test2 {
	
		  public boolean solution(String s) {
			  boolean answer = true;
			  int count = 0;
		      if(s.length() == 4 || s.length() == 6) {
		    	  for(int i = 0; i < s.length(); i++) {
		    		  if("0".equals(String.valueOf(s.charAt(i)))) {
		    			  count++;
		    		  } else if("1".equals(String.valueOf(s.charAt(i)))) {
		    			  count++;
		    		  } else if("2".equals(String.valueOf(s.charAt(i)))) {
		    			  count++;
		    		  } else if("3".equals(String.valueOf(s.charAt(i)))) {
		    			  count++;
		    		  } else if("4".equals(String.valueOf(s.charAt(i)))) {
		    			  count++;
		    		  } else if("5".equals(String.valueOf(s.charAt(i)))) {
		    			  count++;
		    		  } else if("6".equals(String.valueOf(s.charAt(i)))) {
		    			  count++;
		    		  } else if("7".equals(String.valueOf(s.charAt(i)))) {
		    			  count++;
		    		  } else if("8".equals(String.valueOf(s.charAt(i)))) {
		    			  count++;
		    		  } else if("9".equals(String.valueOf(s.charAt(i)))) {
		    			  count++;
		    		  } 
		    	  }
		    	  if(count == s.length()) {
		    			  answer = true;
		    		  } else {
		    			  answer = false;
		    		  }
	    		  }
		      		else {
		      			answer = false;
		      		}
		      		return answer;
		  }
	
	public static void main(String arsg[]) {
		System.out.println(new Test2().solution("1234"));
		System.out.println(new Test2().solution("a234"));
	}
}
