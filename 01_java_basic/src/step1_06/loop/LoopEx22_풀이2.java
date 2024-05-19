package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/**
* 24-05-19
* for Up & Down 게임[2단계]
* @author 윤성희
*
*/
/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx22_풀이2 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int num = ran.nextInt(50) + 1;
		System.out.println(num);
		int cnt = 0;
		for (int i = 0; i < 20; i++) {
			System.out.print("정답 입력(1~50) : ");
			int answer = scan.nextInt();
			if (answer > num) System.out.println("Down!");
			else if (answer < num) System.out.println("Up!");
			else break;
			cnt++;
		}
		System.out.println("점수 : " + (100 - (cnt * 5)));
	}

}
