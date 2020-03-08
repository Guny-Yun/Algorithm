package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution_D3_1244_최대상금 {
	static int max;
	static char[] data;
    static int num;
    
    static void SWAP(int a, int b) {// a , b는 index, swap메소드
        char temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
    static int pow(int n, int r) {
        if (r == 0)
            return 1;
        else
            return n * pow(n, r - 1);
    }
     
    static void sol(int v,int n) {
        if (n == num) {
            int val = 0;
            for (int i = 0; i < data.length; i++)
                val += (data[i] - '0') * pow(10, data.length - 1 - i);
           max=val>max?val:max;
           return;
        }
        for (int i = v; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                if (data[i]<=data[j]) {
                    SWAP(i, j);
                    sol(i,n + 1);
                    SWAP(i, j);
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            String s[] = br.readLine().split(" ");
            data = s[0].toCharArray();//숫자열을 data배열로
            num = Integer.parseInt(s[1]); //교환할 수있는 횟수
            max = -1;
            sol(0,0);//dfs
            System.out.println("#" + tc + " " + max);
        }
    }
    
}