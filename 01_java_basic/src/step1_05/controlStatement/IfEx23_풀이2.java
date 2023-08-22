package step1_05.controlStatement;
//23-08-21 15:10 ~ 15:20
import java.util.Random;
import java.util.Scanner;

/*
 * # 연산자 기호 맞추기 게임
 * 
 * 1) 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2) 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3) 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지
 * 4) 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 2번
 */

public class IfEx23_풀이2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int r1 = ran.nextInt(10) +1;
		int r2 = ran.nextInt(10) +1;
		int r3 = ran.nextInt(4) + 1;
		int result = 0 ; 
		if (r3 ==1) {
			result = r1 + r2;
		}
		else if (r3 ==2) {
			result = r1 - r2;
		}
		
		else if (r3 ==3) {
			result = r1 * r2;
			
		}
		else if (r3 ==4) {
			result = r1 % r2;
		}
		
		System.out.println(r1 + " ? " + r2 + " = " + result);
		System.out.print("정답은 : ");
		int answer = scan.nextInt();
		
		if (r3 == answer )System.out.println("정답");
		else System.out.println("떙");
	}

}
