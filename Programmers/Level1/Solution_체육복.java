package Level1;

public class Solution_체육복 {
	static int n = 5;
	static int[] reserve = {3};
	static int[] lost = {2,4};
	public static void main(String[] args) {
		int answer = 0;
		int[] check = new int[n+1];
		
		for(int i = 0 ; i < lost.length;i++) {
			check[lost[i]] -= 1; 
		}
		for(int i = 0 ; i< reserve.length;i++) {
			check[reserve[i]] += 1;
		}
		for(int i = 1; i< n;i++) {
			if(check[i] == -1) {
				if(check[i-1] == 1) {
					check[i-1] = check[i] = 0;
				}
				else if(check[i+1] == 1) {
					check[i+1] = check[i] = 0;
				}
			}
		}
		for(int i =1; i <= n;i++) {
			if(check[i] != -1) answer++;
		}
		System.out.println(answer);
	}

}
