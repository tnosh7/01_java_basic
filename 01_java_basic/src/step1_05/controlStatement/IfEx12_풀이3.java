package step1_05.controlStatement;

import java.util.Scanner;
//23-01-30 13:45 ~ 13:47
/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_풀이3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자1 입력 : ");
		int num2 = scan.nextInt();
		System.out.print("숫자1 입력 : ");
		int num3 = scan.nextInt();
		int max = 0;
		if (max < num1) {
			max = num1; 
			if(max < num2) max = num2;
			if(max < num3) max = num3;
		}
		System.out.println("Max :" + max);
	}
	

}
