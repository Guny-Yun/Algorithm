package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2947_나무조각 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < 5; i++) {
			int k = 0;
			for(int j = 1; j < 5-i;j++) {
				if(arr[k] > arr[j]) {
					int tmp = arr[k];
					arr[k] = arr[j];
					arr[j] = tmp;
					for (int a : arr) {
						System.out.print(a + " ");
					}
					System.out.println();
				}
				k++;
			}
		}
	}

}
