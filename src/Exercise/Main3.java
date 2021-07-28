package Exercise;

public class Main3 {
	static int N = 268;

	public static void main(String[] args) {
		StringBuilder answer = new StringBuilder();
		char[] arr = (N + "").toCharArray();
		if (N >= 0) {
			int idx = 0;
			for (int i = 0; i < arr.length; i++) {
				char val = arr[i];
				if (val > '5')
					answer.append(val);
				else {
					answer.append('5');
					idx = i;
					break;
				}
			}
			for (int i = idx; i < arr.length; i++) {
				answer.append(arr[i]);
			}
		} else {
			int idx = 0;
			answer.append('-');
			for (int i = 1; i < arr.length; i++) {
				char val = arr[i];
				if (val < '5') {
					answer.append(val);
				} else {
					answer.append('5');
					idx = i;
					break;
				}
			}
			for (int i = idx; i < arr.length; i++) {
				answer.append(arr[i]);
			}
		}
		System.out.println(answer.toString());
	}

}
