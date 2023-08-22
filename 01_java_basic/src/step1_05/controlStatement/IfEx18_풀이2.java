package step1_05.controlStatement;
//23-08-21 14:43 ~ 14:48

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_풀이2 {

	public static void main(String[] args) {
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		com = ran.nextInt(3);
		System.out.println("====가위 바위 보 게임====");
		System.out.print("0 : 가위 , 1 : 바위 , 2 : 보 입력하세요 : ");
		me = scan.nextInt();
		System.out.println(com + " : " + me);
		
		if (com == 0) {
			if (me == 1) System.out.println("내가 이겼다");
			else if (me == 2) System.out.println("내가 졌다");
			else System.out.println("비겼다");
		}
		else if (com == 1) {
			if (me == 2) System.out.println("내가 이겼다");
			else if (me == 0) System.out.println("내가 졌다");
			else System.out.println("비겼다");
		}
		else if (com == 2) {
			if (me == 0) System.out.println("내가 이겼다");
			else if (me == 1) System.out.println("내가 졌다");
			else System.out.println("비겼다");
		}
		
		
	}

}
