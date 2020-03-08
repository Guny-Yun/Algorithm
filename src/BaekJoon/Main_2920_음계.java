package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2920_음계{

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[8];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<8;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] asc = {1,2,3,4,5,6,7,8};
		int[] desc = {8,7,6,5,4,3,2,1};
		boolean aflag = false;
		boolean dflag = false;
		for(int i = 0 ;i <8;i++) {
			if(arr[i] != asc[i]) {
				aflag = false;
				break;
			}
			aflag = true;
		}
		for(int i = 0; i<8;i++) {
			if(arr[i] != desc[i]) {
				dflag = false;
				break;
			}
			dflag = true;
		}
		if(aflag)System.out.println("ascending");
		if(dflag)System.out.println("descending");
		if(!dflag && !aflag)System.out.println("mixed");
	}

}
