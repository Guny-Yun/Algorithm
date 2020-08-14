package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1541_잃어버린괄호 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split("-");
		
		int res = 0;
		
		for(int i = 0; i < in.length;i++) {
			String[] tmp = in[i].split("\\+");
			int tmp_res = 0;
			for(int j = 0;j<tmp.length;j++) {
				tmp_res += Integer.parseInt(tmp[j]);
			}
			if(i != 0) tmp_res *= -1;
			
			res += tmp_res;
		}
		System.out.println(res);
	}

}
