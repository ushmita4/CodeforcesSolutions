import java.io.*;
import java.util.*;
import java.util.Arrays;
public class MochaandMath {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        int i,x;
        int T = sc.ni();
        for (int t = 0; t < T; t++) {
        	int n = sc.ni();
        	int arr[]=new int[n];
            for(i=0;i<n;i++)
            {
                arr[i]=sc.ni();
            }
            x=arr[0];
            for(i=1;i<n;i++)
            x&=arr[i];
            pw.println(x);
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
