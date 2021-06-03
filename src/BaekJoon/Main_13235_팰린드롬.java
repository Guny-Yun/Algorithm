package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_13235_팰린드롬 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
        boolean isPal = true;

        if (s.length() == 1) 
            System.out.println(true);
        else {
            for (int i=0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                	isPal = false;
                    break;
                }
            }
            System.out.println(isPal);
        }
	}
}
