package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Body{
	int height;
	int weight;
	int rank;
	public Body(int weight, int height) {
		this.weight = weight;
		this.height = height;
		this.rank = 1;
	}
}
public class Main_7568_덩치 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Body[] arr = new Body[T];
		
		for(int i = 0; i<T;i++) {
			st = new StringTokenizer(br.readLine());
			int wei = Integer.parseInt(st.nextToken());
			int hei = Integer.parseInt(st.nextToken());
			arr[i] = new Body(wei,hei);
		}
		for(int i = 0 ;i <T;i++){
			for(int j = 0 ; j<T;j++) {
				if(i==j)continue;
				if(arr[i].weight > arr[j].weight && arr[i].height > arr[j].height) {
					arr[j].rank++;
				}
			}
		}
		for(int i = 0; i<T;i++) {
			System.out.print(arr[i].rank + " ");
		}
	}

}
