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
		
		if(m<0) { // --나 += 등의 쓰임새를 기억해두자.a--는 1 뺀 값이 변수a가 된다.  a++는 1 더한 값이 a가 된다.
					// a-=b 나 a+=b의 경우 a,b를 더하거나 뺀 숫자가 a가 된다는 의미. 
			h--;
			m += 60;
			if(h<0) {
				h += 24;
			}
		}
		System.out.println(h+" "+m);
		//모든 답이 같은 형식으로 나오게 해서 sout의 횟수를 줄인다.
	}

}
