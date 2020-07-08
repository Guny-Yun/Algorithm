package Level2;

public class Solution_최댓값과최솟값 {

	static String s = "-1 -2 -3 -4";
	public static void main(String[] args) {
		String answer = "";
		
		String[] input = s.split(" ");
		int[] arr = new int[input.length];
		for(int i = 0 ; i < input.length;i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < arr.length;i++) {
			max = Integer.max(max, arr[i]);
			min = Integer.min(min, arr[i]);
		}
		answer = min + " " + max;
		System.out.println(answer);
	}
}
