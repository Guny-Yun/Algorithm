package BaekJoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_1247_부호 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int tc = 0; tc <3;tc++) {
			int N = Integer.parseInt(br.readLine());
			BigInteger zero = BigInteger.ZERO;
			BigInteger sum = BigInteger.ZERO;
			for(int i = 0 ; i < N;i++) {
				sum = sum.add(new BigInteger(br.readLine()));
			}
			if(sum.compareTo(zero) == 0) {
				sb.append("0\n");
			}else if(sum.compareTo(zero) > 0) {
				sb.append("+\n");
			}else {	
				sb.append("-\n");
			}
		}
		System.out.println(sb);
	}

}
