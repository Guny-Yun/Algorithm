package Level1;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_실패율 {
	static int N = 5;
	static int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };

	public static void main(String[] args) {
		int[] clear = new int[N + 2];
		int people = stages.length; //사람 수
		for (int i = 0; i < stages.length; i++) {
			clear[stages[i]]++;
		}//clear에는 해당 스테이지를 도전중인 사람들의 수가 기록됨.
		
		Fail[] fails = new Fail[N+1];
		fails[0] = new Fail(0,-1);
		for(int i = 1; i < clear.length -1;i++) {
			if(clear[i] == 0)fails[i] = new Fail(i,0);
			else fails[i] = new Fail(i,(double)clear[i]/people);
			people -= clear[i];
		}
		
		Arrays.sort(fails, new Comparator<Fail>() {
			@Override
			public int compare(Fail o1, Fail o2) {
				if(o1.rate == o2.rate)return o1.stage-o2.stage;
				else return -Double.compare(o1.rate, o2.rate);
			}
		});
		int[] answer = new int[N];
		for(int i = 0 ; i < N;i++) {
			answer[i] = fails[i].stage;
		}
		for(int a : answer)System.out.print(a+ " ");
	}

	static class Fail {
		int stage; 	
		double rate;

		public Fail(int stage, double rate) {
			this.stage = stage;
			this.rate = rate;
		}
	}
}
