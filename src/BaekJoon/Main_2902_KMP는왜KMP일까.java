package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2902_KMP는왜KMP일까 {

	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		String[] temp = in.split("-");
		for(int i= 0; i <temp.length;i++) {
			System.out.print(temp[i].charAt(0));
		}
		
	}

}
