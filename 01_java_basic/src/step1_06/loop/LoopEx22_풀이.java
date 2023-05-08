package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx22_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ; 
		Random ran = new Random();
		
		int answer = ran.nextInt(100) + 1 ;
		int cnt = 0;
		int score = 100;
		System.out.println("==up & down==");
		
		for (int i = 0;;i++) {
			System.out.println("[1~100]선택 = ");
			int myAnswer = scan.nextInt(); 

			if (myAnswer > answer) {
				System.out.println("Down!");
				cnt++;
			}
			else if (myAnswer < answer) { 
				System.out.println("Up!");
				cnt++; 
			}
			else if (myAnswer==answer) {
				System.out.println("정답!");
				break; 
			}
		}
		 
		System.out.println("점수 = " + (score-cnt*5) + "점" );
	
		
	}

}
