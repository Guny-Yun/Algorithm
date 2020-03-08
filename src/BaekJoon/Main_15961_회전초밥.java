package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15961_회전초밥 {

	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] sushi = new int[N];
		for(int i = 0 ; i<N;i++)sushi[i] = Integer.parseInt(br.readLine());
		int[] eat= new int[d+1];
		eat[c]++;
        int cnt = 1;
        for (int i = 0; i < k; i++) {
        	if (eat[sushi[i]]++ == 0) {
        		cnt++;
        	}
        }
        int res = cnt;
        for (int i = k; i < N + k; i++) {
            if(--eat[sushi[i - k]] == 0) cnt--;
            if(eat[sushi[i % N]]++ == 0) cnt++;
            res = Math.max(res, cnt);
        }
        System.out.println(res);
	}
}
