package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1713_후보추천하기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int[] rec = new int[K];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < K;i++) {
			rec[i] = Integer.parseInt(st.nextToken());
		}
		int[] stu = new int[101];
		List<Integer> list = new LinkedList<Integer>();
		
		for(int i = 0 ; i < K;i++) {
			if(stu[rec[i]] == 0) {
				if(list.size() < N) {
					list.add(rec[i]);
					stu[rec[i]]++;
				}else {
					int min_stu_rec = Integer.MAX_VALUE; // 추천수
					int min_stu_num = 0; // 학생 번호
					int min_stu_idx = 0; // 후보리스트에서 인덱스
					for(int j = 0; j < list.size();j++) {
						int stu_num = list.get(j);
						if(min_stu_rec > stu[stu_num]) {
							min_stu_rec = stu[stu_num];
							min_stu_num = stu_num;
							min_stu_idx = j;
						}
					}
					stu[min_stu_num] = 0;
					list.remove(min_stu_idx);
					list.add(rec[i]);
					stu[rec[i]]++;
				}
			}else {
				stu[rec[i]]++;
			}
		}
		Collections.sort(list);
		for(int i = 0 ; i < list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}

}
