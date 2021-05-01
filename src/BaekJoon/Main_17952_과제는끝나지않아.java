package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_17952_과제는끝나지않아 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int score = 0;
		StringTokenizer st;
		Stack<Task> stack = new Stack<>();
		for(int time = 0; time < N ; time++) {
			st = new StringTokenizer(br.readLine());
			int on = Integer.parseInt(st.nextToken());
			if(on == 1) { // 과제 들어옴
				stack.push(new Task(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
			}
			
			if(!stack.isEmpty()) {
				stack.peek().work();
				
				if(stack.peek().time == 0)
					score += stack.pop().score;
			}
		}
		System.out.println(score);
	}
	static class Task{
		int score;
		int time;
		public Task(int score, int time) {
			this.score = score;
			this.time = time;
		}
		public void work() {
			this.time--;
		}
	}
}
