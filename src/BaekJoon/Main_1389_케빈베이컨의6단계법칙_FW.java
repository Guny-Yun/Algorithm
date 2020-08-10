package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1389_케빈베이컨의6단계법칙_FW {
	static int n,m;
    static int map[][];
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                map[i][j]=(i==j)?0:9999999;
            }
        }
        
        for(int i = 0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y]=1; map[y][x]=1;
        }
        
        for(int k = 1 ; k<= n ; k++){
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= n ; j++){
                    if(map[i][j]> map[i][k]+map[k][j]){
                        map[i][j]=map[i][k]+map[k][j];
                    }
                }
            }
        }
        
        int res[] = new int[n+1];
        int min = Integer.MAX_VALUE;
        
        for(int i = 1 ; i<= n ; i++){
            int sum=0;
            for(int j = 1 ; j<= n ; j++){
                sum+=map[i][j];
            }
            res[i]=sum;
            if(sum<min){
                min = sum;
            }
        }
        
        for(int i = 1 ; i<= n ; i++){
            if(res[i]==min){
                System.out.println(i);
                break;
            }
        }
    }

}
