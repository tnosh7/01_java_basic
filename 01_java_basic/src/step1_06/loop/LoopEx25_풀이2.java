package step1_06.loop;

import java.util.Scanner;

/**
* 24-05-19
* for 최대값 구하기[2단계]
* @author 윤성희
*
*/
/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

public class LoopEx25_풀이2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int max = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("값 입력 : ");
			int num = scan.nextInt();
			if (max < num) max = num;
		}
		System.out.println("최대값 : " + max);
		scan.close();
	}

}
