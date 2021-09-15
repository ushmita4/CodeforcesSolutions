import java.util.*;
public class sol {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0) {
			int c = s.nextInt(), d = s.nextInt();
			if(c==d) {
				System.out.println((c!=0)?1:0);
			} else if((c-d)%2==0) {
				System.out.println(2);
			} else {
				System.out.println(-1);
			}
		}
		s.close();
	}
}
