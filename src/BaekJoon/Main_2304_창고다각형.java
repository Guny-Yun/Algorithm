package BaekJoon;

import java.util.Scanner;
public class Main_2304_창고다각형 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int max = Integer.MIN_VALUE;
        int[] data = new int[1000+1];
        int p = 0;
        for(int i=0; i<N; i++) { 
            int num = in.nextInt();
            int h = in.nextInt();
            data[num] = h;
        }
        for(int i=0; i<data.length; i++) {
            if(max<data[i]) {
                max = data[i];
                p=i;
            }
        }
        for(int i=0; i<p-1; i++) {
            if(data[i] != 0) {
                for(int j=i+1; j<p; j++) {
                    if(data[j] <= data[i])
                        data[j] = data[i];
                    else {
                        if(data[i] == max)
                            break;
                    }   
                }
            }
        }
        
        for(int i=data.length-1; i>p; i--) {
            if(data[i] != 0) {
                for(int j=i-1; j>p; j--) {
                    if(data[j] <= data[i])
                        data[j] = data[i];
                    else {
                        if(data[i] == max)
                            break;
                    }   
                }
            }
        }
        int sum=0; 
        for(int k: data)
            sum+= k;
        System.out.println(sum);
    }
}