package step1_05.controlStatement;
//23-08-20 19:21

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * //23-08-20 19:22 ~ 19:25
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 * 
 */

public class IfEx16_풀이2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = scan.nextInt();
		
		Random ran = new Random();
		
		int r = ran.nextInt(100) + 1; 
		
		System.out.println(r);
		int result = 0 ;
		if (r % 2 == 0) {
			result = 0;
		}
		else if (r % 2 == 1) {
			result = 1;
		}
		
		if (result == choice) System.out.println("정답");
		else System.out.println("땡");
		
	}

}
