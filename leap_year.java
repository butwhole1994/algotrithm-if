//https://www.acmicpc.net/problem/2753
import java.util.*;
public class leap_year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		if(a%4==0 & a%100!=0 || a%400==0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
