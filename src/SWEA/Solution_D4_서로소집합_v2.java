package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_D4_서로소집합_v2{
   public static class Edge{
      int a,b;
      public Edge(int a, int b) {
         this.a = a;
         this.b = b;
      }
   }
   static int getParent(int[] p, int x) {
      if (p[x] == x) {
         return x;
      }
      return p[x] = getParent(p, p[x]);
   }
   static boolean findParent(int[] p, int a, int b) {
      a = getParent(p, a);
      b = getParent(p, b);
      if (a == b) {
         return true;
      } else {
         return false;
      }
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      List<Edge> v = new ArrayList<>();
      for(int tc=1; tc<=T; tc++) {
         System.out.print("#"+tc+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] p = new int[n + 1];
          for (int i = 1; i <= n; i++) {
             p[i] = i;
          }
            for(int i=0; i<m; i++) {
               st = new StringTokenizer(br.readLine());
               int check = Integer.parseInt(st.nextToken());
              int parent = Integer.parseInt(st.nextToken());
              int baby = Integer.parseInt(st.nextToken());
               if(check == 0) 
                  v.add(new Edge(parent, baby));           
               else if(check == 1){
                  if(findParent(p, parent, baby))
                     System.out.print("1");
                  else
                     System.out.print("0");
               }
            }
            System.out.println();
      }      
   }
}