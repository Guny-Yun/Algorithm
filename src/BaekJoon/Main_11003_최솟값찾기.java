package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_11003_최솟값찾기 {
	static int N, L;
	private static class DeQue {
		int[] idx;
		int[] value;
		int left, right;

		DeQue() {
			idx = new int[N];
			value = new int[N];
			left = right = 0;
		}

		boolean isEmpty() {
			return left == right;
		}

		int peekLastValue() {
			return value[right - 1];
		}

		int peekFirstIdx() {
			return idx[left];
		}

		int peekFirstValue() {
			return value[left];
		}

		void removeLast() {
			if (--right < 0) {
				right = N - 1;
			}
		}

		void removeFirst() {
			if (++left == N) {
				left = 0;
			}
		}

		void addLast(int I, int V) {
			idx[right] = I;
			value[right] = V;
			if (++right == N) {
				right = 0;
			}
		}
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		DeQue deq = new DeQue();

		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());

			while (!deq.isEmpty() && deq.peekLastValue() > tmp) {
				deq.removeLast();
			}
			
			deq.addLast(i, tmp);
			if (deq.peekFirstIdx() <= i - L) {
				deq.removeFirst();
			}
			
			bw.write(deq.peekFirstValue() + " ");
		}
		bw.flush();
		bw.close();
	}
	static class Node{
		int val;
		int idx;
		
		Node(int val, int idx){
			this.val = val;
			this.idx = idx;
		}
	}
}
