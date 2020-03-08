package BaekJoon;

import java.util.*;

public class Main_2884_알람시계{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int ansH = H;
        int ansM = M - 45;
        if(ansM < 0){
            ansM += 60;
            ansH--;
            if(ansH < 0){
                ansH += 24;
            }
        }
        System.out.println(ansH + " " + ansM);
        sc.close();
    }
}