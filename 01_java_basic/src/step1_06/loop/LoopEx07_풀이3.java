package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/**
 * 24-05-19
 * while Up & Down 게임[2단계]
 * @author 윤성희
 *
 */
/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_풀이3 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("====정답 맞추기 게임====");
		int ranNum = ran.nextInt(100) + 1;
		System.out.println(ranNum);
		int cnt = 0;
		int i = 0;
		while (i < 20) {
			System.out.print("정답을 입력하세요 : ");
			int myAnswer = scan.nextInt();
			
			if (myAnswer > ranNum) System.out.println("Down!");
			else if (myAnswer < ranNum) System.out.println("UP!");
			else {
				System.out.println("Bingo!");
				break;
			}
			i++;
			cnt++;
		}
		int score = 100 - (cnt * 5);
		System.out.println("점수 : " + score + "점");
		
		
		
		
	}

}
