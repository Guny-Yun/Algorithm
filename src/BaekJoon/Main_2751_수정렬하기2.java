package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main_2751_수정렬하기2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> data = new ArrayList<Integer>();
        for(int i=0; i<n; i++) {
            data.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(data);
        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i<n; i++) {
        	sb.append(data.get(i) + "\n");
        }
        System.out.println(sb);
	}

}