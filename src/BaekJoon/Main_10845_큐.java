package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_10845_큐 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Queue<Integer> que = new LinkedList<Integer>(); 
		int back = 0;
		for(int i = 0 ; i < N;i++) {
			String[] in = br.readLine().split(" ");
			
			switch(in[0]){
			case "push":
				back = Integer.parseInt(in[1]);
				que.offer(back);
				break;
			case "pop":
				if(que.isEmpty()) {
					sb.append("-1\n");
				}
				else{
					int tmp = que.poll();
					sb.append(tmp + "\n");
				}
				break;
			case "size":
				sb.append(que.size()+"\n");
				break;
			case "empty":
				if(que.isEmpty())sb.append("1\n");
				else sb.append("0\n");
				break;
			case "front":
				if(que.isEmpty())sb.append("-1\n");
				else sb.append(que.peek()+"\n");
				break;
			case "back":
				if(que.isEmpty())sb.append("-1\n");
				else sb.append(back+"\n");
				break;
			}
		}
		System.out.println(sb.toString());
	}

}
