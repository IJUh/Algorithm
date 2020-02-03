import java.util.ArrayList;
import java.util.List;

public class Yoda {

	public static String[] solution(int N, String[] strArray) {
		String[] answer = new String[N];
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < N ; i++) {
			list.clear();
			String[] temp = strArray[i].split(" ");
			for(int j = 0; j < temp.length; j++) {
				list.add(temp[j]);
			}
			list.remove(0);
			list.remove(0);
			list.add(list.size(),temp[0]);
			list.add(list.size(),temp[1]);
			answer[i] = list.toString().replaceAll(",", "");
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] str = {"I will go now to find the Wookiee","Solo found the death star near planet Kessel","I'll fight Darth Maul here and now","Vader will find Luke before he can escape"};
		String[] result = Yoda.solution(4,str);
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
	}
}
