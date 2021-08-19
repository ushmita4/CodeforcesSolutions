import java.io.*;
import java.util.*;
import java.util.Arrays;
public class whosopposite {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        int T;
        T=sc.ni();
        long a,b,c,d,n,f=0,i;
        for(i=1;i<=T;i++)
        {
            a=sc.nl();
            b=sc.nl();
            c=sc.nl();
            n=2*Math.abs(a-b);
            if(a>n||b>n||c>n)
            f=-1;
            else
            {
                d=c+(n/2);
                while(d>n)
                d-=n;
                f=d;
            }
            pw.println(f);
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
        long nl() {
            return Long.parseLong(next());
        }
    }
}
