package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

//23-08-21 16:28 ~ 16:33;
/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_풀이2 {

	public static void main(String[] args) {
	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		boolean isRunning = true;
		int score = 100;
		
		while(isRunning) {
			if (score == 0) isRunning = false;
			int r = ran.nextInt(100) + 1;
			System.out.println(r);
			System.out.print("정답 : ");
			int answer = scan.nextInt();
			if (answer == r) {
				break;
			}
			score -= 5;
			
		}
		System.out.println("게임종료\n점수 : " + score + "점");
		
	}

}
