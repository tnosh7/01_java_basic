package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */
/**
 * 24-05-10
 * @author 윤성희
 * 중첩if문 연습문제4
 */


public class IfEx12_풀이4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 3개를 입력하세요");
		System.out.print("숫자1 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자2 : ");
		int num2 = scan.nextInt();
		System.out.print("숫자3 : ");
		int num3 = scan.nextInt();
	
		// 풀이1 
		if (num2 < num1 && num1 > num3) System.out.println("가장 큰 수는 숫자1 : " + num1);
		if (num1 < num2 && num2 > num3) System.out.println("가장 큰 수는 숫자2 : " + num2);
		if (num1 < num3 && num3 > num2) System.out.println("가장 큰 수는 숫자3 : " + num3);
		
		// 풀이2 
		int max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.println("최대값 : " + max);
		
		scan.close();
	}

}
