//https://www.acmicpc.net/problem/1330
import java.util.*;

public class compare_A_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}
		if(a<b) {
			System.out.println("<");
		}
		if(a==b) {
			System.out.println("==");
		}

	}

}
