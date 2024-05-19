package step1_05.controlStatement;

import java.util.Random;

/**
 * 24-05-18
 * if문 369게임[1단계]: 이체하기
 * @author 윤성희
 *
 */
/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */

public class IfEx21_풀이4 {

	public static void main(String[] args) {
		Random ran = new Random();
		int ranNum = ran.nextInt(50) + 1;
		
		System.out.println("369게임");
		System.out.print(ranNum + " : " );
		int cnt = 0;
		if(ranNum / 10 == 3 || ranNum / 10 == 6 || ranNum / 10 == 9) cnt++;
		if(ranNum % 10 == 3 || ranNum % 10 == 6 || ranNum % 10 == 9) cnt++;
		
		if (cnt == 2) System.out.print("짝짝");
		else if (cnt == 1) System.out.print("짝");
		else System.out.print(ranNum);
		
		
	}

}
