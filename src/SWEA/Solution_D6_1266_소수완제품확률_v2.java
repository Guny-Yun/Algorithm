package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Solution_D6_1266_소수완제품확률_v2 {
    static int SkillA,SkillB;
    static double pA,pB,ppA,ppB;
    static double answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int tc=1;tc<=T;tc++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            SkillA=Integer.parseInt(st.nextToken());
            SkillB=Integer.parseInt(st.nextToken());
            pA=SkillA/100.0;
            pB=SkillB/100.0;
            ppA=0;ppB=0;
            sol(0,1,0,pA);
            sol(0,1,0,pB);
            answer=1-(ppA*ppB);
            System.out.print("#"+tc+" ");
            System.out.printf("%.6f\n",answer);
        }
    }
    static void sol(int v,double prob,int num,double type) {
        if(v==18) {
            for(int i=2;i*i<=num;i++) {
                if(num%i==0) {//소수가 아니라면
                    if(type==pA) ppA+=prob;
                    else ppB+=prob;
                }
            }
            return;
        }
        sol(v+1,prob*type,num+1,type);
        sol(v+1,prob*(1-type),num,type);
    }
}