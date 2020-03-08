package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2941_크로아티아알파벳 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine().trim();
		
		String[] cro = {"c=", "c-", "dz=", "d-", "lj" ,"nj" ,"s=","z="};
		
		for(int i = 0  ; i< 8; i++) {
			if(in.contains(cro[i])) {
				in = in.replace(cro[i], "*");
			}
		}
		System.out.println(in.length());
	}
}
