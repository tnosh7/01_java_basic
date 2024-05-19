package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/**
* 24-05-19
* for 구구단 게임[3단계]
* @author 윤성희
*
*/
/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

public class LoopEx21_풀이2 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		System.out.println("===구구단 게임===");
		for (int i = 0; i < 5; i++) {
			int num1 = ran.nextInt(9)+1;
			int num2 = ran.nextInt(9)+1;
			System.out.println(num1 + " X " + num2 + " = ? ");
			int myAnswer = scan.nextInt();
			
			int answer = num1 * num2;
			if (myAnswer == answer) cnt++;
		}
		System.out.println("성적 : " + cnt * 20 + "점");
		
	}

}
