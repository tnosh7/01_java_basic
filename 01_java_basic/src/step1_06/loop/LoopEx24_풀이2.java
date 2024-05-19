package step1_06.loop;

import java.util.Random;

/**
* 24-05-19
* for 랜덤학생
* @author 윤성희
*
*/
/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx24_풀이2 {

	public static void main(String[] args) {
		Random ran = new Random();
		int sum      = 0;
		int maxNum   = 0;
		int maxScore = 0;
		int cnt      = 0;
		for (int i = 0; i < 10; i++) {
			int score = ran.nextInt(100) + 1;
			if (score >= 60) cnt++;
			sum += score;
			if (maxScore < score) {
				maxNum = i;
				maxScore = score;
			}
			System.out.print(score + " ");
		}
		
		System.out.println("\n전교생(10명) 총점 : " + sum +"점, 평균 : " + sum / 10.0 + "점" );
		System.out.println("합격자 수 : " + cnt + "명");
		System.out.println("1등 학생 번호 : " + maxNum + "\t성적 : " + maxScore + "점");
		
	}

}
