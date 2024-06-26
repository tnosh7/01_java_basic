package step1_06.loop;

import java.util.Random;

/**
* 24-05-19
* while 랜덤학생
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

public class LoopEx15_풀이3 {

	public static void main(String[] args) {
		Random ran = new Random();
		int sum = 0;
		int maxNum = 0;
		int maxScore = 0;
		int cnt = 0;
		int i = 1;
		while (i < 11) {
			int score = ran.nextInt(100) + 1;
			System.out.print(score + " ");
			sum += score;

			if (maxScore < score) {
				maxNum   = i ;
				maxScore = score;
			}
			if (score >= 60) cnt++;
			
			i++;
		}
		System.out.println("\n전교생 총점 : " + sum );
		System.out.println("전교생 평균 : " + sum / 10.0);
		System.out.println("합격자 수 :  " + cnt);
		System.out.println("[1등 학생] 번호 : " + maxNum + " 성적 : " + maxScore);
		
		
	}

}
