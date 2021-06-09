package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2511_카드놀이 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] A = new int[10];
		int[] B = new int[10];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 10; i++)
			A[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 10; i++)
			B[i] = Integer.parseInt(st.nextToken());
		
		int res = 0;
		int a = 0;
		int b = 0;
		
		for(int i = 0 ; i < 10; i++) {
			if(A[i] > B[i]) {
				a += 3;
				res = 1;
			}else if(B[i] > A[i]) {
				b += 3;
				res = -1;
			}else if(A[i] == B[i]) {
				a += 1;
				b+= 1;
			}
		}
		System.out.println(a + " " + b);
		if(a > b)System.out.println("A");
		else if(a < b)System.out.println("B");
		else {
			boolean flag = true;
			for(int i = 9 ; i >= 0 ; i--) {
				if(A[i] > B[i]) {
					System.out.println("A");
					flag = false;
					break;
				}else if(A[i] < B[i]) {
					System.out.println("B");
					flag = false;
					break;
				}
			}
			if(flag)System.out.println("D");
		}
		
	}

}
