package BaekJoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2439_별찍기2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N;i++) {
			for(int j = 0 ; j < N - i;j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
