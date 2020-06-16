package Level1;

public class Solution_비밀지도 {

	static int n = 6;
	static int[] arr1 = {46,33,33,22,31,50};
	static int[] arr2 = {27,56,19,14,14,10};
	public static void main(String[] args) {
		String[] answer = new String[n];
		for(int i = 0 ; i < n; i++) {
			String tmp = Integer.toBinaryString(arr1[i]|arr2[i]);
			tmp = String.format("%" + n + "s", tmp);
			tmp = tmp.replace("0", " ");
			tmp = tmp.replace("1", "#");
			answer[i] = tmp;
		}
		for(String s : answer)System.out.println(s);
		
	}

}
