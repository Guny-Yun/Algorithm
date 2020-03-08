package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class idxhgt{
	int idx;
	int height;
}

public class Main_2493_탑 {
	public static void main(String[] args) throws IOException {
		Stack<idxhgt> stack = new Stack<idxhgt>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i =1; i<=n;i++){
			int k = Integer.parseInt(st.nextToken());
			
			while(!stack.empty()) {
				if(stack.peek().height > k) {
				System.out.print(stack.peek().idx + " ");
				break;
				}
				else stack.pop();
			}
			if(stack.empty())System.out.print("0 ");
			idxhgt c = new idxhgt();
			c.idx = i;
			c.height = k;
			
			stack.push(c);
		}
	}
}
