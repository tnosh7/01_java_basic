package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_풀이 {

	public static void main(String[] args) {
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
	
		int rCom = ran.nextInt(3); 
		
		System.out.println("0 : 가위 , 1 : 바위 , 2 : 보 입력 : " );
		int num = scan.nextInt() ; 
		
		System.out.println();
		
		if (num == 0 && rCom == 1) {
			System.out.println("이겼다");
		}
		else if (num == 1 && rCom ==2) {
			System.out.println("이겼다");
		}
		else if (num == 2 && rCom ==0) {
			System.out.println("이겼다");
		}
		else {
			System.out.println("졌다");
		}
		scan.close();
		
	}

}
