//https://www.acmicpc.net/problem/14681
import java.util.*;
public class Choosing_Quadrant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>0) {
			if(b>0) {
				System.out.println("1");
			}else {
				System.out.println("4");
			}
		}
		if(a<0) {
			if(b>0) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}

	}

}