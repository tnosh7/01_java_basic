package step1_06.loop;

import java.util.Scanner;

/**
* 24-05-19
* while 최대값 구하기[2단계]
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

public class LoopEx14_풀이3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int i = 0;
		while (i < 3) {
			System.out.print( "정수 입력 : ");
			int num = scan.nextInt();
			
			if (num > max) max = num;
			i++;
		}
		System.out.println("가장 큰 값 : " + max);
	}

}

