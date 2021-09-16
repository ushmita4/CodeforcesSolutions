import java.io.*;
import java.util.*;
 
public class prettypermutations {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        int T = sc.ni();
        for (int t = 0; t < T; t++) {
            int l=sc.ni();
            int r=sc.ni();
            if(r<l*2)
            {
                pw.println(r-l);
            }
            else
            {
                pw.println((r-1)/2);
            }
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
