package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_1406_에디터 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		Stack<Character> lst = new Stack<>();
		Stack<Character> rst = new Stack<>();
		for(int i = 0 ; i < sb.length();i++) {
			lst.push(sb.charAt(i));
		}
		for(int i = 0 ; i < N;i++) {
			char[] comm = br.readLine().toCharArray();
			
			switch(comm[0]) {
			case 'P':
				lst.add(comm[2]);
				break;
			case 'L':
				if(!lst.isEmpty()) {
					rst.add(lst.pop());
				}break;
			case 'D':
				if(!rst.isEmpty()) {
					lst.add(rst.pop());
				}break;
			case 'B':
				if(!lst.isEmpty()) {
					lst.pop();
				}
				break;
			}
		}
		StringBuilder answer = new StringBuilder();
		while(!lst.isEmpty()) {
			rst.add(lst.pop());
		}
		while(!rst.isEmpty()) {
			answer.append(rst.pop());
		}
		System.out.println(answer);
	}

}
