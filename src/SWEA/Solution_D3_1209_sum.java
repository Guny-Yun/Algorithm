package SWEA;
import java.util.Scanner;
public class Solution_D3_1209_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc;
        for(int k = 0; k<10;k++) {
            tc = sc.nextInt();
             
            int[][] array = new int[100][100];
            int max = Integer.MIN_VALUE, sum =0;
             
            for(int i = 0;i < 100;i++) {
                for(int j = 0;j<100;j++) {
                    array[i][j] = sc.nextInt();
                }
            }
             
            for(int i = 0; i <100;i++) {
                for(int j = 0;j<100;j++) {
                    sum += array[i][j];
                }   
                max = Math.max(max, sum);
                sum = 0;
            }
            for(int i = 0; i<100;i++) {
                for(int j=0;j<100;j++) {
                    sum += array[j][i];
                }
                max = Math.max(max, sum);
                sum = 0;
            }
             
             
            for(int i =0;i<100;i++) {
                sum += array[i][i];
                max = Math.max(max, sum);
            }sum = 0;
            for(int i =0;i<100;i++) {
                sum += array[i][99-i];
                max = Math.max(max, sum);
            }sum = 0;
            System.out.println("#" + tc + " " + max);
        }
    }
 
}