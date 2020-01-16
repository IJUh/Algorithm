/*문자 뒤집어서 출력하기*/
public class reverseString {

	public static String reverse(String toReverse) {
		char[] reverseChar = new char[toReverse.length()];
		int i = 0;
		
		for(int idx = toReverse.length() -1; idx >= 0; idx--) {
			reverseChar[i] = toReverse.charAt(idx);
			i++;
		}
		
		return String.valueOf(reverseChar);
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString.reverse("hello"));
		System.out.println(reverseString.reverse("i am tall"));
	}
}
