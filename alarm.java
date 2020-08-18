//https://www.acmicpc.net/problem/2884
import java.util.*;
public class alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int h = a;
		int m = b-45;
		
		if(m<0) {
			h--;
			m += 60;
			if(h<0) {
				h += 24;
			}
		}
		System.out.println(h+" "+m);
	}

}
