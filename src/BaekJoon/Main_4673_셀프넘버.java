package BaekJoon;

public class Main_4673_셀프넘버 {

	public static void main(String[] args) {
		boolean[] arr = new boolean[10000];
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < arr.length; i++) {
			if (d(i) >= 10000) {
				continue;
			}
			arr[d(i)] = true;
		}
		for (int i = 1; i < arr.length; i++) {
			if (!arr[i])
				sb.append(i + "\n");
		}
		System.out.println(sb);
	}

	public static int d(int n) {
		int a = n / 1000;
		int b = (n % 1000) / 100;
		int c = (n % 100) / 10;
		int d = n % 10;

		return n + a + b + c + d;
	}

}
