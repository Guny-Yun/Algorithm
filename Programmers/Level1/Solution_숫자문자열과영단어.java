package Level1;

public class Solution_숫자문자열과영단어 {

	public static void main(String[] args) {
		int answer = solution("one4seveneight");
		System.out.println(answer);
	}
	static String[] arr = {"zero","one","two","three","four",
			"five","six","seven","eight","nine"};
	public static int solution(String s) {
		int answer = 0;
		for(int i = 0 ; i < 10;i++) {
			String tmp = arr[i];
			s = s.replaceAll(tmp, i+"");
		}
		answer = Integer.parseInt(s);
		return answer;
	}
}
