package Level1;

public class Solution_제일작은수제거하기 {
	static int[] arr = {3,4,1,6,7,5};
	public static void main(String[] args) {
		int[] answer = new int[arr.length-1];
//		if(arr.length == 1)return new int[] {-1};
		int min = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < arr.length;i++) {
			min = Math.min(min, arr[i]);
		}
		int idx = 0;
		for(int i = 0; i < answer.length;i++) {
			if(arr[idx] == min) {
				idx++;
				i--;
				continue;
			}
			answer[i] = arr[idx];
			idx++;
		}
		for(int a : answer)System.out.print(a + " ");
	}

}
