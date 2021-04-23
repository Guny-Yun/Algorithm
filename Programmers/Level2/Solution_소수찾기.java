package Level2;

import java.util.ArrayList;

public class Solution_소수찾기 {
	static int answer = 0;
	static boolean[] visit = new boolean[7];
	
	static String numbers = "011";
	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		String tmp = "";

		for (int i = 1; i <= numbers.length(); i++) {
			rec(numbers, tmp, i);
		}
		for (int x : list) {
			cal(x);
		}
		System.out.println(answer);
	}
	public static void rec(String s, String tmp, int len){
        if(tmp.length() == len){
            if(!list.contains(Integer.parseInt(tmp)))
                list.add(Integer.parseInt(tmp));
            return;
        }
        for(int i = 0; i < s.length();i++){
            if(visit[i])continue;
            
            tmp += s.charAt(i);
            visit[i] = true;
            rec(s, tmp, len);
            visit[i] = false;
            
            tmp = tmp.substring(0, tmp.length() - 1);
        }
    }
	public static void cal(int n){
        if(n == 0)return;
        if(n == 1)return;
        
        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i == 0) return;
        }
        answer++;
    }

}
