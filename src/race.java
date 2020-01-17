import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.
����� ��
participant	completion	return
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
����� �� ����
���� #1
leo�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #2
vinko�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #3
mislav�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.

 */
public class race {
	  public static String solution(String[] participant, String[] completion) {
		  	Arrays.sort(participant);
		  	Arrays.sort(completion);
		  	Map<Integer,String> ht = new Hashtable<Integer,String>();
		  	Map<Integer,String> compHt = new Hashtable<Integer,String>();
		  	
	        for(int idx = 0; idx < participant.length; idx++) {
	        	ht.put(idx, participant[idx]);
	        }
	        for(int idx = 0; idx < completion.length; idx++) {
	        	compHt.put(idx, completion[idx]);
	        }
	        
	        Set<Integer> keySet = compHt.keySet();
	        for(int key : keySet) {
	        	if(ht.get(key).equals(compHt.get(key))) {
	        		ht.remove(key);
	        	}
	        }
	        int ret = 0;
	        for(int key : ht.keySet()) {
	        	ret = key;
	        };
	        
		  	String answer = ht.get(ret);
	        return answer;
	        
	    }
	  
	  
	  public static void main(String[] args) {
		  String[] ex1 = {"leo", "kiki", "eden"};
		  String[] ex1_ret = {"eden", "kiki"};
		  String[] ex2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		  String[] ex2_ret = {"josipa", "filipa", "marina", "nikola"};
		  String[] ex3 = {"mislav", "stanko", "mislav", "ana"};
		  String[] ex3_ret = {"stanko", "ana", "mislav"};
		  System.out.println(race.solution(ex1,ex1_ret));
		  System.out.println(race.solution(ex2,ex2_ret));
		  System.out.println(race.solution(ex3,ex3_ret));
	  }
}
