package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_2635_수이어가기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = N ; i >= N/2;i--) {
			ArrayList<Integer> tmp_list = new ArrayList<Integer>();
			tmp_list.add(N);
			int tmp = N;
			int tmp2 = i;
			while(true) {
				if(tmp < 0)break;
				int tmp3 = tmp;
				
				if(tmp2 >= 0)tmp_list.add(tmp2);
				
				tmp = tmp2;
				tmp2 = tmp3 - tmp;
			}
			if(answer < tmp_list.size()) {
				answer = tmp_list.size();
				list = tmp_list;
			}
		}
		System.out.println(answer);
		for(Integer t : list)System.out.print(t + " ");
	}

}
