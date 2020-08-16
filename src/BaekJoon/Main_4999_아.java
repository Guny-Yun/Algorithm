package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_4999_아 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String jae = br.readLine();
		String doc = br.readLine();
		
		if(jae.length() >= doc.length())System.out.println("go");
		else System.out.println("no");
		
	}

}
