package Ebay;

class Solution_3 {
    static long dp[];
   public static long solution(int n,int[][] products) {
      long answer=0;
      
      long[] getMoney=new long[products.length];
      
      for(int i=0;i<products.length;i++) {
         int[] product=products[i];
         
         getMoney[i]=product[1]*product[2];
         
         int cnt=product[2]*n;
         if(cnt>product[0]) cnt=product[0];
         
         answer+=cnt*product[1];
         product[0]-=cnt;
      }
      
       dp=new long[n+1];
       
       for(int day=1;day<=n;day++) {
          long max=0;
          int idx=0;
          for(int i=0;i<products.length;i++) {
             if(products[i][0]==0) continue;
             long money=getMoney(products,i);
             if(max<money) {
                max=money;
                idx=i;
             }
          }
          update(products,idx);
          answer+=max;
       }
       return dp[n]+answer;
    }
   static void update(int[][] products,int i) {
      if(products[i][0]<products[i][2]) products[i][0]=0;
      else products[i][0]-=products[i][2];
   }
   
   static long getMoney(int[][] products,int i) {
      int cnt=0;
      if(products[i][0]<products[i][2]) {
         cnt=products[i][0];
      }else {
         cnt=products[i][2];
      }
      return cnt*products[i][1];
   }
    
    
    public static void main(String[] args) {
       int n=3;
       int[][] products= {
             {6,5,1},
             {11,3,2},
             {7,10,3}
       };
       System.out.println(solution(n,products));
   }
}