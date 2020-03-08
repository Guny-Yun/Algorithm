package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_17284_VendingMachine {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int res = 5000;
		for (int i = 0; i < in.length; i++) {
			switch (in[i]) {
			case "1":
				res -= 500;
				break;
			case "2":
				res -= 800;
				break;
			case "3":
				res -= 1000;
				break;
			}
		}
		System.out.println(res);

	}

}
