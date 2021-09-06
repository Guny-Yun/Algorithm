package 위클리챌린지;

public class Solution_5주차_모음사전 {

	public static void main(String[] args) {
		System.out.println(solution("AAAE"));
	}
	public static int solution(String word) {
        int answer = 0;
        int[] x = {781,156,31,6,1};
        int tmp = word.length();
        answer = word.length();
        String s = "AEIOU";
        
        for(int i = 0 ; i <word.length();i++){
            tmp = s.indexOf(word.charAt(i));
            answer += x[i]*tmp;
        }
        return answer;
    }
}
