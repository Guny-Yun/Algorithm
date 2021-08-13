package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10972_다음순열 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0  ; i < N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if(perm(arr)) {
			for(int a : arr) {
				System.out.print(a + " ");
			}
		}else System.out.println(-1);
		
	}
	public static boolean perm(int[] arr) {
		int i = arr.length-1;
		while(i > 0 && arr[i-1] >= arr[i])i-=1;
		
		if(i <=0)return false;
		
		int j = arr.length-1;
		while(arr[j] <= arr[i-1])j-= 1;
		
		swap(arr,i-1,j);
		
		j = arr.length-1;
		while(i < j) {
			swap(arr,i,j);
			i+=1;
			j-=1;
		}
		return true;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
