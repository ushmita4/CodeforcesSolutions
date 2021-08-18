import java.io.*;
import java.util.*;
import java.util.Arrays;
public class dislikeofthrees {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        int i=0,x,k=1;
        int con[]=new int[1000];
        while(i<1000)
        {
          if((k%3!=0||k%10!=3)&&(k%3!=0&&k%10!=3))
          {
            con[i]=k;
            i++;
          }
          k++;
        }
        
        int T = sc.ni();
        int arr[]=new int[T];
       for (int t = 0; t< T; t++) {
        	arr[t]=sc.ni();
        	pw.println(con[arr[t]-1]);
       }
        pw.close();
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int ni() {
            return Integer.parseInt(next());
        }
    }
}
