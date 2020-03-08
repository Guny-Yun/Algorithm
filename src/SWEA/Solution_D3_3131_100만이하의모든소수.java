package SWEA;

public class Solution_D3_3131_100만이하의모든소수 {

	public static void main(String[] args) {
		int n = 100000;
		boolean[] arr = new boolean[n+1];
		for(int i = 2;i<arr.length;i++) 
			for(int j = i;j<=n/i;j++)if(!arr[i*j])arr[i*j] = true;
		for(int i = 2; i<arr.length;i++)if(!arr[i])System.out.print(i + " ");
	}
}
