package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = scan.nextInt();
		System.out.print("정수 2 : ");
		int num2 = scan.nextInt();
		System.out.print("정수 3 : ");
		int num3 = scan.nextInt();
		
		int  maxNum = num1 ; 
		
		if (maxNum < num2) {
			num2 = maxNum ; 
		}
		if (maxNum < num3) {
			num3 = maxNum ; 
		}
		scan.close();
	}

}
