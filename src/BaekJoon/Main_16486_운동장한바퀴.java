package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_16486_운동장한바퀴 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float d1 = Float.parseFloat(br.readLine());
		float d2 = Float.parseFloat(br.readLine());
		
		System.out.println(String.format("%.6f", 2 * 3.141592f * d2 + 2 * d1));
	}
}
