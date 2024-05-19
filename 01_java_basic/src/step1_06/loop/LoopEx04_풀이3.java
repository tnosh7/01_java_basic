package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/**
 * 24-05-19
 * while 구구단 게임[3단계]
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


public class LoopEx04_풀이3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int i = 0;
		int cnt = 0;
		while (i < 5) {
			int ranNum1 = ran.nextInt(9) + 1;
			int ranNum2 = ran.nextInt(9) + 1;
			int answer = ranNum1 * ranNum2;
			System.out.println("구구단 게임");
			System.out.println(ranNum1 + " X " + ranNum2 + " = ? ");
			System.out.print("정답 : ");
			int myAnswer = scan.nextInt();
			if (myAnswer == answer) cnt++;
			i++;
		}
		System.out.println("성적 : " + cnt * 20);

	}

}
