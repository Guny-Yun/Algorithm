package Ebay;
import java.util.*;
public class Solution_5 {
    static int solution(int[] T,int[][] R,int K){
        int n=T.length;
        int[] indegree=new int[n+1];

        ArrayList<Integer> list[]=new ArrayList[n+1];
        for(int i=1;i<=n;i++) list[i]=new ArrayList<>();
        for(int i=0;i<R.length;i++){
            int[] r=R[i];
            int st=r[0];
            int en=r[1];
            list[st].add(en);
            indegree[en]++;
        }
        //[0] : 일을하고 있는애 , [1] : 끝낸 시간이라고 할래요?
        PriorityQueue<int[]> q=new PriorityQueue<>(new Comparator<int[]>(){
                public int compare(int[] o1,int[] o2){
                    return Integer.compare(o1[1],o2[1]);
                }
        });
        //일을하는 조건. 화살이 안꽂힌애.
        for(int i=1;i<=n;i++) {
            if(indegree[i]==0) q.add(new int[]{i,T[i-1]});//일, 끝난시간 넣어줌
        }

        //시뮬레이션 안에서
        while(!q.isEmpty()){
            int[] p=q.poll(); //제일 빨리 끝난순으로 q에서 poll이 됨
            int cur=p[0]; //현재 일이 끝난 애
            int time=p[1]; //그 시간
            if(cur==K) return time;
            for(int i=0;i<list[cur].size();i++){//list는 화살을 꽂은 대상을 찾는 과정
                int next=list[cur].get(i);
                indegree[next]--;
                if(indegree[next]==0){
                    q.add(new int[]{next,time+T[next-1]});
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        int[] T=new int[]{5,8,3,7,10,5,4};
        int[][] R=new int[][]{
                {1,2},
                {2,4},
                {1,4},
                {6,5},
                {3,5},
                {4,6}
        };
        int K=5;
        System.out.println(solution(T,R,K));
    }
}