package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;
//23-01-30 15:41 ~ 15:46
/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_풀이3 {

	public static void main(String[] args) {
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("0 : 가위 , 1 : 바위 , 2 : 보");
		me = scan.nextInt();
		com = ran.nextInt(3);
		if(me == com) {
			System.out.println("비겼다.");
		}
		else if (me == 0 && com == 1) {
			System.out.println("이겼다.");
		}
		else if (me == 1 && com == 2) {
			System.out.println("이겼다.");
		}
		else if (me == 2 && com == 0) {
			System.out.println("이겼다.");
		}
		else System.out.println("졌다.");
 	}
	

}
