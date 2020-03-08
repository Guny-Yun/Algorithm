package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1152_단어의개수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		String res[] = in.trim().split(" ");
		if(res[0].equals(""))System.out.println(0);
		else{
		System.out.println(res.length);
		}
	}
}
