import java.io.*;
import java.util.*;
 
public class infinitytable {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int T = sc.ni();
        for (int t = 0; t < T; t++) {
        	int k = sc.ni();
        	int a = 1;
		    int x = 1;
		    int i = 1;

            while (k >= x + a)
		{
			x += a;
			a += 2;
			i += 1;
		}
        
		int m = k - x + 1;
		if (m <= i)
			pw.println(m+" "+i);
		else
			pw.println(i+" "+(i-(m-i)));
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
