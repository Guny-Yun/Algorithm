package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_1076_저항 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();
		list.add("black");
		list.add("brown");
		list.add("red");
		list.add("orange");
		list.add("yellow");
		list.add("green");
		list.add("blue");
		list.add("violet");
		list.add("grey");
		list.add("white");
		int a = list.indexOf(br.readLine()) * 10;
		int b = list.indexOf(br.readLine());
		int c = list.indexOf(br.readLine());
		long answer = (long) ((a + b) * Math.pow(10, c));
		System.out.println(answer);
	}

}
