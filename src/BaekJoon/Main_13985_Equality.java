package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13985_Equality {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		String op = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		String equl = st.nextToken();
		int res = Integer.parseInt(st.nextToken());
		if(A + B == res)System.out.println("YES");
		else System.out.println("NO");
	}

}
